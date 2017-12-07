package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.RobotKeyword;
import com.weiboinfo.rsjBaseService.entry.RobotKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RobotKeywordMapper {
    int countByExample(RobotKeywordExample example);

    int deleteByExample(RobotKeywordExample example);

    int insert(RobotKeyword record);

    int insertSelective(RobotKeyword record);

    List<RobotKeyword> selectByExample(RobotKeywordExample example);

    int updateByExampleSelective(@Param("record") RobotKeyword record, @Param("example") RobotKeywordExample example);

    int updateByExample(@Param("record") RobotKeyword record, @Param("example") RobotKeywordExample example);
}