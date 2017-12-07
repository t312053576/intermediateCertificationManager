package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.FrmSecondFunctionUser;
import com.weiboinfo.rsjBaseService.entry.FrmSecondFunctionUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrmSecondFunctionUserMapper {
    int countByExample(FrmSecondFunctionUserExample example);

    int deleteByExample(FrmSecondFunctionUserExample example);

    int deleteByPrimaryKey(String secondfunctionuserid);

    int insert(FrmSecondFunctionUser record);

    int insertSelective(FrmSecondFunctionUser record);

    List<FrmSecondFunctionUser> selectByExample(FrmSecondFunctionUserExample example);

    FrmSecondFunctionUser selectByPrimaryKey(String secondfunctionuserid);

    int updateByExampleSelective(@Param("record") FrmSecondFunctionUser record, @Param("example") FrmSecondFunctionUserExample example);

    int updateByExample(@Param("record") FrmSecondFunctionUser record, @Param("example") FrmSecondFunctionUserExample example);

    int updateByPrimaryKeySelective(FrmSecondFunctionUser record);

    int updateByPrimaryKey(FrmSecondFunctionUser record);
}