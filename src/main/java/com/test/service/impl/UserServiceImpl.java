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
        User users = userMapper.selectUserByName(username);

        //是否登录成功
        if (users.toString().equals(password)){
            return true;
        }else{
            return false;
        }

    }
    }


    @Override
    public boolean SignUpService(Map<String, String> userInfos) {
        // 数据库连接
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //对Map进行解包
        Set<Map.Entry<String, String>> entrySet = userInfos.entrySet();
        for (Map.Entry<String, String> me : entrySet) {
            String key = me.getKey();
            String value = me.getValue();

            if (key.length() > 0 && key.length() <= 20 && value.length() <= 32 && value.length() > 0) {
                // 使用userMapper提供的方法
                userMapper.insertUser(key, value);
                //提交事务
                sqlSession.commit();
                // 注册成功
                flag = 1;
            }
        }
        判断注册是否成功
        if(flag == 1){
            return true;
        }else {
            return false;
        }
    }
    }
}
