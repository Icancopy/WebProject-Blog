package com.test.servlet.user;
import com.test.dao.UserMapper;
import com.test.pojo.User;
import com.test.service.UserService;
import com.test.service.impl.UserServiceImpl;
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
        //设置字符编码集，防止乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        // 获取用户名和密码
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        //调用service里面的LoginService方法，判断是否登录成功
        UserServiceImpl userService = new UserServiceImpl();
        boolean flag=userService.LoginService(userName,password);
        //根据返回的值进行页面的跳转
        if(flag){
            //登录成功，跳转到帖子展示页面
            req.getSession().setAttribute("success", "登录成功！");
            req.getRequestDispatcher("帖子展示的url").forward(req,resp);
        }else{
            //登录失败，刷新重新登录
            req.getSession().setAttribute("error", "登录失败！");
            resp.setHeader("Refresh","1");
        }
//
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
