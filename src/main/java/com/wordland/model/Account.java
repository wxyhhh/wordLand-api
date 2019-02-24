package com.wordland.model;

import java.util.Date;

public class Account {
    private Integer id;

    private String accountNickname;

    private Integer accountCet4;

    private Integer accountCet4Today;

    private Integer accountCet6;

    private Integer accountCet6Today;

    private Integer accountCounter;

    private Date accountTime;

    private Integer accountUserId;

    private Integer accountSetting;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNickname() {
        return accountNickname;
    }

    public void setAccountNickname(String accountNickname) {
        this.accountNickname = accountNickname == null ? null : accountNickname.trim();
    }

    public Integer getAccountCet4() {
        return accountCet4;
    }

    public void setAccountCet4(Integer accountCet4) {
        this.accountCet4 = accountCet4;
    }

    public Integer getAccountCet4Today() {
        return accountCet4Today;
    }

    public void setAccountCet4Today(Integer accountCet4Today) {
        this.accountCet4Today = accountCet4Today;
    }

    public Integer getAccountCet6() {
        return accountCet6;
    }

    public void setAccountCet6(Integer accountCet6) {
        this.accountCet6 = accountCet6;
    }

    public Integer getAccountCet6Today() {
        return accountCet6Today;
    }

    public void setAccountCet6Today(Integer accountCet6Today) {
        this.accountCet6Today = accountCet6Today;
    }

    public Integer getAccountCounter() {
        return accountCounter;
    }

    public void setAccountCounter(Integer accountCounter) {
        this.accountCounter = accountCounter;
    }

    public Date getAccountTime() {
        return accountTime;
    }

    public void setAccountTime(Date accountTime) {
        this.accountTime = accountTime;
    }

    public Integer getAccountUserId() {
        return accountUserId;
    }

    public void setAccountUserId(Integer accountUserId) {
        this.accountUserId = accountUserId;
    }

    public Integer getAccountSetting() {
        return accountSetting;
    }

    public void setAccountSetting(Integer accountSetting) {
        this.accountSetting = accountSetting;
    }
}