package com.test.servlet.user;

import com.test.dao.UserMapper;
import com.test.pojo.User;
import com.test.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: LoginServlet
 * @Description: 用户登录servlet
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/12 11:17
 */
public class LoginServlet extends HttpServlet {


    // Servlet 调用业务层代码
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        System.out.println("进入LoginServlet");
//
//        // 获取用户名和密码
//        String userName = req.getParameter("userName");
//        String password = req.getParameter("password");
//        if (userName == null || password == null)
//            System.out.println("无法从前端获取变量");
//
//        // 和数据库中的密码进行对比
//        // 测试：
//        SqlSession sqlSession = MybatisUtil.getSqlSession();
//        System.out.println(userName + " " + password);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = mapper.selectUserById(1);
//
//
//        if (user != null) {  // 查有此人，可以登录
//            req.setAttribute("success", "登录成功！");
//            // 将用户的信息放到Session中
//            System.out.println(user);
//            // 跳转到内部主页
//            resp.sendRedirect("index.jsp");
//        }
//        else {  // 查无此人，无法登录
//            // 转发回登录页面，顺带提示：用户名或密码错误
//            System.out.println("无法连接数据库");
//            req.setAttribute("error", "用户名或密码错误！");
//            req.getRequestDispatcher("logInPage.html").forward(req, resp);
//        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
