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
public class UserCate implements Serializable {

    private static final long serialVersionUID = 1524998413505L;


    /**
    * 主键
    * 分类id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 部门名称
    * isNullAble:0,defaultVal:
    */
    private String cateName;

    /**
    * 上级部门
    * isNullAble:0,defaultVal:0
    */
    private Integer scid;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setCateName(String cateName){
        this.cateName = cateName;
    }

    public String getCateName(){
        return this.cateName;
    }

    public void setScid(Integer scid){
        this.scid = scid;
    }

    public Integer getScid(){
        return this.scid;
    }
    @Override
    public String toString() {
        return "UserCate{" +
                "id='" + id + '\'' +
                "cateName='" + cateName + '\'' +
                "scid='" + scid + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends UserCate{
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

        private List<String> cateNameList;


        private List<String> fuzzyCateName;

        public List<String> getFuzzyCateName(){
            return this.fuzzyCateName;
        }

        private List<String> rightFuzzyCateName;

        public List<String> getRightFuzzyCateName(){
            return this.rightFuzzyCateName;
        }
        private List<Integer> scidList;

        private Integer scidSt;

        private Integer scidEd;

        public Integer getScidSt(){
            return this.scidSt;
        }

        public Integer getScidEd(){
            return this.scidEd;
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



        public QueryBuilder fuzzyCateName (List<String> fuzzyCateName){
            this.fuzzyCateName = fuzzyCateName;
            return this;
        }

        public QueryBuilder fuzzyCateName (String ... fuzzyCateName){
            if (fuzzyCateName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyCateName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyCateName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyCateName (List<String> rightFuzzyCateName){
            this.rightFuzzyCateName = rightFuzzyCateName;
            return this;
        }

        public QueryBuilder rightFuzzyCateName (String ... rightFuzzyCateName){
            if (rightFuzzyCateName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyCateName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyCateName = list;
            }
            return this;
        }

        public QueryBuilder cateName(String cateName){
            setCateName(cateName);
            return this;
        }

        public QueryBuilder cateNameList(String ... cateName){
            if (cateName != null){
                List<String> list = new ArrayList<>();
                for (String item : cateName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.cateNameList = list;
            }

            return this;
        }

        public QueryBuilder cateNameList(List<String> cateName){
            this.cateNameList = cateName;
            return this;
        }

        public QueryBuilder fetchCateName(){
            setFetchFields("fetchFields","cateName");
            return this;
        }

        public QueryBuilder excludeCateName(){
            setFetchFields("excludeFields","cateName");
            return this;
        }



        public QueryBuilder scidBetWeen(Integer scidSt,Integer scidEd){
            this.scidSt = scidSt;
            this.scidEd = scidEd;
            return this;
        }

        public QueryBuilder scidGreaterEqThan(Integer scidSt){
            this.scidSt = scidSt;
            return this;
        }
        public QueryBuilder scidLessEqThan(Integer scidEd){
            this.scidEd = scidEd;
            return this;
        }


        public QueryBuilder scid(Integer scid){
            setScid(scid);
            return this;
        }

        public QueryBuilder scidList(Integer ... scid){
            if (scid != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : scid){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.scidList = list;
            }

            return this;
        }

        public QueryBuilder scidList(List<Integer> scid){
            this.scidList = scid;
            return this;
        }

        public QueryBuilder fetchScid(){
            setFetchFields("fetchFields","scid");
            return this;
        }

        public QueryBuilder excludeScid(){
            setFetchFields("excludeFields","scid");
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

        public UserCate build(){
            return this;
        }
    }

}
