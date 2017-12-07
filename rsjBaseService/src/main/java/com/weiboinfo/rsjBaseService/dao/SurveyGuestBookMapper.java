package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.SurveyGuestBook;
import com.weiboinfo.rsjBaseService.entry.SurveyGuestBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyGuestBookMapper {
    int countByExample(SurveyGuestBookExample example);

    int deleteByExample(SurveyGuestBookExample example);

    int deleteByPrimaryKey(String gbId);

    int insert(SurveyGuestBook record);

    int insertSelective(SurveyGuestBook record);

    List<SurveyGuestBook> selectByExample(SurveyGuestBookExample example);

    SurveyGuestBook selectByPrimaryKey(String gbId);

    int updateByExampleSelective(@Param("record") SurveyGuestBook record, @Param("example") SurveyGuestBookExample example);

    int updateByExample(@Param("record") SurveyGuestBook record, @Param("example") SurveyGuestBookExample example);

    int updateByPrimaryKeySelective(SurveyGuestBook record);

    int updateByPrimaryKey(SurveyGuestBook record);
}