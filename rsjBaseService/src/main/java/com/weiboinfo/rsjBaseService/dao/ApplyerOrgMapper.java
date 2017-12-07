package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.ApplyerOrg;
import com.weiboinfo.rsjBaseService.entry.ApplyerOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyerOrgMapper {
    int countByExample(ApplyerOrgExample example);

    int deleteByExample(ApplyerOrgExample example);

    int deleteByPrimaryKey(String aoid);

    int insert(ApplyerOrg record);

    int insertSelective(ApplyerOrg record);

    List<ApplyerOrg> selectByExample(ApplyerOrgExample example);

    ApplyerOrg selectByPrimaryKey(String aoid);

    int updateByExampleSelective(@Param("record") ApplyerOrg record, @Param("example") ApplyerOrgExample example);

    int updateByExample(@Param("record") ApplyerOrg record, @Param("example") ApplyerOrgExample example);

    int updateByPrimaryKeySelective(ApplyerOrg record);

    int updateByPrimaryKey(ApplyerOrg record);
}