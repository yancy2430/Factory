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
public class RolePri implements Serializable {

    private static final long serialVersionUID = 1524998359333L;


    /**
    * 权限id
    * isNullAble:0
    */
    private Integer priId;

    /**
    * 角色id
    * isNullAble:0
    */
    private Integer roleId;


    public void setPriId(Integer priId){
        this.priId = priId;
    }

    public Integer getPriId(){
        return this.priId;
    }

    public void setRoleId(Integer roleId){
        this.roleId = roleId;
    }

    public Integer getRoleId(){
        return this.roleId;
    }
    @Override
    public String toString() {
        return "RolePri{" +
                "priId='" + priId + '\'' +
                "roleId='" + roleId + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends RolePri{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> priIdList;

        private Integer priIdSt;

        private Integer priIdEd;

        public Integer getPriIdSt(){
            return this.priIdSt;
        }

        public Integer getPriIdEd(){
            return this.priIdEd;
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

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder priIdBetWeen(Integer priIdSt,Integer priIdEd){
            this.priIdSt = priIdSt;
            this.priIdEd = priIdEd;
            return this;
        }

        public QueryBuilder priIdGreaterEqThan(Integer priIdSt){
            this.priIdSt = priIdSt;
            return this;
        }
        public QueryBuilder priIdLessEqThan(Integer priIdEd){
            this.priIdEd = priIdEd;
            return this;
        }


        public QueryBuilder priId(Integer priId){
            setPriId(priId);
            return this;
        }

        public QueryBuilder priIdList(Integer ... priId){
            if (priId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : priId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.priIdList = list;
            }

            return this;
        }

        public QueryBuilder priIdList(List<Integer> priId){
            this.priIdList = priId;
            return this;
        }

        public QueryBuilder fetchPriId(){
            setFetchFields("fetchFields","priId");
            return this;
        }

        public QueryBuilder excludePriId(){
            setFetchFields("excludeFields","priId");
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

        public RolePri build(){
            return this;
        }
    }

}
