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
public class StorageLocation implements Serializable {

    private static final long serialVersionUID = 1524998372956L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String locationName;

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

    public void setLocationName(String locationName){
        this.locationName = locationName;
    }

    public String getLocationName(){
        return this.locationName;
    }

    public void setUpId(Integer upId){
        this.upId = upId;
    }

    public Integer getUpId(){
        return this.upId;
    }
    @Override
    public String toString() {
        return "StorageLocation{" +
                "id='" + id + '\'' +
                "locationName='" + locationName + '\'' +
                "upId='" + upId + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends StorageLocation{
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

        private List<String> locationNameList;


        private List<String> fuzzyLocationName;

        public List<String> getFuzzyLocationName(){
            return this.fuzzyLocationName;
        }

        private List<String> rightFuzzyLocationName;

        public List<String> getRightFuzzyLocationName(){
            return this.rightFuzzyLocationName;
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



        public QueryBuilder fuzzyLocationName (List<String> fuzzyLocationName){
            this.fuzzyLocationName = fuzzyLocationName;
            return this;
        }

        public QueryBuilder fuzzyLocationName (String ... fuzzyLocationName){
            if (fuzzyLocationName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyLocationName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyLocationName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyLocationName (List<String> rightFuzzyLocationName){
            this.rightFuzzyLocationName = rightFuzzyLocationName;
            return this;
        }

        public QueryBuilder rightFuzzyLocationName (String ... rightFuzzyLocationName){
            if (rightFuzzyLocationName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyLocationName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyLocationName = list;
            }
            return this;
        }

        public QueryBuilder locationName(String locationName){
            setLocationName(locationName);
            return this;
        }

        public QueryBuilder locationNameList(String ... locationName){
            if (locationName != null){
                List<String> list = new ArrayList<>();
                for (String item : locationName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.locationNameList = list;
            }

            return this;
        }

        public QueryBuilder locationNameList(List<String> locationName){
            this.locationNameList = locationName;
            return this;
        }

        public QueryBuilder fetchLocationName(){
            setFetchFields("fetchFields","locationName");
            return this;
        }

        public QueryBuilder excludeLocationName(){
            setFetchFields("excludeFields","locationName");
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

        public StorageLocation build(){
            return this;
        }
    }

}
