package com.test.servlet.user;

import com.alibaba.fastjson.JSON;
import com.test.component.CommonResult;
import com.test.component.WebResponce;

import com.test.service.impl.UserServiceImpl;
import com.test.utils.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.util.Map;

/**
 * @ClassName: LoginServlet
 * @Description: 用户登录servlet
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/12 11:17
 */
public class LoginServlet extends HttpServlet {

    /**
     * servlet处理json的帖子：
     * https://blog.csdn.net/zknxx/article/details/52281220
     **/

    // Servlet 调用业务层代码
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        // 设置请求编码
        req.setCharacterEncoding("UTF-8");
        // 设置响应编码格式
        resp.setContentType("application/json; charset=utf-8");

        // 1. json数据预处理
        String requestJSONData = JSONUtil.getRequestJSONData(req);

        // 2. 封装参数
        Map<String, String> params = (Map<String, String>) JSON.parse(requestJSONData);

        // 3. 调用UserService登录服务
        UserServiceImpl userService = new UserServiceImpl();
        String result = null;

        if (userService.LoginService(params)) {
            CommonResult success = new CommonResult(WebResponce.SUCCESS.getCode(), "true");
            result = JSON.toJSONString(success);
            resp.getWriter().write(result);
        }
        else {
            CommonResult fail = new CommonResult(WebResponce.FAIL.getCode(), "false");
            result = JSON.toJSONString(fail);
            resp.getWriter().write(result);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
