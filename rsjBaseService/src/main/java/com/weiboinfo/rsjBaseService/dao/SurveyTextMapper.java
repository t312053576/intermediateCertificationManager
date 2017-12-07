package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.SurveyText;
import com.weiboinfo.rsjBaseService.entry.SurveyTextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyTextMapper {
    int countByExample(SurveyTextExample example);

    int deleteByExample(SurveyTextExample example);

    int deleteByPrimaryKey(String tId);

    int insert(SurveyText record);

    int insertSelective(SurveyText record);

    List<SurveyText> selectByExample(SurveyTextExample example);

    SurveyText selectByPrimaryKey(String tId);

    int updateByExampleSelective(@Param("record") SurveyText record, @Param("example") SurveyTextExample example);

    int updateByExample(@Param("record") SurveyText record, @Param("example") SurveyTextExample example);

    int updateByPrimaryKeySelective(SurveyText record);

    int updateByPrimaryKey(SurveyText record);
}