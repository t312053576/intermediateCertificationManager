package com.weiboinfo.rsjBaseService.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.weiboinfo.rsjBaseService.entry.FrmManageTable;
import com.weiboinfo.rsjBaseService.entry.FrmManageTableExample;

public interface FrmManageTableMapper {
    int countByExample(FrmManageTableExample example);

    int deleteByExample(FrmManageTableExample example);

    int deleteByPrimaryKey(String tableid);

    int insert(FrmManageTable record);

    int insertSelective(FrmManageTable record);

    List<FrmManageTable> selectByExample(FrmManageTableExample example);

    FrmManageTable selectByPrimaryKey(String tableid);

    int updateByExampleSelective(@Param("record") FrmManageTable record, @Param("example") FrmManageTableExample example);

    int updateByExample(@Param("record") FrmManageTable record, @Param("example") FrmManageTableExample example);

    int updateByPrimaryKeySelective(FrmManageTable record);

    int updateByPrimaryKey(FrmManageTable record);
}