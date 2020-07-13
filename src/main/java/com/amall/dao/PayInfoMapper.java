package com.amall.dao;

import com.amall.pojo.PayInfo;
import org.apache.ibatis.annotations.Param;

public interface PayInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(@Param("record") PayInfo record);

    int insertSelective(@Param("record") PayInfo record);

    PayInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(@Param("record") PayInfo record);

    int updateByPrimaryKey(@Param("record") PayInfo record);
}