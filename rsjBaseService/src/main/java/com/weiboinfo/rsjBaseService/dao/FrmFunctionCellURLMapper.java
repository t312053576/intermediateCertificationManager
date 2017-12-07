package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.FrmFunctionCellURL;
import com.weiboinfo.rsjBaseService.entry.FrmFunctionCellURLExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrmFunctionCellURLMapper {
    int countByExample(FrmFunctionCellURLExample example);

    int deleteByExample(FrmFunctionCellURLExample example);

    int deleteByPrimaryKey(String fuceurlid);

    int insert(FrmFunctionCellURL record);

    int insertSelective(FrmFunctionCellURL record);

    List<FrmFunctionCellURL> selectByExample(FrmFunctionCellURLExample example);

    FrmFunctionCellURL selectByPrimaryKey(String fuceurlid);

    int updateByExampleSelective(@Param("record") FrmFunctionCellURL record, @Param("example") FrmFunctionCellURLExample example);

    int updateByExample(@Param("record") FrmFunctionCellURL record, @Param("example") FrmFunctionCellURLExample example);

    int updateByPrimaryKeySelective(FrmFunctionCellURL record);

    int updateByPrimaryKey(FrmFunctionCellURL record);
}