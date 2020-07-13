package com.amall.dao;

import com.amall.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(@Param("record") OrderItem record);

    int insertSelective(@Param("record") OrderItem record);

    OrderItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(@Param("record") OrderItem record);

    int updateByPrimaryKey(@Param("record") OrderItem record);

    List<OrderItem> getByOrderNo(@Param("orderNo") Long orderNo);

    List<OrderItem> getByOrderNoAndUserId(@Param("orderNo") Long orderNo, @Param("userId") Integer userId);

    void batchInsert(@Param("orderItemList") List<OrderItem> orderItemList);
}