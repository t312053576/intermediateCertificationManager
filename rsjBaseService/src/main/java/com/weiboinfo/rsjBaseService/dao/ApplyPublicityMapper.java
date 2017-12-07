package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.ApplyPublicity;
import com.weiboinfo.rsjBaseService.entry.ApplyPublicityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyPublicityMapper {
    int countByExample(ApplyPublicityExample example);

    int deleteByExample(ApplyPublicityExample example);

    int deleteByPrimaryKey(String aid);

    int insert(ApplyPublicity record);

    int insertSelective(ApplyPublicity record);

    List<ApplyPublicity> selectByExample(ApplyPublicityExample example);

    ApplyPublicity selectByPrimaryKey(String aid);

    int updateByExampleSelective(@Param("record") ApplyPublicity record, @Param("example") ApplyPublicityExample example);

    int updateByExample(@Param("record") ApplyPublicity record, @Param("example") ApplyPublicityExample example);

    int updateByPrimaryKeySelective(ApplyPublicity record);

    int updateByPrimaryKey(ApplyPublicity record);
}