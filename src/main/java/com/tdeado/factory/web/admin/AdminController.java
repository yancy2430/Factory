package com.tdeado.factory.web.admin;

import com.tdeado.factory.dao.ModuleMapper;
import com.tdeado.factory.entity.Module;
import com.tdeado.factory.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台管理
 */

@RestController
@RequestMapping("/admin")
public class AdminController extends BaseController{
    @Autowired
    ModuleMapper moduleMapper;

    @RequestMapping(value = "index/getModule",method = {RequestMethod.POST,RequestMethod.GET})
    private Map<String,Object> returnData(HttpServletRequest request, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Module> modules = moduleMapper.queryModule(null);
        return retData(modules);
    }
}
