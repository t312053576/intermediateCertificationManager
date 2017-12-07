package com.weiboinfo.rsjBaseService.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.weiboinfo.rsjBaseService.entry.FrmSecondPurview;
import com.weiboinfo.rsjBaseService.entry.FrmSecondPurviewExample;

public interface FrmSecondPurviewMapper {
    int countByExample(FrmSecondPurviewExample example);

    int deleteByExample(FrmSecondPurviewExample example);

    int deleteByPrimaryKey(String secondpurviewid);

    int insert(FrmSecondPurview record);

    int insertSelective(FrmSecondPurview record);

    List<FrmSecondPurview> selectByExample(FrmSecondPurviewExample example);

    FrmSecondPurview selectByPrimaryKey(String secondpurviewid);

    int updateByExampleSelective(@Param("record") FrmSecondPurview record, @Param("example") FrmSecondPurviewExample example);

    int updateByExample(@Param("record") FrmSecondPurview record, @Param("example") FrmSecondPurviewExample example);

    int updateByPrimaryKeySelective(FrmSecondPurview record);

    int updateByPrimaryKey(FrmSecondPurview record);
}