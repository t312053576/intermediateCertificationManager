package com.weiboinfo.rsjBaseService.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.weiboinfo.rsjBaseService.entry.FrmFunctionCell;
import com.weiboinfo.rsjBaseService.entry.FrmFunctionCellExample;

public interface FrmFunctionCellMapper {
    int countByExample(FrmFunctionCellExample example);

    int deleteByExample(FrmFunctionCellExample example);

    int deleteByPrimaryKey(String fuceid);

    int insert(FrmFunctionCell record);

    int insertSelective(FrmFunctionCell record);

    List<FrmFunctionCell> selectByExample(FrmFunctionCellExample example);

    FrmFunctionCell selectByPrimaryKey(String fuceid);

    int updateByExampleSelective(@Param("record") FrmFunctionCell record, @Param("example") FrmFunctionCellExample example);

    int updateByExample(@Param("record") FrmFunctionCell record, @Param("example") FrmFunctionCellExample example);

    int updateByPrimaryKeySelective(FrmFunctionCell record);

    int updateByPrimaryKey(FrmFunctionCell record);
}