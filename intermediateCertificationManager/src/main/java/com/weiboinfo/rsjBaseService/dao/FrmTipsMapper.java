package com.weiboinfo.rsjBaseService.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.weiboinfo.rsjBaseService.entry.FrmTips;
import com.weiboinfo.rsjBaseService.entry.FrmTipsExample;

public interface FrmTipsMapper {
    int countByExample(FrmTipsExample example);

    int deleteByExample(FrmTipsExample example);

    int insert(FrmTips record);

    int insertSelective(FrmTips record);

    List<FrmTips> selectByExample(FrmTipsExample example);

    int updateByExampleSelective(@Param("record") FrmTips record, @Param("example") FrmTipsExample example);

    int updateByExample(@Param("record") FrmTips record, @Param("example") FrmTipsExample example);
}