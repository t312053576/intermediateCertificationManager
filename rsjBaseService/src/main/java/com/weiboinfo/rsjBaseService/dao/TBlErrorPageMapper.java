package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.TBlErrorPage;
import com.weiboinfo.rsjBaseService.entry.TBlErrorPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBlErrorPageMapper {
    int countByExample(TBlErrorPageExample example);

    int deleteByExample(TBlErrorPageExample example);

    int deleteByPrimaryKey(String id);

    int insert(TBlErrorPage record);

    int insertSelective(TBlErrorPage record);

    List<TBlErrorPage> selectByExample(TBlErrorPageExample example);

    TBlErrorPage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TBlErrorPage record, @Param("example") TBlErrorPageExample example);

    int updateByExample(@Param("record") TBlErrorPage record, @Param("example") TBlErrorPageExample example);

    int updateByPrimaryKeySelective(TBlErrorPage record);

    int updateByPrimaryKey(TBlErrorPage record);
}