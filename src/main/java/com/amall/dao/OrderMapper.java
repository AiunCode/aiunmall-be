package com.amall.dao;

import com.amall.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(@Param("record") Order record);

    int insertSelective(@Param("record") Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(@Param("record") Order record);

    int updateByPrimaryKey(@Param("record") Order record);

    Order selectByUserIdAndOrderNo(@Param("userId")Integer userId, @Param("orderNo")Long orderNo);

    Order selectByOrderNo(Long orderNo);

    List<Order> selectByUserId(Integer userId);

    List<Order> selectAllOrder();
}