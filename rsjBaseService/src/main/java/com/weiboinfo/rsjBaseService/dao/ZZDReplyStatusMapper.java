package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.ZZDReplyStatus;
import com.weiboinfo.rsjBaseService.entry.ZZDReplyStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZZDReplyStatusMapper {
    int countByExample(ZZDReplyStatusExample example);

    int deleteByExample(ZZDReplyStatusExample example);

    int deleteByPrimaryKey(String dm);

    int insert(ZZDReplyStatus record);

    int insertSelective(ZZDReplyStatus record);

    List<ZZDReplyStatus> selectByExample(ZZDReplyStatusExample example);

    ZZDReplyStatus selectByPrimaryKey(String dm);

    int updateByExampleSelective(@Param("record") ZZDReplyStatus record, @Param("example") ZZDReplyStatusExample example);

    int updateByExample(@Param("record") ZZDReplyStatus record, @Param("example") ZZDReplyStatusExample example);

    int updateByPrimaryKeySelective(ZZDReplyStatus record);

    int updateByPrimaryKey(ZZDReplyStatus record);
}