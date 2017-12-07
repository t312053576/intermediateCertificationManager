package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.ZZDTemplateType;
import com.weiboinfo.rsjBaseService.entry.ZZDTemplateTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZZDTemplateTypeMapper {
    int countByExample(ZZDTemplateTypeExample example);

    int deleteByExample(ZZDTemplateTypeExample example);

    int deleteByPrimaryKey(String dm);

    int insert(ZZDTemplateType record);

    int insertSelective(ZZDTemplateType record);

    List<ZZDTemplateType> selectByExample(ZZDTemplateTypeExample example);

    ZZDTemplateType selectByPrimaryKey(String dm);

    int updateByExampleSelective(@Param("record") ZZDTemplateType record, @Param("example") ZZDTemplateTypeExample example);

    int updateByExample(@Param("record") ZZDTemplateType record, @Param("example") ZZDTemplateTypeExample example);

    int updateByPrimaryKeySelective(ZZDTemplateType record);

    int updateByPrimaryKey(ZZDTemplateType record);
}