package com.test.component;

/**
 * @ClassName: CommonResult
 * @Description: 公共信息返回类
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2022/2/17 10:04
 */
public class CommonResult {
    private String code;
    private String message;
    private String ok;
    private Object data;


    public CommonResult(String code, String ok) {
        this.code = code;
        this.ok = ok;
        this.message = null;
        this.data = null;
    }



    public CommonResult(String code, String message, String ok, Object data) {
        this.code = code;
        this.message = message;
        this.ok = ok;
        this.data = data;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
