package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.ApplyerPerson;
import com.weiboinfo.rsjBaseService.entry.ApplyerPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyerPersonMapper {
    int countByExample(ApplyerPersonExample example);

    int deleteByExample(ApplyerPersonExample example);

    int deleteByPrimaryKey(String apid);

    int insert(ApplyerPerson record);

    int insertSelective(ApplyerPerson record);

    List<ApplyerPerson> selectByExample(ApplyerPersonExample example);

    ApplyerPerson selectByPrimaryKey(String apid);

    int updateByExampleSelective(@Param("record") ApplyerPerson record, @Param("example") ApplyerPersonExample example);

    int updateByExample(@Param("record") ApplyerPerson record, @Param("example") ApplyerPersonExample example);

    int updateByPrimaryKeySelective(ApplyerPerson record);

    int updateByPrimaryKey(ApplyerPerson record);
}