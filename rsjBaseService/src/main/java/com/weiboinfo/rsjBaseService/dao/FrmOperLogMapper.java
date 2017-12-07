package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.FrmOperLog;
import com.weiboinfo.rsjBaseService.entry.FrmOperLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrmOperLogMapper {
    int countByExample(FrmOperLogExample example);

    int deleteByExample(FrmOperLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(FrmOperLog record);

    int insertSelective(FrmOperLog record);

    List<FrmOperLog> selectByExample(FrmOperLogExample example);

    FrmOperLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FrmOperLog record, @Param("example") FrmOperLogExample example);

    int updateByExample(@Param("record") FrmOperLog record, @Param("example") FrmOperLogExample example);

    int updateByPrimaryKeySelective(FrmOperLog record);

    int updateByPrimaryKey(FrmOperLog record);
}