package com.test.dao;

import com.test.pojo.User;

/**
 * @ClassName: UserMapper
 * @Description: 用户类数据库接口
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/12 10:04
 */
public interface UserMapper {
    // 测试接口
    public User selectUserById(Integer id);

    // 根据姓名查询用户
    public User selectUserByName(String uname);

    // 添加用户
    public int insertUser(User user);

}
