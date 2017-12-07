package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.VisitStatic;
import com.weiboinfo.rsjBaseService.entry.VisitStaticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitStaticMapper {
    int countByExample(VisitStaticExample example);

    int deleteByExample(VisitStaticExample example);

    int insert(VisitStatic record);

    int insertSelective(VisitStatic record);

    List<VisitStatic> selectByExample(VisitStaticExample example);

    int updateByExampleSelective(@Param("record") VisitStatic record, @Param("example") VisitStaticExample example);

    int updateByExample(@Param("record") VisitStatic record, @Param("example") VisitStaticExample example);
}