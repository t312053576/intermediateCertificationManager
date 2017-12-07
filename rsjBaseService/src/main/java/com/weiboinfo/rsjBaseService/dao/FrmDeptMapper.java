package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.FrmDept;
import com.weiboinfo.rsjBaseService.entry.FrmDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrmDeptMapper {
    int countByExample(FrmDeptExample example);

    int deleteByExample(FrmDeptExample example);

    int deleteByPrimaryKey(String xx0301id);

    int insert(FrmDept record);

    int insertSelective(FrmDept record);

    List<FrmDept> selectByExample(FrmDeptExample example);

    FrmDept selectByPrimaryKey(String xx0301id);

    int updateByExampleSelective(@Param("record") FrmDept record, @Param("example") FrmDeptExample example);

    int updateByExample(@Param("record") FrmDept record, @Param("example") FrmDeptExample example);

    int updateByPrimaryKeySelective(FrmDept record);

    int updateByPrimaryKey(FrmDept record);
}