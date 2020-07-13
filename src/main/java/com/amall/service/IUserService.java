package com.amall.service;

import com.amall.common.ServerResponse;
import com.amall.pojo.User;

/**
 * 用户接口
 * @author lenovo
 */
public interface IUserService {
    //frontend

    /**
     * 用户登录
     * @param userName
     * @param password
     * @return
     */
    ServerResponse<User> login(String userName, String password);

    /**
     * 注册
     * @param user
     * @return
     */
    ServerResponse<String> register(User user);

    /**
     * 用户名或邮箱的校验
     * @param str
     * @param type
     * @return
     */
    ServerResponse<String> checkValid(String str, String type);

    /**
     * 根据用户名查询问题
     * @param username
     * @return
     */
    ServerResponse<String> selectQuestion(String username);

    /**
     * 检查问题
     * @param username
     * @param question
     * @param answer
     * @return
     */
    ServerResponse checkAnswer(String username, String question, String answer);

    /**
     * 忘记密码从设密码
     * @param username
     * @param newPassword
     * @param forgetToken
     * @return
     */
    ServerResponse<String> forgetRestPassword(String username, String newPassword, String forgetToken);

    /**
     * 更改密码
     * @param oldPassword
     * @param newPassword
     * @param user
     * @return
     */
    ServerResponse<String> resetPassword(String oldPassword, String newPassword, User user);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    ServerResponse<User> updateInformation(User user);

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    ServerResponse<User> getInformation(int userId);

    //backend

    /**
     * 检查是否是管理员
     * @param user
     * @return
     */
    ServerResponse checkAdminRole(User user);
}
