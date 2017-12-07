package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.SurveyAdmins;
import com.weiboinfo.rsjBaseService.entry.SurveyAdminsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyAdminsMapper {
    int countByExample(SurveyAdminsExample example);

    int deleteByExample(SurveyAdminsExample example);

    int deleteByPrimaryKey(String aId);

    int insert(SurveyAdmins record);

    int insertSelective(SurveyAdmins record);

    List<SurveyAdmins> selectByExample(SurveyAdminsExample example);

    SurveyAdmins selectByPrimaryKey(String aId);

    int updateByExampleSelective(@Param("record") SurveyAdmins record, @Param("example") SurveyAdminsExample example);

    int updateByExample(@Param("record") SurveyAdmins record, @Param("example") SurveyAdminsExample example);

    int updateByPrimaryKeySelective(SurveyAdmins record);

    int updateByPrimaryKey(SurveyAdmins record);
}