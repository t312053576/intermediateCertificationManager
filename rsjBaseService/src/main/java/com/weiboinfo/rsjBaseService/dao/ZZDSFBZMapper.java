package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.ZZDSFBZ;
import com.weiboinfo.rsjBaseService.entry.ZZDSFBZExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZZDSFBZMapper {
    int countByExample(ZZDSFBZExample example);

    int deleteByExample(ZZDSFBZExample example);

    int deleteByPrimaryKey(String dm);

    int insert(ZZDSFBZ record);

    int insertSelective(ZZDSFBZ record);

    List<ZZDSFBZ> selectByExample(ZZDSFBZExample example);

    ZZDSFBZ selectByPrimaryKey(String dm);

    int updateByExampleSelective(@Param("record") ZZDSFBZ record, @Param("example") ZZDSFBZExample example);

    int updateByExample(@Param("record") ZZDSFBZ record, @Param("example") ZZDSFBZExample example);

    int updateByPrimaryKeySelective(ZZDSFBZ record);

    int updateByPrimaryKey(ZZDSFBZ record);
}