package com.weiboinfo.rsjBaseService.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.weiboinfo.rsjBaseService.entry.FrmRoleFunction;
import com.weiboinfo.rsjBaseService.entry.FrmRoleFunctionExample;

public interface FrmRoleFunctionMapper {
    int countByExample(FrmRoleFunctionExample example);

    int deleteByExample(FrmRoleFunctionExample example);

    int deleteByPrimaryKey(String rolefunid);

    int insert(FrmRoleFunction record);

    int insertSelective(FrmRoleFunction record);

    List<FrmRoleFunction> selectByExample(FrmRoleFunctionExample example);

    FrmRoleFunction selectByPrimaryKey(String rolefunid);

    int updateByExampleSelective(@Param("record") FrmRoleFunction record, @Param("example") FrmRoleFunctionExample example);

    int updateByExample(@Param("record") FrmRoleFunction record, @Param("example") FrmRoleFunctionExample example);

    int updateByPrimaryKeySelective(FrmRoleFunction record);

    int updateByPrimaryKey(FrmRoleFunction record);
}