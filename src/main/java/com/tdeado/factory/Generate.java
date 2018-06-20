package com.tdeado.factory;

import com.sun.jdi.InvalidStackFrameException;

import java.lang.reflect.Field;

public class Generate {


    public static void main(String[] args) {

    }

    /**
     * 传入classBean 获取insert插入Sql语句
     */
    public static String getInsertSql(String table, Class t) {
        Field[] strs = getClassDeclaredFieldNames(t);
        String sql = "insert into " + table + " ";
        String p = "(";
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].getType().getName().equals("java.lang.String")) {
                if (i == strs.length - 1) {
                    p += " <if test=\"" + strs[i].getName() + "!=null and " + strs[i].getName() + "!=''\">" + strs[i].getName() + "</if>";
                } else {
                    p += " <if test=\"" + strs[i].getName() + "!=null and " + strs[i].getName() + "!=''\">" + strs[i].getName() + ",</if>";
                }
            } else {
                if (i == strs.length - 1) {
                    p += " <if test=\"" + strs[i].getName() + "!=null\">" + strs[i].getName() + "</if>";
                } else {
                    p += " <if test=\"" + strs[i].getName() + "!=null\">" + strs[i].getName() + ",</if>";
                }
            }
            System.out.println(strs[i].getName());
        }
        p += ")";
        sql += p;
        String values = "";

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].getType().getName().equals("java.lang.String")) {
                if (i == strs.length - 1) {
                    values += " <if test=\"" + strs[i].getName() + "!=null and " + strs[i].getName() + "!=''\">#{" + strs[i].getName() + "}</if>";
                } else {
                    values += " <if test=\"" + strs[i].getName() + "!=null and " + strs[i].getName() + "!=''\">#{" + strs[i].getName() + "},</if>";
                }
            } else {
                if (i == strs.length - 1) {
                    values += " <if test=\"" + strs[i].getName() + "!=null\">#{" + strs[i].getName() + "}</if>";
                } else {
                    values += " <if test=\"" + strs[i].getName() + "!=null\">#{" + strs[i].getName() + "},</if>";
                }
            }
        }
        sql += " values (" + values + ")";
        return sql;
    }

    /**
     * 传入classbean 获取update更新sql语句
     */

    public static String getUpdataSql(String table, Class t) {
        Field[] strs = getClassDeclaredFieldNames(t);
        String sql = "UPDATE " + table + " <trim prefix=\"set\" suffixOverrides=\",\">";
        for (int i = 0; i < strs.length; i++) {

            if (strs[i].getType().getName().equals("java.lang.String")) {
                sql = sql + " <if test=\"" + strs[i].getName() + "!=null and " + strs[i].getName() + "!=''\">" +
                        "" + strs[i].getName() + "=#{" + strs[i].getName() + "}" +
                        ",</if> ";
            } else {
                sql = sql + " <if test=\"" + strs[i].getName() + "!=null\">" +
                        "" + strs[i].getName() + "=#{" + strs[i].getName() + "}" +
                        ",</if> ";
            }

        }
        sql = sql + " </trim>  ";
        return sql;
    }

    /**
     * <if test="user_name!=null and user_name!=''">
     user_name=#{user_name}
     </if>
     */
    /**
     * 获取类属性名
     *
     * @param pclass
     * @return String[]
     * @throws InvalidStackFrameException
     */
    public static Field[] getClassDeclaredFieldNames(Class<?> pclass) throws InvalidStackFrameException {
        Field[] propertyField;
        if (pclass == null) {
            return null;
        }
        propertyField = pclass.getDeclaredFields();

        return propertyField;
    }

}
