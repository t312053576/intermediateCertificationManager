package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.Scene;
import com.weiboinfo.rsjBaseService.entry.SceneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneMapper {
    int countByExample(SceneExample example);

    int deleteByExample(SceneExample example);

    int deleteByPrimaryKey(String id);

    int insert(Scene record);

    int insertSelective(Scene record);

    List<Scene> selectByExampleWithBLOBs(SceneExample example);

    List<Scene> selectByExample(SceneExample example);

    Scene selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Scene record, @Param("example") SceneExample example);

    int updateByExampleWithBLOBs(@Param("record") Scene record, @Param("example") SceneExample example);

    int updateByExample(@Param("record") Scene record, @Param("example") SceneExample example);

    int updateByPrimaryKeySelective(Scene record);

    int updateByPrimaryKeyWithBLOBs(Scene record);

    int updateByPrimaryKey(Scene record);
}