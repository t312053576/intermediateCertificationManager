package com.weiboinfo.rsjBaseService.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.weiboinfo.rsjBaseService.entry.FrmPurview;
import com.weiboinfo.rsjBaseService.entry.FrmPurviewExample;

public interface FrmPurviewMapper {
    int countByExample(FrmPurviewExample example);

    int deleteByExample(FrmPurviewExample example);

    int deleteByPrimaryKey(String purviewid);

    int insert(FrmPurview record);

    int insertSelective(FrmPurview record);

    List<FrmPurview> selectByExample(FrmPurviewExample example);

    FrmPurview selectByPrimaryKey(String purviewid);

    int updateByExampleSelective(@Param("record") FrmPurview record, @Param("example") FrmPurviewExample example);

    int updateByExample(@Param("record") FrmPurview record, @Param("example") FrmPurviewExample example);

    int updateByPrimaryKeySelective(FrmPurview record);

    int updateByPrimaryKey(FrmPurview record);
}