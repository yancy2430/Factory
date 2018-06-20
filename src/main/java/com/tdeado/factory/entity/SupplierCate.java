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
public class SupplierCate implements Serializable {

    private static final long serialVersionUID = 1524998397183L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 供应商分类
    * isNullAble:0,defaultVal:
    */
    private String cateName;

    /**
    * 
    * isNullAble:0
    */
    private Integer upId;


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

    public void setUpId(Integer upId){
        this.upId = upId;
    }

    public Integer getUpId(){
        return this.upId;
    }
    @Override
    public String toString() {
        return "SupplierCate{" +
                "id='" + id + '\'' +
                "cateName='" + cateName + '\'' +
                "upId='" + upId + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends SupplierCate{
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
        private List<Integer> upIdList;

        private Integer upIdSt;

        private Integer upIdEd;

        public Integer getUpIdSt(){
            return this.upIdSt;
        }

        public Integer getUpIdEd(){
            return this.upIdEd;
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



        public QueryBuilder upIdBetWeen(Integer upIdSt,Integer upIdEd){
            this.upIdSt = upIdSt;
            this.upIdEd = upIdEd;
            return this;
        }

        public QueryBuilder upIdGreaterEqThan(Integer upIdSt){
            this.upIdSt = upIdSt;
            return this;
        }
        public QueryBuilder upIdLessEqThan(Integer upIdEd){
            this.upIdEd = upIdEd;
            return this;
        }


        public QueryBuilder upId(Integer upId){
            setUpId(upId);
            return this;
        }

        public QueryBuilder upIdList(Integer ... upId){
            if (upId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : upId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.upIdList = list;
            }

            return this;
        }

        public QueryBuilder upIdList(List<Integer> upId){
            this.upIdList = upId;
            return this;
        }

        public QueryBuilder fetchUpId(){
            setFetchFields("fetchFields","upId");
            return this;
        }

        public QueryBuilder excludeUpId(){
            setFetchFields("excludeFields","upId");
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

        public SupplierCate build(){
            return this;
        }
    }

}
