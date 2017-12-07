package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.SceneArticle;
import com.weiboinfo.rsjBaseService.entry.SceneArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneArticleMapper {
    int countByExample(SceneArticleExample example);

    int deleteByExample(SceneArticleExample example);

    int deleteByPrimaryKey(String id);

    int insert(SceneArticle record);

    int insertSelective(SceneArticle record);

    List<SceneArticle> selectByExampleWithBLOBs(SceneArticleExample example);

    List<SceneArticle> selectByExample(SceneArticleExample example);

    SceneArticle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SceneArticle record, @Param("example") SceneArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") SceneArticle record, @Param("example") SceneArticleExample example);

    int updateByExample(@Param("record") SceneArticle record, @Param("example") SceneArticleExample example);

    int updateByPrimaryKeySelective(SceneArticle record);

    int updateByPrimaryKeyWithBLOBs(SceneArticle record);

    int updateByPrimaryKey(SceneArticle record);
}