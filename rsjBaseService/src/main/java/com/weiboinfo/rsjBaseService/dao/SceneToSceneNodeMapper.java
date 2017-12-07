package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.SceneToSceneNode;
import com.weiboinfo.rsjBaseService.entry.SceneToSceneNodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneToSceneNodeMapper {
    int countByExample(SceneToSceneNodeExample example);

    int deleteByExample(SceneToSceneNodeExample example);

    int deleteByPrimaryKey(String id);

    int insert(SceneToSceneNode record);

    int insertSelective(SceneToSceneNode record);

    List<SceneToSceneNode> selectByExample(SceneToSceneNodeExample example);

    SceneToSceneNode selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SceneToSceneNode record, @Param("example") SceneToSceneNodeExample example);

    int updateByExample(@Param("record") SceneToSceneNode record, @Param("example") SceneToSceneNodeExample example);

    int updateByPrimaryKeySelective(SceneToSceneNode record);

    int updateByPrimaryKey(SceneToSceneNode record);
}