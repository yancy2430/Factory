package com.tdeado.factory.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionhandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String ,Object> exceptionHandler(HttpServletRequest req,Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code",500);
        map.put("count",0);
        map.put("msg",e.getMessage());
        map.put("data",null);
        return map;
    }

//    @ExceptionHandler(value = SQLException.class)
//    @ResponseBody
//    private Map<String ,Object> sqlExceptionHandler(HttpServletRequest req,Exception e){
//        Map<String,Object> map = new HashMap<>();
//        map.put("code",500);
//        map.put("message","数据库插入异常");
//        map.put("data",null);
//        return map;
//    }

}
