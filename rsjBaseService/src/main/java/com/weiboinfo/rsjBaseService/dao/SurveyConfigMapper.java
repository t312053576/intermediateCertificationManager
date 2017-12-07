package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.SurveyConfig;
import com.weiboinfo.rsjBaseService.entry.SurveyConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyConfigMapper {
    int countByExample(SurveyConfigExample example);

    int deleteByExample(SurveyConfigExample example);

    int deleteByPrimaryKey(String id);

    int insert(SurveyConfig record);

    int insertSelective(SurveyConfig record);

    List<SurveyConfig> selectByExample(SurveyConfigExample example);

    SurveyConfig selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SurveyConfig record, @Param("example") SurveyConfigExample example);

    int updateByExample(@Param("record") SurveyConfig record, @Param("example") SurveyConfigExample example);

    int updateByPrimaryKeySelective(SurveyConfig record);

    int updateByPrimaryKey(SurveyConfig record);
}