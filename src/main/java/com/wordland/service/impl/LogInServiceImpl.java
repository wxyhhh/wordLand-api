package com.wordland.service.impl;

import com.wordland.dao.AccountMapper;
import com.wordland.dao.AuthUserMapper;
import com.wordland.model.Account;
import com.wordland.model.AccountExample;
import com.wordland.model.AuthUser;
import com.wordland.model.AuthUserExample;
import com.wordland.service.LogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.nio.charset.Charset;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@Service
public class LogInServiceImpl implements LogInService {
    @Autowired
    private AuthUserMapper authUserMapper;

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Integer checkLogIn(String email, String password){
        System.out.println(email + password);
        AuthUserExample example = new AuthUserExample();
        example.or().andUsernameEqualTo(email);
        List<AuthUser> users = authUserMapper.selectByExample(example);
        if(users.size() == 0){
            return 1036;
        }
        else{
            AuthUser user = users.get(0);
            String cipherText = user.getPassword();
            String Algorithm = cipherText.split("\\$")[0];
            Integer iteration = Integer.valueOf(cipherText.split("\\$")[1]);
            String salt = cipherText.split("\\$")[2];
            String content = cipherText.split("\\$")[3];
            SecretKeyFactory keyFactory = null;
            try {
                keyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            } catch (NoSuchAlgorithmException e) {
                System.err.println("Could NOT retrieve PBKDF2WithHmacSHA256 algorithm");
                System.exit(1);
            }
            KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt.getBytes(Charset.forName("UTF-8")), iteration, 256);
            SecretKey secret = null;
            try {
                secret = keyFactory.generateSecret(keySpec);
            } catch (InvalidKeySpecException e) {
                System.out.println("Could NOT generate secret key");
                e.printStackTrace();
            }

            byte[] rawHash = secret.getEncoded();
            byte[] hashBase64 = Base64.getEncoder().encode(rawHash);

            String result = new String(hashBase64);
            System.out.println(result);
            if(result.equals(content)){
                return 200;
            }
            else{
                return 1305;
            }
        }
    }

    private static String getSalt(){
        int length = 12;
        Random rand = new Random();
        char[] rs = new char[length];
        for(int i = 0; i < length; i++){
            int t = rand.nextInt(3);
            if (t == 0) {
                rs[i] = (char)(rand.nextInt(10)+48);
            } else if (t == 1) {
                rs[i] = (char)(rand.nextInt(26)+65);
            } else {
                rs[i] = (char)(rand.nextInt(26)+97);
            }
        }
        return new String(rs);
    }

    @Override
    public HashMap<String, Object> doLogIn(String email){
        AuthUserExample example1 = new AuthUserExample();
        example1.or().andUsernameEqualTo(email);
        Integer userId = authUserMapper.selectByExample(example1).get(0).getId();
        AccountExample example2 = new AccountExample();
        example2.or().andAccountUserIdEqualTo(userId);
        List<Account> list = accountMapper.selectByExample(example2);
        if(list.size() == 0)
        {
            return null;
        }
        else{
            HashMap<String, Object> result = new HashMap<>();
            result.put("name", list.get(0).getAccountNickname());
            result.put("setting", list.get(0).getAccountSetting());
            return result;
        }
    }

}
