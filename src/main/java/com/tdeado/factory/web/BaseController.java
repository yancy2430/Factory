package com.tdeado.factory.web;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseController {


    protected Map<String,Object> retData(Object data,int count,String msg){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("count",count);
        map.put("msg",msg);
        map.put("data",data);
        return map;
    }
    protected Map<String,Object> retData(Object data,long count,String msg){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("count",count);
        map.put("msg",msg);
        map.put("data",data);
        return map;
    }
    protected Map<String,Object> retData(Object data,String msg){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("count","操作成功");
        map.put("msg",msg);
        map.put("data",data);
        return map;
    }
    protected Map<String,Object> retData(Object data,int count){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("count",count);
        map.put("msg","操作成功");
        map.put("data",data);
        return map;
    }
    protected Map<String,Object> retData(Object data,long count){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("count",count);
        map.put("msg","操作成功");
        map.put("data",data);
        return map;
    }
    protected Map<String,Object> retData(Object data){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("count",0);
        map.put("msg","操作成功");
        map.put("data",data);
        return map;
    }
}
