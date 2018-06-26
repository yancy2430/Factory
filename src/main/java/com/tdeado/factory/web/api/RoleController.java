package com.tdeado.factory.web.api;

import com.github.pagehelper.Page;
import com.tdeado.factory.entity.Role;
import com.tdeado.factory.entity.User;
import com.tdeado.factory.service.RoleService;
import com.tdeado.factory.utils.StringUtils;
import com.tdeado.factory.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RoleController extends BaseController {
    @Autowired
    private RoleService roleService;


    @RequestMapping(value = "role/addRole", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> addRole(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String name = request.getParameter("name");
        verifyParam(name);
        Role role = new Role();
        role.setRoleName(name);
        return retData(roleService.addRole(role));
    }

    @RequestMapping(value = "role/editRole", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> editRole(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        verifyParam(id,name);
        Role role = new Role();
        role.setRoleName(name);
        role.setId(Integer.parseInt(id));
        return retData(roleService.editRole(role));
    }
}
