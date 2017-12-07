package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.SurveyLink;
import com.weiboinfo.rsjBaseService.entry.SurveyLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyLinkMapper {
    int countByExample(SurveyLinkExample example);

    int deleteByExample(SurveyLinkExample example);

    int deleteByPrimaryKey(String lId);

    int insert(SurveyLink record);

    int insertSelective(SurveyLink record);

    List<SurveyLink> selectByExample(SurveyLinkExample example);

    SurveyLink selectByPrimaryKey(String lId);

    int updateByExampleSelective(@Param("record") SurveyLink record, @Param("example") SurveyLinkExample example);

    int updateByExample(@Param("record") SurveyLink record, @Param("example") SurveyLinkExample example);

    int updateByPrimaryKeySelective(SurveyLink record);

    int updateByPrimaryKey(SurveyLink record);
}