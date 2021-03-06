package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.CertificateInfo;
import com.weiboinfo.rsjBaseService.entry.CertificateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertificateInfoMapper {
    int countByExample(CertificateInfoExample example);

    int deleteByExample(CertificateInfoExample example);

    int insert(CertificateInfo record);

    int insertSelective(CertificateInfo record);

    List<CertificateInfo> selectByExample(CertificateInfoExample example);

    int updateByExampleSelective(@Param("record") CertificateInfo record, @Param("example") CertificateInfoExample example);

    int updateByExample(@Param("record") CertificateInfo record, @Param("example") CertificateInfoExample example);
}