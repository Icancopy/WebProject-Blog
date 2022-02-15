package com.test.service;

import com.test.pojo.User;

/**
 * @ClassName: UserService
 * @Description: 用户服务
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/13 9:36
 */
public interface UserService {
    // 注册服务
    public void SignUpService(User user);

    // 登录服务
    public void LoginService(String username, String password);
}
