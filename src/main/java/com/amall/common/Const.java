package com.amall.common;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * @author lenovo
 */
public class Const {
    /**
     * 用户状态
     */
    public static final String CURRENT_USER = "currentUser";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    /**
     * 产品排序
     */
    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc","price_asc");
    }

    /**
     * 购物车
     */
    public interface Cart{
        //购物车选中状态
        int CHECKED = 1;
        //购物车未选中状态
        int UN_CHECKED = 0;

        String LIMIT_NUM_FAIL = "LIMIT_NUM_FAIL";
        String LIMIT_NUM_SUCCESS = "LIMIT_NUM_SUCCESS";
    }

    /**
     * 用户角色
     */
    public interface Role {
        //普通用户
        int ROLE_CUSTOMER = 0;
        //管理员
        int ROLE_ADMIN = 1;
    }

    /**
     * 产品销售状态
     */
    public enum ProductStatusEnum {
        //在线售卖状态
        ON_SALE(1, "在线");

        private int code;
        private String value;

        ProductStatusEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 订单状态
     */
    public enum OrderStatusEnum {
        /**
         * 订单取消
         */
        CANCELED(0, "已取消"),
        /**
         * 订单未支付
         */
        NO_PAY(10, "未支付"),
        /**
         * 已付款状态
         */
        PAID(20, "已付款"),
        /**
         * 已发货状态
         */
        SHIPPED(40, "已发货"),
        /**
         * 订单完成状态
         */
        ORDER_SUCCESS(50, "订单完成"),
        /**
         * 订单关闭状态
         */
        ORDER_CLOSE(60, "订单关闭");

        private String value;
        private int code;

        OrderStatusEnum(int code, String value) {
            this.value = value;
            this.code = code;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static OrderStatusEnum codeOf(int code) {
            for (OrderStatusEnum orderStatusEnum : values()) {
                if (orderStatusEnum.getCode() == code) {
                    return orderStatusEnum;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }
    /**
     * 交易状态
     */
    public interface AlipayCallback {
        /**
         * 交易创建
         */
        String TRADE_STATUS_WAIT_BUYER_PAY = "WAIT_BUYER_PAY";
        /**
         * 交易成功
         */
        String TRADE_STATUS_TRADE_SUCCESS = "TRADE_SUCCESS";

        /**
         * 返回成功
         */
        String RESPONSE_SUCCESS = "success";
        /**
         * 返回失败
         */
        String RESPONSE_FAILED = "failed";
    }

    /**
     * 支付平台
     * （支付宝/微信）
     */
    public enum PayPlatforEnum {
        /**
         * 支付宝平台支付
         */
        ALIPAY(1, "支付宝");

        private String value;
        private int code;

        PayPlatforEnum(int code, String value) {
            this.value = value;
            this.code = code;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }
    }

    public enum PaymentTypeEnum {
        /**
         * 在线支付状态
         */
        ONLINE_PAY(1,"在线支付");

        private String value;
        private int code;

        PaymentTypeEnum(int code, String value) {
            this.value = value;
            this.code = code;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }

        public static PaymentTypeEnum codeOf(int code) {
            for (PaymentTypeEnum paymentTypeEnum : values()) {
                if (paymentTypeEnum.getCode() == code) {
                    return paymentTypeEnum;
                }
            }
            throw new RuntimeException("没有找到对应的枚举");
        }
    }
}
