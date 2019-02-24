package com.wordland.dao;

import com.wordland.model.CET6Word;
import com.wordland.model.CET6WordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CET6WordMapper {
    int countByExample(CET6WordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CET6Word record);

    int insertSelective(CET6Word record);

    List<CET6Word> selectByExample(CET6WordExample example);

    CET6Word selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CET6Word record, @Param("example") CET6WordExample example);

    int updateByExample(@Param("record") CET6Word record, @Param("example") CET6WordExample example);

    int updateByPrimaryKeySelective(CET6Word record);

    int updateByPrimaryKey(CET6Word record);
}