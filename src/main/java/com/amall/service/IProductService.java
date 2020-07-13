package com.amall.service;

import com.amall.common.ServerResponse;
import com.amall.pojo.Product;
import com.amall.vo.ProductDetailVo;
import com.github.pagehelper.PageInfo;

/**
 * 产品接口
 * @author lenovo
 */
public interface IProductService {
    /**
     * 保存或更新产品
     * @param product
     * @return
     */
    ServerResponse saveOrUpdateProduct(Product product);

    /**
     * 设置产品的销售状态
     * @param productId
     * @param status
     * @return
     */
    ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    /**
     * 管理员获取产品的详细信息
     * @param productId
     * @return
     */
    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    /**
     * 产品列表（分页）
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);

    /**
     * 查询产品
     * @param productName
     * @param productId
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse<PageInfo> searchProduct(String productName, Integer productId, int pageNum, int pageSize);

    /**
     * 前端获取产品详细信息
     * @param productId
     * @return
     */
    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    /**
     * 通过商品种类的关键字获取产品
     * @param keyword
     * @param categoryId
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse<PageInfo> getProductBykeywordCategory(String keyword, Integer categoryId, int pageNum, int pageSize, String orderBy);
}
