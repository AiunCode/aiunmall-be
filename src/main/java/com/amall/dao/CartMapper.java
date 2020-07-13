package com.amall.dao;

import com.amall.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(@Param("record") Cart record);

    int insertSelective(@Param("record") Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(@Param("record") Cart record);

    int updateByPrimaryKey(@Param("record") Cart record);

    /**
     * 通过用户id和产品id查询购物车
     * @param userId
     * @param productId
     * @return
     */
    Cart selectCartByUserIdProductId(@Param("userId") Integer userId, @Param("productId") Integer productId);

    /**
     * 通过用户id查询购物车
     * @param userId
     * @return
     */
    List<Cart> selectCartByUserId(Integer userId);

    /**
     * 根据userId查询产品是否有未被选中的
     * @param userId
     * @return
     */
    int selectCartProductCheckedStatusByUserId(Integer userId);

    /**
     * 根据用户id和产品id删除
     * @param userId
     * @param productIds
     * @return
     */
    int deleteByUserIdProductIds(@Param("userId") Integer userId, @Param("productIds") List<String> productIds);

    /**
     * 查询购物车产品是否是选中状态
      * @param userId
     * @param productId
     * @param checked
     * @return
     */
    int checkedOrUnCheckedProduct(@Param("userId") Integer userId, @Param("productId") Integer productId, @Param("checked") Integer checked);

    /**
     * 获取购物车产品数量
     * @param userId
     * @return
     */
    int selectCartProductCount(@Param("userId") Integer userId);

    List<Cart> selectCheckedCartByUserId(Integer userId);
}