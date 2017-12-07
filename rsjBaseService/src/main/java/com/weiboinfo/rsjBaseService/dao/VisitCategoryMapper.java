package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.VisitCategory;
import com.weiboinfo.rsjBaseService.entry.VisitCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitCategoryMapper {
    int countByExample(VisitCategoryExample example);

    int deleteByExample(VisitCategoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(VisitCategory record);

    int insertSelective(VisitCategory record);

    List<VisitCategory> selectByExample(VisitCategoryExample example);

    VisitCategory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VisitCategory record, @Param("example") VisitCategoryExample example);

    int updateByExample(@Param("record") VisitCategory record, @Param("example") VisitCategoryExample example);

    int updateByPrimaryKeySelective(VisitCategory record);

    int updateByPrimaryKey(VisitCategory record);
}