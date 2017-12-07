package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.TemplateFile;
import com.weiboinfo.rsjBaseService.entry.TemplateFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateFileMapper {
    int countByExample(TemplateFileExample example);

    int deleteByExample(TemplateFileExample example);

    int deleteByPrimaryKey(String id);

    int insert(TemplateFile record);

    int insertSelective(TemplateFile record);

    List<TemplateFile> selectByExample(TemplateFileExample example);

    TemplateFile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TemplateFile record, @Param("example") TemplateFileExample example);

    int updateByExample(@Param("record") TemplateFile record, @Param("example") TemplateFileExample example);

    int updateByPrimaryKeySelective(TemplateFile record);

    int updateByPrimaryKey(TemplateFile record);
}