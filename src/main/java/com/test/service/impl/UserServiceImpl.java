package com.test.service.impl;

import com.test.dao.UserMapper;
import com.test.pojo.User;
import com.test.service.UserService;
import com.test.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

/**
 * @ClassName: UserServiceImpl
 * @Description: UserService实现类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/15 10:37
 */
public class UserServiceImpl implements UserService {

    @Override
    public boolean LoginService(String username, String password) {
        // 数据库连接
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 使用userMapper提供的方法进行数据库查询即可




        // 登录成功
        return true;
    }


    @Override
    public boolean SignUpService(Map<String, String> userInfos) {
        // 数据库连接
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 使用userMapper提供的方法



        // 注册成功
        return true;
    }
}
