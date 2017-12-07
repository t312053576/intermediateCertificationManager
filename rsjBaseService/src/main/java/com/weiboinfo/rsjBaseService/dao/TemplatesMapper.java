package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.Templates;
import com.weiboinfo.rsjBaseService.entry.TemplatesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplatesMapper {
    int countByExample(TemplatesExample example);

    int deleteByExample(TemplatesExample example);

    int deleteByPrimaryKey(String tid);

    int insert(Templates record);

    int insertSelective(Templates record);

    List<Templates> selectByExample(TemplatesExample example);

    Templates selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") Templates record, @Param("example") TemplatesExample example);

    int updateByExample(@Param("record") Templates record, @Param("example") TemplatesExample example);

    int updateByPrimaryKeySelective(Templates record);

    int updateByPrimaryKey(Templates record);
}