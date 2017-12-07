package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.SurveyAnswerSheet;
import com.weiboinfo.rsjBaseService.entry.SurveyAnswerSheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyAnswerSheetMapper {
    int countByExample(SurveyAnswerSheetExample example);

    int deleteByExample(SurveyAnswerSheetExample example);

    int deleteByPrimaryKey(String asId);

    int insert(SurveyAnswerSheet record);

    int insertSelective(SurveyAnswerSheet record);

    List<SurveyAnswerSheet> selectByExample(SurveyAnswerSheetExample example);

    SurveyAnswerSheet selectByPrimaryKey(String asId);

    int updateByExampleSelective(@Param("record") SurveyAnswerSheet record, @Param("example") SurveyAnswerSheetExample example);

    int updateByExample(@Param("record") SurveyAnswerSheet record, @Param("example") SurveyAnswerSheetExample example);

    int updateByPrimaryKeySelective(SurveyAnswerSheet record);

    int updateByPrimaryKey(SurveyAnswerSheet record);
}