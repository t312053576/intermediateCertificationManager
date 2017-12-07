package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.TemplateBak;
import com.weiboinfo.rsjBaseService.entry.TemplateBakExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateBakMapper {
    int countByExample(TemplateBakExample example);

    int deleteByExample(TemplateBakExample example);

    int deleteByPrimaryKey(String id);

    int insert(TemplateBak record);

    int insertSelective(TemplateBak record);

    List<TemplateBak> selectByExample(TemplateBakExample example);

    TemplateBak selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TemplateBak record, @Param("example") TemplateBakExample example);

    int updateByExample(@Param("record") TemplateBak record, @Param("example") TemplateBakExample example);

    int updateByPrimaryKeySelective(TemplateBak record);

    int updateByPrimaryKey(TemplateBak record);
}