package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.AdviseType2;
import com.weiboinfo.rsjBaseService.entry.AdviseType2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdviseType2Mapper {
    int countByExample(AdviseType2Example example);

    int deleteByExample(AdviseType2Example example);

    int deleteByPrimaryKey(String id);

    int insert(AdviseType2 record);

    int insertSelective(AdviseType2 record);

    List<AdviseType2> selectByExample(AdviseType2Example example);

    AdviseType2 selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AdviseType2 record, @Param("example") AdviseType2Example example);

    int updateByExample(@Param("record") AdviseType2 record, @Param("example") AdviseType2Example example);

    int updateByPrimaryKeySelective(AdviseType2 record);

    int updateByPrimaryKey(AdviseType2 record);
}