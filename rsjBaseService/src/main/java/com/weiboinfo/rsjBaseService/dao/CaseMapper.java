package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.Case;
import com.weiboinfo.rsjBaseService.entry.CaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaseMapper {
    int countByExample(CaseExample example);

    int deleteByExample(CaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(Case record);

    int insertSelective(Case record);

    List<Case> selectByExample(CaseExample example);

    Case selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Case record, @Param("example") CaseExample example);

    int updateByExample(@Param("record") Case record, @Param("example") CaseExample example);

    int updateByPrimaryKeySelective(Case record);

    int updateByPrimaryKey(Case record);
}