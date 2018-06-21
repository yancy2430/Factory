package com.tdeado.factory.web.admin;

import com.github.pagehelper.Page;
import com.tdeado.factory.dao.ModuleMapper;
import com.tdeado.factory.dao.UserMapper;
import com.tdeado.factory.entity.Module;
import com.tdeado.factory.entity.User;
import com.tdeado.factory.service.UserService;
import com.tdeado.factory.utils.StringUtils;
import com.tdeado.factory.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class UserController extends BaseController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "user/getUserList", method = {RequestMethod.POST, RequestMethod.GET})
    private Map<String, Object> getUserList(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");
        String key = request.getParameter("key");
        if (!StringUtils.isEmpty(page) || !StringUtils.isEmpty(limit)) {
            throw new RuntimeException("page或limit参数错误");
        }
        User.QueryBuilder user = User.QueryBuild();
        if (StringUtils.isEmpty(key)) {
            user.fuzzyUserName(key);
        }

        Page<User> users = (Page<User>) userService.getUserList(Integer.parseInt(page), Integer.parseInt(limit), user);
        return retData(users, users.getTotal(), "获取用户成功");
    }

}
