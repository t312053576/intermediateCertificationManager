package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.IntelLigentRobot;
import com.weiboinfo.rsjBaseService.entry.IntelLigentRobotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntelLigentRobotMapper {
    int countByExample(IntelLigentRobotExample example);

    int deleteByExample(IntelLigentRobotExample example);

    int deleteByPrimaryKey(String infoid);

    int insert(IntelLigentRobot record);

    int insertSelective(IntelLigentRobot record);

    List<IntelLigentRobot> selectByExample(IntelLigentRobotExample example);

    IntelLigentRobot selectByPrimaryKey(String infoid);

    int updateByExampleSelective(@Param("record") IntelLigentRobot record, @Param("example") IntelLigentRobotExample example);

    int updateByExample(@Param("record") IntelLigentRobot record, @Param("example") IntelLigentRobotExample example);

    int updateByPrimaryKeySelective(IntelLigentRobot record);

    int updateByPrimaryKey(IntelLigentRobot record);
}