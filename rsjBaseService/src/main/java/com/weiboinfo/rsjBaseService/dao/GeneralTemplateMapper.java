package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.GeneralTemplate;
import com.weiboinfo.rsjBaseService.entry.GeneralTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneralTemplateMapper {
    int countByExample(GeneralTemplateExample example);

    int deleteByExample(GeneralTemplateExample example);

    int insert(GeneralTemplate record);

    int insertSelective(GeneralTemplate record);

    List<GeneralTemplate> selectByExample(GeneralTemplateExample example);

    int updateByExampleSelective(@Param("record") GeneralTemplate record, @Param("example") GeneralTemplateExample example);

    int updateByExample(@Param("record") GeneralTemplate record, @Param("example") GeneralTemplateExample example);
}