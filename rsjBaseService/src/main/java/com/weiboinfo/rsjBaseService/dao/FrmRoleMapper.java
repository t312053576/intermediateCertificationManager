package com.weiboinfo.rsjBaseService.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.weiboinfo.rsjBaseService.entry.FrmRole;
import com.weiboinfo.rsjBaseService.entry.FrmRoleExample;

public interface FrmRoleMapper {
    int countByExample(FrmRoleExample example);

    int deleteByExample(FrmRoleExample example);

    int deleteByPrimaryKey(String roleid);

    int insert(FrmRole record);

    int insertSelective(FrmRole record);

    List<FrmRole> selectByExample(FrmRoleExample example);

    FrmRole selectByPrimaryKey(String roleid);

    int updateByExampleSelective(@Param("record") FrmRole record, @Param("example") FrmRoleExample example);

    int updateByExample(@Param("record") FrmRole record, @Param("example") FrmRoleExample example);

    int updateByPrimaryKeySelective(FrmRole record);

    int updateByPrimaryKey(FrmRole record);
}