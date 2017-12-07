package com.weiboinfo.rsjBaseService.dao;

import com.weiboinfo.rsjBaseService.entry.ExchangeLDBZ;
import com.weiboinfo.rsjBaseService.entry.ExchangeLDBZExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExchangeLDBZMapper {
    int countByExample(ExchangeLDBZExample example);

    int deleteByExample(ExchangeLDBZExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExchangeLDBZ record);

    int insertSelective(ExchangeLDBZ record);

    List<ExchangeLDBZ> selectByExampleWithBLOBs(ExchangeLDBZExample example);

    List<ExchangeLDBZ> selectByExample(ExchangeLDBZExample example);

    ExchangeLDBZ selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExchangeLDBZ record, @Param("example") ExchangeLDBZExample example);

    int updateByExampleWithBLOBs(@Param("record") ExchangeLDBZ record, @Param("example") ExchangeLDBZExample example);

    int updateByExample(@Param("record") ExchangeLDBZ record, @Param("example") ExchangeLDBZExample example);

    int updateByPrimaryKeySelective(ExchangeLDBZ record);

    int updateByPrimaryKeyWithBLOBs(ExchangeLDBZ record);

    int updateByPrimaryKey(ExchangeLDBZ record);
}