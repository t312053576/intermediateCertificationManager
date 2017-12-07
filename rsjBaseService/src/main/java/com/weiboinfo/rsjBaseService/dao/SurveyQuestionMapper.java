package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.SurveyQuestion;
import com.weiboinfo.rsjBaseService.entry.SurveyQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyQuestionMapper {
    int countByExample(SurveyQuestionExample example);

    int deleteByExample(SurveyQuestionExample example);

    int deleteByPrimaryKey(String qId);

    int insert(SurveyQuestion record);

    int insertSelective(SurveyQuestion record);

    List<SurveyQuestion> selectByExample(SurveyQuestionExample example);

    SurveyQuestion selectByPrimaryKey(String qId);

    int updateByExampleSelective(@Param("record") SurveyQuestion record, @Param("example") SurveyQuestionExample example);

    int updateByExample(@Param("record") SurveyQuestion record, @Param("example") SurveyQuestionExample example);

    int updateByPrimaryKeySelective(SurveyQuestion record);

    int updateByPrimaryKey(SurveyQuestion record);
}