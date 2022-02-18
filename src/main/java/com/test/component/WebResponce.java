package com.test.component;

/**
 * @Author Hilda
 * @Description //TODO 常用的web状态返回
 * @Date 10:54 2022/2/17
 * @Param
 * @returnValue
 **/

public enum WebResponce {

    SUCCESS("200"),
    FAIL("201");

    private String code;

    WebResponce(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
