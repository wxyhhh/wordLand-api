package com.wordland.dao;

import com.wordland.model.CET4Word;
import com.wordland.model.CET4WordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CET4WordMapper {
    int countByExample(CET4WordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CET4Word record);

    int insertSelective(CET4Word record);

    List<CET4Word> selectByExample(CET4WordExample example);

    CET4Word selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CET4Word record, @Param("example") CET4WordExample example);

    int updateByExample(@Param("record") CET4Word record, @Param("example") CET4WordExample example);

    int updateByPrimaryKeySelective(CET4Word record);

    int updateByPrimaryKey(CET4Word record);
}