package com.tdeado.factory.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author 
*/
public class Admin implements Serializable {

    private static final long serialVersionUID = 1524996899413L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 账号
    * isNullAble:0
    */
    private String username;

    /**
    * 密码
    * isNullAble:0
    */
    private String password;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer roleId;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String roleName;

    /**
    * 最后登录时间
    * isNullAble:0,defaultVal:0
    */
    private Integer loginTime;

    /**
    * 登录ip
    * isNullAble:0
    */
    private String loginIp;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer status;

    /**
    * 
    * isNullAble:1
    */
    private String actions;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setRoleId(Integer roleId){
        this.roleId = roleId;
    }

    public Integer getRoleId(){
        return this.roleId;
    }

    public void setRoleName(String roleName){
        this.roleName = roleName;
    }

    public String getRoleName(){
        return this.roleName;
    }

    public void setLoginTime(Integer loginTime){
        this.loginTime = loginTime;
    }

    public Integer getLoginTime(){
        return this.loginTime;
    }

    public void setLoginIp(String loginIp){
        this.loginIp = loginIp;
    }

    public String getLoginIp(){
        return this.loginIp;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public Integer getStatus(){
        return this.status;
    }

    public void setActions(String actions){
        this.actions = actions;
    }

    public String getActions(){
        return this.actions;
    }
    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                "username='" + username + '\'' +
                "password='" + password + '\'' +
                "roleId='" + roleId + '\'' +
                "roleName='" + roleName + '\'' +
                "loginTime='" + loginTime + '\'' +
                "loginIp='" + loginIp + '\'' +
                "status='" + status + '\'' +
                "actions='" + actions + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Admin{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> idList;

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){
            return this.idSt;
        }

        public Integer getIdEd(){
            return this.idEd;
        }

        private List<String> usernameList;


        private List<String> fuzzyUsername;

        public List<String> getFuzzyUsername(){
            return this.fuzzyUsername;
        }

        private List<String> rightFuzzyUsername;

        public List<String> getRightFuzzyUsername(){
            return this.rightFuzzyUsername;
        }
        private List<String> passwordList;


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){
            return this.fuzzyPassword;
        }

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){
            return this.rightFuzzyPassword;
        }
        private List<Integer> roleIdList;

        private Integer roleIdSt;

        private Integer roleIdEd;

        public Integer getRoleIdSt(){
            return this.roleIdSt;
        }

        public Integer getRoleIdEd(){
            return this.roleIdEd;
        }

        private List<String> roleNameList;


        private List<String> fuzzyRoleName;

        public List<String> getFuzzyRoleName(){
            return this.fuzzyRoleName;
        }

        private List<String> rightFuzzyRoleName;

        public List<String> getRightFuzzyRoleName(){
            return this.rightFuzzyRoleName;
        }
        private List<Integer> loginTimeList;

        private Integer loginTimeSt;

        private Integer loginTimeEd;

        public Integer getLoginTimeSt(){
            return this.loginTimeSt;
        }

        public Integer getLoginTimeEd(){
            return this.loginTimeEd;
        }

        private List<String> loginIpList;


        private List<String> fuzzyLoginIp;

        public List<String> getFuzzyLoginIp(){
            return this.fuzzyLoginIp;
        }

        private List<String> rightFuzzyLoginIp;

        public List<String> getRightFuzzyLoginIp(){
            return this.rightFuzzyLoginIp;
        }
        private List<Integer> statusList;

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){
            return this.statusSt;
        }

        public Integer getStatusEd(){
            return this.statusEd;
        }

        private List<String> actionsList;


        private List<String> fuzzyActions;

        public List<String> getFuzzyActions(){
            return this.fuzzyActions;
        }

        private List<String> rightFuzzyActions;

        public List<String> getRightFuzzyActions(){
            return this.rightFuzzyActions;
        }
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            if (id != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : id){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.idList = list;
            }

            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }



        public QueryBuilder fuzzyUsername (List<String> fuzzyUsername){
            this.fuzzyUsername = fuzzyUsername;
            return this;
        }

        public QueryBuilder fuzzyUsername (String ... fuzzyUsername){
            if (fuzzyUsername != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyUsername){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyUsername = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyUsername (List<String> rightFuzzyUsername){
            this.rightFuzzyUsername = rightFuzzyUsername;
            return this;
        }

        public QueryBuilder rightFuzzyUsername (String ... rightFuzzyUsername){
            if (rightFuzzyUsername != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyUsername){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyUsername = list;
            }
            return this;
        }

        public QueryBuilder username(String username){
            setUsername(username);
            return this;
        }

        public QueryBuilder usernameList(String ... username){
            if (username != null){
                List<String> list = new ArrayList<>();
                for (String item : username){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.usernameList = list;
            }

            return this;
        }

        public QueryBuilder usernameList(List<String> username){
            this.usernameList = username;
            return this;
        }

        public QueryBuilder fetchUsername(){
            setFetchFields("fetchFields","username");
            return this;
        }

        public QueryBuilder excludeUsername(){
            setFetchFields("excludeFields","username");
            return this;
        }



        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            if (fuzzyPassword != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPassword){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPassword = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            if (rightFuzzyPassword != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPassword){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPassword = list;
            }
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            if (password != null){
                List<String> list = new ArrayList<>();
                for (String item : password){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.passwordList = list;
            }

            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
            return this;
        }



        public QueryBuilder roleIdBetWeen(Integer roleIdSt,Integer roleIdEd){
            this.roleIdSt = roleIdSt;
            this.roleIdEd = roleIdEd;
            return this;
        }

        public QueryBuilder roleIdGreaterEqThan(Integer roleIdSt){
            this.roleIdSt = roleIdSt;
            return this;
        }
        public QueryBuilder roleIdLessEqThan(Integer roleIdEd){
            this.roleIdEd = roleIdEd;
            return this;
        }


        public QueryBuilder roleId(Integer roleId){
            setRoleId(roleId);
            return this;
        }

        public QueryBuilder roleIdList(Integer ... roleId){
            if (roleId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : roleId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.roleIdList = list;
            }

            return this;
        }

        public QueryBuilder roleIdList(List<Integer> roleId){
            this.roleIdList = roleId;
            return this;
        }

        public QueryBuilder fetchRoleId(){
            setFetchFields("fetchFields","roleId");
            return this;
        }

        public QueryBuilder excludeRoleId(){
            setFetchFields("excludeFields","roleId");
            return this;
        }



        public QueryBuilder fuzzyRoleName (List<String> fuzzyRoleName){
            this.fuzzyRoleName = fuzzyRoleName;
            return this;
        }

        public QueryBuilder fuzzyRoleName (String ... fuzzyRoleName){
            if (fuzzyRoleName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyRoleName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyRoleName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyRoleName (List<String> rightFuzzyRoleName){
            this.rightFuzzyRoleName = rightFuzzyRoleName;
            return this;
        }

        public QueryBuilder rightFuzzyRoleName (String ... rightFuzzyRoleName){
            if (rightFuzzyRoleName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyRoleName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyRoleName = list;
            }
            return this;
        }

        public QueryBuilder roleName(String roleName){
            setRoleName(roleName);
            return this;
        }

        public QueryBuilder roleNameList(String ... roleName){
            if (roleName != null){
                List<String> list = new ArrayList<>();
                for (String item : roleName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.roleNameList = list;
            }

            return this;
        }

        public QueryBuilder roleNameList(List<String> roleName){
            this.roleNameList = roleName;
            return this;
        }

        public QueryBuilder fetchRoleName(){
            setFetchFields("fetchFields","roleName");
            return this;
        }

        public QueryBuilder excludeRoleName(){
            setFetchFields("excludeFields","roleName");
            return this;
        }



        public QueryBuilder loginTimeBetWeen(Integer loginTimeSt,Integer loginTimeEd){
            this.loginTimeSt = loginTimeSt;
            this.loginTimeEd = loginTimeEd;
            return this;
        }

        public QueryBuilder loginTimeGreaterEqThan(Integer loginTimeSt){
            this.loginTimeSt = loginTimeSt;
            return this;
        }
        public QueryBuilder loginTimeLessEqThan(Integer loginTimeEd){
            this.loginTimeEd = loginTimeEd;
            return this;
        }


        public QueryBuilder loginTime(Integer loginTime){
            setLoginTime(loginTime);
            return this;
        }

        public QueryBuilder loginTimeList(Integer ... loginTime){
            if (loginTime != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : loginTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.loginTimeList = list;
            }

            return this;
        }

        public QueryBuilder loginTimeList(List<Integer> loginTime){
            this.loginTimeList = loginTime;
            return this;
        }

        public QueryBuilder fetchLoginTime(){
            setFetchFields("fetchFields","loginTime");
            return this;
        }

        public QueryBuilder excludeLoginTime(){
            setFetchFields("excludeFields","loginTime");
            return this;
        }



        public QueryBuilder fuzzyLoginIp (List<String> fuzzyLoginIp){
            this.fuzzyLoginIp = fuzzyLoginIp;
            return this;
        }

        public QueryBuilder fuzzyLoginIp (String ... fuzzyLoginIp){
            if (fuzzyLoginIp != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyLoginIp){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyLoginIp = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyLoginIp (List<String> rightFuzzyLoginIp){
            this.rightFuzzyLoginIp = rightFuzzyLoginIp;
            return this;
        }

        public QueryBuilder rightFuzzyLoginIp (String ... rightFuzzyLoginIp){
            if (rightFuzzyLoginIp != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyLoginIp){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyLoginIp = list;
            }
            return this;
        }

        public QueryBuilder loginIp(String loginIp){
            setLoginIp(loginIp);
            return this;
        }

        public QueryBuilder loginIpList(String ... loginIp){
            if (loginIp != null){
                List<String> list = new ArrayList<>();
                for (String item : loginIp){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.loginIpList = list;
            }

            return this;
        }

        public QueryBuilder loginIpList(List<String> loginIp){
            this.loginIpList = loginIp;
            return this;
        }

        public QueryBuilder fetchLoginIp(){
            setFetchFields("fetchFields","loginIp");
            return this;
        }

        public QueryBuilder excludeLoginIp(){
            setFetchFields("excludeFields","loginIp");
            return this;
        }



        public QueryBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public QueryBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public QueryBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public QueryBuilder status(Integer status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(Integer ... status){
            if (status != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : status){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.statusList = list;
            }

            return this;
        }

        public QueryBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }



        public QueryBuilder fuzzyActions (List<String> fuzzyActions){
            this.fuzzyActions = fuzzyActions;
            return this;
        }

        public QueryBuilder fuzzyActions (String ... fuzzyActions){
            if (fuzzyActions != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyActions){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyActions = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyActions (List<String> rightFuzzyActions){
            this.rightFuzzyActions = rightFuzzyActions;
            return this;
        }

        public QueryBuilder rightFuzzyActions (String ... rightFuzzyActions){
            if (rightFuzzyActions != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyActions){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyActions = list;
            }
            return this;
        }

        public QueryBuilder actions(String actions){
            setActions(actions);
            return this;
        }

        public QueryBuilder actionsList(String ... actions){
            if (actions != null){
                List<String> list = new ArrayList<>();
                for (String item : actions){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.actionsList = list;
            }

            return this;
        }

        public QueryBuilder actionsList(List<String> actions){
            this.actionsList = actions;
            return this;
        }

        public QueryBuilder fetchActions(){
            setFetchFields("fetchFields","actions");
            return this;
        }

        public QueryBuilder excludeActions(){
            setFetchFields("excludeFields","actions");
            return this;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Admin build(){
            return this;
        }
    }

}
