package com.test.service;

import com.test.pojo.User;

import java.util.Map;

/**
 * @ClassName: UserService
 * @Description: 用户服务
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/13 9:36
 */
public interface UserService {
    // 登录服务
    public boolean LoginService(String username, String password);

    // 注册方法
    public boolean SignUpService(Map<String, String> userInfos);
    
    //密码验证
    public boolean equalsPassword(String password,String configPassword);
}
