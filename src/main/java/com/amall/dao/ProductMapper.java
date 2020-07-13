package com.amall.dao;

import com.amall.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lenovo
 */
public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(@Param("record") Product record);

    int insertSelective(@Param("record") Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(@Param("record") Product record);

    int updateByPrimaryKey(@Param("record") Product record);

    List<Product> selectList();

    /**
     * 通过产品名或id获取产品
     * @param productName
     * @param productId
     * @return
     */
    List<Product> selectByNameAndProductId(@Param("productName") String productName, @Param("productId") Integer productId);

    /**
     * 通过产品名或品种id获取产品
     * @return
     */
    List<Product> selectByNameAndCategoryIds(@Param("productName") String productName, @Param("categoryIdList") List<Integer> categoryIdList);
}