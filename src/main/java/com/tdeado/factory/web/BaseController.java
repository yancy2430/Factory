package com.tdeado.factory.web;

import com.google.gson.Gson;
import com.sun.corba.se.spi.ior.ObjectKey;
import com.tdeado.factory.utils.CookieUtils;
import com.tdeado.factory.utils.StringUtils;
import com.tdeado.factory.utils.ToKenUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseController {
    @Value("${img.location}")
    protected String location;
    @Value("${img.directory}")
    protected String directory;
    protected Gson gson = new Gson();
    protected Map<String, Object> retData(Object data, int count, String msg) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("count", count);
        map.put("msg", msg);
        map.put("data", data);
        return map;
    }

    protected Map<String, Object> retData(Object data, long count, String msg) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("count", count);
        map.put("msg", msg);
        map.put("data", data);
        return map;
    }

    protected Map<String, Object> retData(Object data, String msg) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("count", "操作成功");
        map.put("msg", msg);
        map.put("data", data);
        return map;
    }

    protected Map<String, Object> retData(Object data, int count) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("count", count);
        map.put("msg", "操作成功");
        map.put("data", data);
        return map;
    }

    protected Map<String, Object> retData(Object data, long count) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("count", count);
        map.put("msg", "操作成功");
        map.put("data", data);
        return map;
    }

    protected Map<String, Object> retData(Object data) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("count", 0);
        map.put("msg", "操作成功");
        map.put("data", data);
        return map;
    }

    /**
     * 验证参数是否为空
     *
     * @param str
     */
    protected void verifyParam(String... str) {
        if (str != null) {
            for (String item : str) {
                if (!StringUtils.isEmpty(item)) {
                    throw new RuntimeException("参数错误");
                }
            }
        }
    }
    protected void errorRet(String string){
        throw new RuntimeException(string);
    }

    /**
     * 保存文件，直接以multipartFile形式
     *
     * @param multipartFile
     * @param path          文件保存绝对路径
     * @return 返回文件名
     * @throws IOException
     */
    public static String saveImg(MultipartFile multipartFile, String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        FileInputStream fileInputStream = (FileInputStream) multipartFile.getInputStream();
        String fileName = ToKenUtils.getMD5(new Date().toString() + fileInputStream.toString()) + ".png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + File.separator + fileName));
        byte[] bs = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bs)) != -1) {
            bos.write(bs, 0, len);
        }
        bos.flush();
        bos.close();
        return fileName;
    }

    public static boolean isLogin(HttpServletRequest request) {
        try {
            Cookie cookie = CookieUtils.getCookieFromCookies(request.getCookies(), "token");
            if (null != cookie && !"".equals(cookie.getValue())) {
                Object obj = request.getSession().getAttribute(cookie.getValue());
                if (null != obj) {
                    return true;
                } else {

                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

}
