package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.ZZDType;
import com.weiboinfo.rsjBaseService.entry.ZZDTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZZDTypeMapper {
    int countByExample(ZZDTypeExample example);

    int deleteByExample(ZZDTypeExample example);

    int deleteByPrimaryKey(String dm);

    int insert(ZZDType record);

    int insertSelective(ZZDType record);

    List<ZZDType> selectByExample(ZZDTypeExample example);

    ZZDType selectByPrimaryKey(String dm);

    int updateByExampleSelective(@Param("record") ZZDType record, @Param("example") ZZDTypeExample example);

    int updateByExample(@Param("record") ZZDType record, @Param("example") ZZDTypeExample example);

    int updateByPrimaryKeySelective(ZZDType record);

    int updateByPrimaryKey(ZZDType record);
}