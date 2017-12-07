package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.Ipdatd;
import com.weiboinfo.rsjBaseService.entry.IpdatdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpdatdMapper {
    int countByExample(IpdatdExample example);

    int deleteByExample(IpdatdExample example);

    int insert(Ipdatd record);

    int insertSelective(Ipdatd record);

    List<Ipdatd> selectByExample(IpdatdExample example);

    int updateByExampleSelective(@Param("record") Ipdatd record, @Param("example") IpdatdExample example);

    int updateByExample(@Param("record") Ipdatd record, @Param("example") IpdatdExample example);
}