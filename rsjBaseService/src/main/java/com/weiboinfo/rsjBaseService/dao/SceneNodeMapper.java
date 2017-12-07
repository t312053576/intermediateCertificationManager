package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.SceneNode;
import com.weiboinfo.rsjBaseService.entry.SceneNodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneNodeMapper {
    int countByExample(SceneNodeExample example);

    int deleteByExample(SceneNodeExample example);

    int deleteByPrimaryKey(String sid);

    int insert(SceneNode record);

    int insertSelective(SceneNode record);

    List<SceneNode> selectByExample(SceneNodeExample example);

    SceneNode selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") SceneNode record, @Param("example") SceneNodeExample example);

    int updateByExample(@Param("record") SceneNode record, @Param("example") SceneNodeExample example);

    int updateByPrimaryKeySelective(SceneNode record);

    int updateByPrimaryKey(SceneNode record);
}