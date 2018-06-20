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
public class Model implements Serializable {

    private static final long serialVersionUID = 1524998261859L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:0
    */
    private String modName;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setModName(String modName){
        this.modName = modName;
    }

    public String getModName(){
        return this.modName;
    }
    @Override
    public String toString() {
        return "Model{" +
                "id='" + id + '\'' +
                "modName='" + modName + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Model{
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

        private List<String> modNameList;


        private List<String> fuzzyModName;

        public List<String> getFuzzyModName(){
            return this.fuzzyModName;
        }

        private List<String> rightFuzzyModName;

        public List<String> getRightFuzzyModName(){
            return this.rightFuzzyModName;
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



        public QueryBuilder fuzzyModName (List<String> fuzzyModName){
            this.fuzzyModName = fuzzyModName;
            return this;
        }

        public QueryBuilder fuzzyModName (String ... fuzzyModName){
            if (fuzzyModName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyModName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyModName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyModName (List<String> rightFuzzyModName){
            this.rightFuzzyModName = rightFuzzyModName;
            return this;
        }

        public QueryBuilder rightFuzzyModName (String ... rightFuzzyModName){
            if (rightFuzzyModName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyModName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyModName = list;
            }
            return this;
        }

        public QueryBuilder modName(String modName){
            setModName(modName);
            return this;
        }

        public QueryBuilder modNameList(String ... modName){
            if (modName != null){
                List<String> list = new ArrayList<>();
                for (String item : modName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.modNameList = list;
            }

            return this;
        }

        public QueryBuilder modNameList(List<String> modName){
            this.modNameList = modName;
            return this;
        }

        public QueryBuilder fetchModName(){
            setFetchFields("fetchFields","modName");
            return this;
        }

        public QueryBuilder excludeModName(){
            setFetchFields("excludeFields","modName");
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

        public Model build(){
            return this;
        }
    }

}
