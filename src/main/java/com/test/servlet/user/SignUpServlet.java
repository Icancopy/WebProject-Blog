package com.test.servlet.user;

import com.test.pojo.User;
import com.test.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: SignUpServlet
 * @Description: 注册Servlet
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/13 9:31
 */
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集编码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //获取前端传来的用户名，密码，邮箱
        String uname = req.getParameter("userName");
        String upassword = req.getParameter("password");
        String configPassword = req.getParameter("configPassword");
        String email = req.getParameter("email");
        UserServiceImpl userService = new UserServiceImpl();
        //调用UserServiceImpI里面的equalsPassword方法,判断两次输入的密码是否一致
        //一致:将信息存储，打包
        if(userService.equalsPassword(upassword,configPassword)){
            //构造一个User对象将注册信息存储
            User user = new User(uname,upassword,email);
            //构建map集合将用户名和密码打包
            Map<String,String> map = new HashMap<>();
            map.put(uname,upassword);
            //调用service里面的SignUpService方法，判断是否注册成功
            boolean flag = userService.SignUpService(map);
            if(flag){
                //注册成功，跳转到帖子展示页面
                req.getSession().setAttribute("success", "注册成功！");
                req.getRequestDispatcher("帖子展示url").forward(req,resp);
            }else{
                //注册失败，跳转到注册页面
                req.getSession().setAttribute("error", "注册失败！");
                req.getRequestDispatcher("注册页面url").forward(req,resp);
            }
        }else{
            //不一致:返回前端“两次输入密码不一致”提示信息，并刷新页面
            req.getSession().setAttribute("error", "两次输入密码不一致！");
            resp.setHeader("Refresh","1");
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
