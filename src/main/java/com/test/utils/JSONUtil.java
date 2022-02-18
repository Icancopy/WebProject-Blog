package com.test.utils;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @ClassName: JSONUtil
 * @Description: 处理json的工具类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/17 14:00
 */
public class JSONUtil {
    /**
     * @Author Hilda
     * @Description //TODO 获取request中的json数据
     * @Date 14:01 2022/2/17
     * @Param
     * @returnValue
     **/
    public static String getRequestJSONData(HttpServletRequest req) {
        String param = null;

        try {
            BufferedReader streamReader = new BufferedReader( new InputStreamReader(req.getInputStream(), "UTF-8"));
            StringBuilder responseStrBuilder = new StringBuilder();
            String inputStr;
            while ((inputStr = streamReader.readLine()) != null)
                responseStrBuilder.append(inputStr);

            JSONObject jsonObject = JSONObject.parseObject(responseStrBuilder.toString());
            param = jsonObject.toJSONString();
//            System.out.println(param);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return param;
    }
}
