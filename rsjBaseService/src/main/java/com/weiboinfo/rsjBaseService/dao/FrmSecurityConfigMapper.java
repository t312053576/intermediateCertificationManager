package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.FrmSecurityConfig;
import com.weiboinfo.rsjBaseService.entry.FrmSecurityConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FrmSecurityConfigMapper {
    int countByExample(FrmSecurityConfigExample example);

    int deleteByExample(FrmSecurityConfigExample example);

    int deleteByPrimaryKey(String frmsecurityconfigid);

    int insert(FrmSecurityConfig record);

    int insertSelective(FrmSecurityConfig record);

    List<FrmSecurityConfig> selectByExample(FrmSecurityConfigExample example);

    FrmSecurityConfig selectByPrimaryKey(String frmsecurityconfigid);

    int updateByExampleSelective(@Param("record") FrmSecurityConfig record, @Param("example") FrmSecurityConfigExample example);

    int updateByExample(@Param("record") FrmSecurityConfig record, @Param("example") FrmSecurityConfigExample example);

    int updateByPrimaryKeySelective(FrmSecurityConfig record);

    int updateByPrimaryKey(FrmSecurityConfig record);
}