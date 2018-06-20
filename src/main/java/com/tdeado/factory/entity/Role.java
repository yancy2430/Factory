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
public class Role implements Serializable {

    private static final long serialVersionUID = 1524998353236L;


    /**
    * 主键
    * id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 角色名称
    * isNullAble:0
    */
    private String roleName;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setRoleName(String roleName){
        this.roleName = roleName;
    }

    public String getRoleName(){
        return this.roleName;
    }
    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                "roleName='" + roleName + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Role{
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

        private List<String> roleNameList;


        private List<String> fuzzyRoleName;

        public List<String> getFuzzyRoleName(){
            return this.fuzzyRoleName;
        }

        private List<String> rightFuzzyRoleName;

        public List<String> getRightFuzzyRoleName(){
            return this.rightFuzzyRoleName;
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

        public Role build(){
            return this;
        }
    }

}
