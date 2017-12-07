package com.weiboinfo.rsjBaseService.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.weiboinfo.rsjBaseService.entry.FrmShortCuts;
import com.weiboinfo.rsjBaseService.entry.FrmShortCutsExample;

public interface FrmShortCutsMapper {
    int countByExample(FrmShortCutsExample example);

    int deleteByExample(FrmShortCutsExample example);

    int deleteByPrimaryKey(String frmshortcutsid);

    int insert(FrmShortCuts record);

    int insertSelective(FrmShortCuts record);

    List<FrmShortCuts> selectByExample(FrmShortCutsExample example);

    FrmShortCuts selectByPrimaryKey(String frmshortcutsid);

    int updateByExampleSelective(@Param("record") FrmShortCuts record, @Param("example") FrmShortCutsExample example);

    int updateByExample(@Param("record") FrmShortCuts record, @Param("example") FrmShortCutsExample example);

    int updateByPrimaryKeySelective(FrmShortCuts record);

    int updateByPrimaryKey(FrmShortCuts record);
}