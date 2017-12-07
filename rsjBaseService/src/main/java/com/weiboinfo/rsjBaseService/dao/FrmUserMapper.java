package com.weiboinfo.rsjBaseService.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.weiboinfo.rsjBaseService.entry.FrmUser;
import com.weiboinfo.rsjBaseService.entry.FrmUserExample;

public interface FrmUserMapper {
    int countByExample(FrmUserExample example);

    int deleteByExample(FrmUserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(FrmUser record);

    int insertSelective(FrmUser record);

    List<FrmUser> selectByExample(FrmUserExample example);

    FrmUser selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") FrmUser record, @Param("example") FrmUserExample example);

    int updateByExample(@Param("record") FrmUser record, @Param("example") FrmUserExample example);

    int updateByPrimaryKeySelective(FrmUser record);

    int updateByPrimaryKey(FrmUser record);
}