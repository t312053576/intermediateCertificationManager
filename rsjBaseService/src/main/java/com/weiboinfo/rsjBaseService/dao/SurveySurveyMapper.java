package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.SurveySurvey;
import com.weiboinfo.rsjBaseService.entry.SurveySurveyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveySurveyMapper {
    int countByExample(SurveySurveyExample example);

    int deleteByExample(SurveySurveyExample example);

    int deleteByPrimaryKey(String sId);

    int insert(SurveySurvey record);

    int insertSelective(SurveySurvey record);

    List<SurveySurvey> selectByExample(SurveySurveyExample example);

    SurveySurvey selectByPrimaryKey(String sId);

    int updateByExampleSelective(@Param("record") SurveySurvey record, @Param("example") SurveySurveyExample example);

    int updateByExample(@Param("record") SurveySurvey record, @Param("example") SurveySurveyExample example);

    int updateByPrimaryKeySelective(SurveySurvey record);

    int updateByPrimaryKey(SurveySurvey record);
}