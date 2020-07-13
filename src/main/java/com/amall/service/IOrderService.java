package com.amall.service;

import com.amall.common.ServerResponse;
import com.amall.pojo.PayInfo;
import com.amall.vo.OrderVo;
import com.github.pagehelper.PageInfo;

import java.util.Map;

/**
 * 支付订单接口
 * @author lenovo
 */
public interface IOrderService {
    /**
     * 创建订单
     * @param userId 用户id
     * @param shippingId 收货地址id
     * @return
     */
    ServerResponse<OrderVo> createOrder(Integer userId, Integer shippingId);

    /**
     * 取消订单
     * @param userId 用户id
     * @param orderNo 订单号
     * @return
     */
    ServerResponse<String> cancel(Integer userId, Long orderNo);

    /**
     * 获取购物车中已经选中的商品信息
     * @param userId
     * @return
     */
    ServerResponse getOrderCartProduct(Integer userId);

    /**
     * 获取订单详细信息
     * @param userId
     * @param orderNo
     * @return
     */
    ServerResponse<OrderVo> getOrderDetail(Integer userId, Long orderNo);

    /**
     * 获取订单列表
     * @param userId
     * @return
     */
    ServerResponse<PageInfo> getOrderList(Integer userId, int pageNum, int pageSize);

    /**
     * 支付方法
     * @param orderNo 订单号
     * @param userId 用户id
     * @param path 保存支付二维码的路径
     * @return
     */
    ServerResponse pay(Long orderNo, Integer userId, String path);

    /**
     * 支付宝回调方法
     * 商户需要验证该通知数据中的 out_trade_no 是否为商户系统中创建的订单号；
     * 判断 total_amount 是否确实为该订单的实际金额（即商户订单创建时的金额）；
     * 校验通知中的 seller_id（或者seller_email) 是否为 out_trade_no
     * 这笔单据的对应的操作方（有的时候，一个商户可能有多个 seller_id/seller_email）。
     * @param params 请求参数
     * @return
     */
    ServerResponse aliCallBack(Map<String, String> params);

    /**
     * 查询订单状态
     * @param userId
     * @param orderNo
     * @return
     */
    ServerResponse queryOrderPayStatus(Integer userId, Long orderNo);

    /**
     * backend
     */
    /**
     * 管理员获取列表信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse<PageInfo> manageList(int pageNum, int pageSize);

    /**
     * 管理员获取订单详细信息
     * @param orderNo
     * @return
     */
    ServerResponse<OrderVo> manageDetail(Long orderNo);

    /**
     * 商品查询
     * @param orderNo
     * @param pageNum
     * @param pageSize
     * @return
     */
    ServerResponse<PageInfo> manageSearch(Long orderNo, int pageNum, int pageSize);

    /**
     * 发货信息
     * @param orderNo
     * @return
     */
    ServerResponse<String> manageSendGoods(Long orderNo);
}
