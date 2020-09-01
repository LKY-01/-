package com.project.demo.utils;


import com.project.demo.Bean.Result;

/*
 *对返回数据的统一封装
 */
public class ResultUtil {
    //当正确时返回的值
    public static Result success(Object data, int code, String message){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
    //当错误时返回的值
    public static Result error(int code, String message){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}