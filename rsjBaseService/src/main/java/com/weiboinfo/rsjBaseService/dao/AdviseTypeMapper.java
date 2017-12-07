package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.AdviseType;
import com.weiboinfo.rsjBaseService.entry.AdviseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdviseTypeMapper {
    int countByExample(AdviseTypeExample example);

    int deleteByExample(AdviseTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(AdviseType record);

    int insertSelective(AdviseType record);

    List<AdviseType> selectByExample(AdviseTypeExample example);

    AdviseType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AdviseType record, @Param("example") AdviseTypeExample example);

    int updateByExample(@Param("record") AdviseType record, @Param("example") AdviseTypeExample example);

    int updateByPrimaryKeySelective(AdviseType record);

    int updateByPrimaryKey(AdviseType record);
}