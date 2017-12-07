package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.FrmRoleUser;
import com.weiboinfo.rsjBaseService.entry.FrmRoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrmRoleUserMapper {
    int countByExample(FrmRoleUserExample example);

    int deleteByExample(FrmRoleUserExample example);

    int deleteByPrimaryKey(String roleuserid);

    int insert(FrmRoleUser record);

    int insertSelective(FrmRoleUser record);

    List<FrmRoleUser> selectByExample(FrmRoleUserExample example);

    FrmRoleUser selectByPrimaryKey(String roleuserid);

    int updateByExampleSelective(@Param("record") FrmRoleUser record, @Param("example") FrmRoleUserExample example);

    int updateByExample(@Param("record") FrmRoleUser record, @Param("example") FrmRoleUserExample example);

    int updateByPrimaryKeySelective(FrmRoleUser record);

    int updateByPrimaryKey(FrmRoleUser record);
}