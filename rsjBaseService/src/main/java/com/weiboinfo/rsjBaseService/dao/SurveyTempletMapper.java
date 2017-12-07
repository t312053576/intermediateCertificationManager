package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.SurveyTemplet;
import com.weiboinfo.rsjBaseService.entry.SurveyTempletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyTempletMapper {
    int countByExample(SurveyTempletExample example);

    int deleteByExample(SurveyTempletExample example);

    int deleteByPrimaryKey(String templetId);

    int insert(SurveyTemplet record);

    int insertSelective(SurveyTemplet record);

    List<SurveyTemplet> selectByExampleWithBLOBs(SurveyTempletExample example);

    List<SurveyTemplet> selectByExample(SurveyTempletExample example);

    SurveyTemplet selectByPrimaryKey(String templetId);

    int updateByExampleSelective(@Param("record") SurveyTemplet record, @Param("example") SurveyTempletExample example);

    int updateByExampleWithBLOBs(@Param("record") SurveyTemplet record, @Param("example") SurveyTempletExample example);

    int updateByExample(@Param("record") SurveyTemplet record, @Param("example") SurveyTempletExample example);

    int updateByPrimaryKeySelective(SurveyTemplet record);

    int updateByPrimaryKeyWithBLOBs(SurveyTemplet record);

    int updateByPrimaryKey(SurveyTemplet record);
}