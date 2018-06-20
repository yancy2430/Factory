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
public class Privilege implements Serializable {

    private static final long serialVersionUID = 1524998304460L;


    /**
    * 主键
    * id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 权限名称
    * isNullAble:0
    */
    private String priName;

    /**
    * 模块名称
    * isNullAble:0,defaultVal:
    */
    private String moduleName;

    /**
    * 控制器名称
    * isNullAble:0,defaultVal:
    */
    private String controllerName;

    /**
    * 方法名称
    * isNullAble:0,defaultVal:
    */
    private String actionName;

    /**
    * 上级权限id
    * isNullAble:0,defaultVal:0
    */
    private Integer parentId;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setPriName(String priName){
        this.priName = priName;
    }

    public String getPriName(){
        return this.priName;
    }

    public void setModuleName(String moduleName){
        this.moduleName = moduleName;
    }

    public String getModuleName(){
        return this.moduleName;
    }

    public void setControllerName(String controllerName){
        this.controllerName = controllerName;
    }

    public String getControllerName(){
        return this.controllerName;
    }

    public void setActionName(String actionName){
        this.actionName = actionName;
    }

    public String getActionName(){
        return this.actionName;
    }

    public void setParentId(Integer parentId){
        this.parentId = parentId;
    }

    public Integer getParentId(){
        return this.parentId;
    }
    @Override
    public String toString() {
        return "Privilege{" +
                "id='" + id + '\'' +
                "priName='" + priName + '\'' +
                "moduleName='" + moduleName + '\'' +
                "controllerName='" + controllerName + '\'' +
                "actionName='" + actionName + '\'' +
                "parentId='" + parentId + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Privilege{
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

        private List<String> priNameList;


        private List<String> fuzzyPriName;

        public List<String> getFuzzyPriName(){
            return this.fuzzyPriName;
        }

        private List<String> rightFuzzyPriName;

        public List<String> getRightFuzzyPriName(){
            return this.rightFuzzyPriName;
        }
        private List<String> moduleNameList;


        private List<String> fuzzyModuleName;

        public List<String> getFuzzyModuleName(){
            return this.fuzzyModuleName;
        }

        private List<String> rightFuzzyModuleName;

        public List<String> getRightFuzzyModuleName(){
            return this.rightFuzzyModuleName;
        }
        private List<String> controllerNameList;


        private List<String> fuzzyControllerName;

        public List<String> getFuzzyControllerName(){
            return this.fuzzyControllerName;
        }

        private List<String> rightFuzzyControllerName;

        public List<String> getRightFuzzyControllerName(){
            return this.rightFuzzyControllerName;
        }
        private List<String> actionNameList;


        private List<String> fuzzyActionName;

        public List<String> getFuzzyActionName(){
            return this.fuzzyActionName;
        }

        private List<String> rightFuzzyActionName;

        public List<String> getRightFuzzyActionName(){
            return this.rightFuzzyActionName;
        }
        private List<Integer> parentIdList;

        private Integer parentIdSt;

        private Integer parentIdEd;

        public Integer getParentIdSt(){
            return this.parentIdSt;
        }

        public Integer getParentIdEd(){
            return this.parentIdEd;
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



        public QueryBuilder fuzzyPriName (List<String> fuzzyPriName){
            this.fuzzyPriName = fuzzyPriName;
            return this;
        }

        public QueryBuilder fuzzyPriName (String ... fuzzyPriName){
            if (fuzzyPriName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPriName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPriName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPriName (List<String> rightFuzzyPriName){
            this.rightFuzzyPriName = rightFuzzyPriName;
            return this;
        }

        public QueryBuilder rightFuzzyPriName (String ... rightFuzzyPriName){
            if (rightFuzzyPriName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPriName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPriName = list;
            }
            return this;
        }

        public QueryBuilder priName(String priName){
            setPriName(priName);
            return this;
        }

        public QueryBuilder priNameList(String ... priName){
            if (priName != null){
                List<String> list = new ArrayList<>();
                for (String item : priName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.priNameList = list;
            }

            return this;
        }

        public QueryBuilder priNameList(List<String> priName){
            this.priNameList = priName;
            return this;
        }

        public QueryBuilder fetchPriName(){
            setFetchFields("fetchFields","priName");
            return this;
        }

        public QueryBuilder excludePriName(){
            setFetchFields("excludeFields","priName");
            return this;
        }



        public QueryBuilder fuzzyModuleName (List<String> fuzzyModuleName){
            this.fuzzyModuleName = fuzzyModuleName;
            return this;
        }

        public QueryBuilder fuzzyModuleName (String ... fuzzyModuleName){
            if (fuzzyModuleName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyModuleName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyModuleName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyModuleName (List<String> rightFuzzyModuleName){
            this.rightFuzzyModuleName = rightFuzzyModuleName;
            return this;
        }

        public QueryBuilder rightFuzzyModuleName (String ... rightFuzzyModuleName){
            if (rightFuzzyModuleName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyModuleName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyModuleName = list;
            }
            return this;
        }

        public QueryBuilder moduleName(String moduleName){
            setModuleName(moduleName);
            return this;
        }

        public QueryBuilder moduleNameList(String ... moduleName){
            if (moduleName != null){
                List<String> list = new ArrayList<>();
                for (String item : moduleName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.moduleNameList = list;
            }

            return this;
        }

        public QueryBuilder moduleNameList(List<String> moduleName){
            this.moduleNameList = moduleName;
            return this;
        }

        public QueryBuilder fetchModuleName(){
            setFetchFields("fetchFields","moduleName");
            return this;
        }

        public QueryBuilder excludeModuleName(){
            setFetchFields("excludeFields","moduleName");
            return this;
        }



        public QueryBuilder fuzzyControllerName (List<String> fuzzyControllerName){
            this.fuzzyControllerName = fuzzyControllerName;
            return this;
        }

        public QueryBuilder fuzzyControllerName (String ... fuzzyControllerName){
            if (fuzzyControllerName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyControllerName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyControllerName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyControllerName (List<String> rightFuzzyControllerName){
            this.rightFuzzyControllerName = rightFuzzyControllerName;
            return this;
        }

        public QueryBuilder rightFuzzyControllerName (String ... rightFuzzyControllerName){
            if (rightFuzzyControllerName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyControllerName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyControllerName = list;
            }
            return this;
        }

        public QueryBuilder controllerName(String controllerName){
            setControllerName(controllerName);
            return this;
        }

        public QueryBuilder controllerNameList(String ... controllerName){
            if (controllerName != null){
                List<String> list = new ArrayList<>();
                for (String item : controllerName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.controllerNameList = list;
            }

            return this;
        }

        public QueryBuilder controllerNameList(List<String> controllerName){
            this.controllerNameList = controllerName;
            return this;
        }

        public QueryBuilder fetchControllerName(){
            setFetchFields("fetchFields","controllerName");
            return this;
        }

        public QueryBuilder excludeControllerName(){
            setFetchFields("excludeFields","controllerName");
            return this;
        }



        public QueryBuilder fuzzyActionName (List<String> fuzzyActionName){
            this.fuzzyActionName = fuzzyActionName;
            return this;
        }

        public QueryBuilder fuzzyActionName (String ... fuzzyActionName){
            if (fuzzyActionName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyActionName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyActionName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyActionName (List<String> rightFuzzyActionName){
            this.rightFuzzyActionName = rightFuzzyActionName;
            return this;
        }

        public QueryBuilder rightFuzzyActionName (String ... rightFuzzyActionName){
            if (rightFuzzyActionName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyActionName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyActionName = list;
            }
            return this;
        }

        public QueryBuilder actionName(String actionName){
            setActionName(actionName);
            return this;
        }

        public QueryBuilder actionNameList(String ... actionName){
            if (actionName != null){
                List<String> list = new ArrayList<>();
                for (String item : actionName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.actionNameList = list;
            }

            return this;
        }

        public QueryBuilder actionNameList(List<String> actionName){
            this.actionNameList = actionName;
            return this;
        }

        public QueryBuilder fetchActionName(){
            setFetchFields("fetchFields","actionName");
            return this;
        }

        public QueryBuilder excludeActionName(){
            setFetchFields("excludeFields","actionName");
            return this;
        }



        public QueryBuilder parentIdBetWeen(Integer parentIdSt,Integer parentIdEd){
            this.parentIdSt = parentIdSt;
            this.parentIdEd = parentIdEd;
            return this;
        }

        public QueryBuilder parentIdGreaterEqThan(Integer parentIdSt){
            this.parentIdSt = parentIdSt;
            return this;
        }
        public QueryBuilder parentIdLessEqThan(Integer parentIdEd){
            this.parentIdEd = parentIdEd;
            return this;
        }


        public QueryBuilder parentId(Integer parentId){
            setParentId(parentId);
            return this;
        }

        public QueryBuilder parentIdList(Integer ... parentId){
            if (parentId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : parentId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.parentIdList = list;
            }

            return this;
        }

        public QueryBuilder parentIdList(List<Integer> parentId){
            this.parentIdList = parentId;
            return this;
        }

        public QueryBuilder fetchParentId(){
            setFetchFields("fetchFields","parentId");
            return this;
        }

        public QueryBuilder excludeParentId(){
            setFetchFields("excludeFields","parentId");
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

        public Privilege build(){
            return this;
        }
    }

}
