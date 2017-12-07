package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.FrmRoleGroup;
import com.weiboinfo.rsjBaseService.entry.FrmRoleGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrmRoleGroupMapper {
    int countByExample(FrmRoleGroupExample example);

    int deleteByExample(FrmRoleGroupExample example);

    int deleteByPrimaryKey(String rolegroupid);

    int insert(FrmRoleGroup record);

    int insertSelective(FrmRoleGroup record);

    List<FrmRoleGroup> selectByExample(FrmRoleGroupExample example);

    FrmRoleGroup selectByPrimaryKey(String rolegroupid);

    int updateByExampleSelective(@Param("record") FrmRoleGroup record, @Param("example") FrmRoleGroupExample example);

    int updateByExample(@Param("record") FrmRoleGroup record, @Param("example") FrmRoleGroupExample example);

    int updateByPrimaryKeySelective(FrmRoleGroup record);

    int updateByPrimaryKey(FrmRoleGroup record);
}