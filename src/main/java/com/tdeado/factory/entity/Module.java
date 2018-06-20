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
public class Module implements Serializable {

    private static final long serialVersionUID = 1524998268595L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer pid;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String name;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String module;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String action;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String params;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer isMenu;

    /**
    * 是否有汇总数据
    * isNullAble:0,defaultVal:0
    */
    private Integer isCount;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer sort;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer level;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String icon;

    /**
    * 
    * isNullAble:0,defaultVal:0
    */
    private Integer addtime;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setPid(Integer pid){
        this.pid = pid;
    }

    public Integer getPid(){
        return this.pid;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setModule(String module){
        this.module = module;
    }

    public String getModule(){
        return this.module;
    }

    public void setAction(String action){
        this.action = action;
    }

    public String getAction(){
        return this.action;
    }

    public void setParams(String params){
        this.params = params;
    }

    public String getParams(){
        return this.params;
    }

    public void setIsMenu(Integer isMenu){
        this.isMenu = isMenu;
    }

    public Integer getIsMenu(){
        return this.isMenu;
    }

    public void setIsCount(Integer isCount){
        this.isCount = isCount;
    }

    public Integer getIsCount(){
        return this.isCount;
    }

    public void setSort(Integer sort){
        this.sort = sort;
    }

    public Integer getSort(){
        return this.sort;
    }

    public void setLevel(Integer level){
        this.level = level;
    }

    public Integer getLevel(){
        return this.level;
    }

    public void setIcon(String icon){
        this.icon = icon;
    }

    public String getIcon(){
        return this.icon;
    }

    public void setAddtime(Integer addtime){
        this.addtime = addtime;
    }

    public Integer getAddtime(){
        return this.addtime;
    }
    @Override
    public String toString() {
        return "Module{" +
                "id='" + id + '\'' +
                "pid='" + pid + '\'' +
                "name='" + name + '\'' +
                "module='" + module + '\'' +
                "action='" + action + '\'' +
                "params='" + params + '\'' +
                "isMenu='" + isMenu + '\'' +
                "isCount='" + isCount + '\'' +
                "sort='" + sort + '\'' +
                "level='" + level + '\'' +
                "icon='" + icon + '\'' +
                "addtime='" + addtime + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Module{
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

        private List<Integer> pidList;

        private Integer pidSt;

        private Integer pidEd;

        public Integer getPidSt(){
            return this.pidSt;
        }

        public Integer getPidEd(){
            return this.pidEd;
        }

        private List<String> nameList;


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){
            return this.fuzzyName;
        }

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){
            return this.rightFuzzyName;
        }
        private List<String> moduleList;


        private List<String> fuzzyModule;

        public List<String> getFuzzyModule(){
            return this.fuzzyModule;
        }

        private List<String> rightFuzzyModule;

        public List<String> getRightFuzzyModule(){
            return this.rightFuzzyModule;
        }
        private List<String> actionList;


        private List<String> fuzzyAction;

        public List<String> getFuzzyAction(){
            return this.fuzzyAction;
        }

        private List<String> rightFuzzyAction;

        public List<String> getRightFuzzyAction(){
            return this.rightFuzzyAction;
        }
        private List<String> paramsList;


        private List<String> fuzzyParams;

        public List<String> getFuzzyParams(){
            return this.fuzzyParams;
        }

        private List<String> rightFuzzyParams;

        public List<String> getRightFuzzyParams(){
            return this.rightFuzzyParams;
        }
        private List<Integer> isMenuList;

        private Integer isMenuSt;

        private Integer isMenuEd;

        public Integer getIsMenuSt(){
            return this.isMenuSt;
        }

        public Integer getIsMenuEd(){
            return this.isMenuEd;
        }

        private List<Integer> isCountList;

        private Integer isCountSt;

        private Integer isCountEd;

        public Integer getIsCountSt(){
            return this.isCountSt;
        }

        public Integer getIsCountEd(){
            return this.isCountEd;
        }

        private List<Integer> sortList;

        private Integer sortSt;

        private Integer sortEd;

        public Integer getSortSt(){
            return this.sortSt;
        }

        public Integer getSortEd(){
            return this.sortEd;
        }

        private List<Integer> levelList;

        private Integer levelSt;

        private Integer levelEd;

        public Integer getLevelSt(){
            return this.levelSt;
        }

        public Integer getLevelEd(){
            return this.levelEd;
        }

        private List<String> iconList;


        private List<String> fuzzyIcon;

        public List<String> getFuzzyIcon(){
            return this.fuzzyIcon;
        }

        private List<String> rightFuzzyIcon;

        public List<String> getRightFuzzyIcon(){
            return this.rightFuzzyIcon;
        }
        private List<Integer> addtimeList;

        private Integer addtimeSt;

        private Integer addtimeEd;

        public Integer getAddtimeSt(){
            return this.addtimeSt;
        }

        public Integer getAddtimeEd(){
            return this.addtimeEd;
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



        public QueryBuilder pidBetWeen(Integer pidSt,Integer pidEd){
            this.pidSt = pidSt;
            this.pidEd = pidEd;
            return this;
        }

        public QueryBuilder pidGreaterEqThan(Integer pidSt){
            this.pidSt = pidSt;
            return this;
        }
        public QueryBuilder pidLessEqThan(Integer pidEd){
            this.pidEd = pidEd;
            return this;
        }


        public QueryBuilder pid(Integer pid){
            setPid(pid);
            return this;
        }

        public QueryBuilder pidList(Integer ... pid){
            if (pid != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : pid){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.pidList = list;
            }

            return this;
        }

        public QueryBuilder pidList(List<Integer> pid){
            this.pidList = pid;
            return this;
        }

        public QueryBuilder fetchPid(){
            setFetchFields("fetchFields","pid");
            return this;
        }

        public QueryBuilder excludePid(){
            setFetchFields("excludeFields","pid");
            return this;
        }



        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            if (fuzzyName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            if (rightFuzzyName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyName = list;
            }
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            if (name != null){
                List<String> list = new ArrayList<>();
                for (String item : name){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.nameList = list;
            }

            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }



        public QueryBuilder fuzzyModule (List<String> fuzzyModule){
            this.fuzzyModule = fuzzyModule;
            return this;
        }

        public QueryBuilder fuzzyModule (String ... fuzzyModule){
            if (fuzzyModule != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyModule){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyModule = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyModule (List<String> rightFuzzyModule){
            this.rightFuzzyModule = rightFuzzyModule;
            return this;
        }

        public QueryBuilder rightFuzzyModule (String ... rightFuzzyModule){
            if (rightFuzzyModule != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyModule){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyModule = list;
            }
            return this;
        }

        public QueryBuilder module(String module){
            setModule(module);
            return this;
        }

        public QueryBuilder moduleList(String ... module){
            if (module != null){
                List<String> list = new ArrayList<>();
                for (String item : module){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.moduleList = list;
            }

            return this;
        }

        public QueryBuilder moduleList(List<String> module){
            this.moduleList = module;
            return this;
        }

        public QueryBuilder fetchModule(){
            setFetchFields("fetchFields","module");
            return this;
        }

        public QueryBuilder excludeModule(){
            setFetchFields("excludeFields","module");
            return this;
        }



        public QueryBuilder fuzzyAction (List<String> fuzzyAction){
            this.fuzzyAction = fuzzyAction;
            return this;
        }

        public QueryBuilder fuzzyAction (String ... fuzzyAction){
            if (fuzzyAction != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyAction){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyAction = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyAction (List<String> rightFuzzyAction){
            this.rightFuzzyAction = rightFuzzyAction;
            return this;
        }

        public QueryBuilder rightFuzzyAction (String ... rightFuzzyAction){
            if (rightFuzzyAction != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyAction){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyAction = list;
            }
            return this;
        }

        public QueryBuilder action(String action){
            setAction(action);
            return this;
        }

        public QueryBuilder actionList(String ... action){
            if (action != null){
                List<String> list = new ArrayList<>();
                for (String item : action){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.actionList = list;
            }

            return this;
        }

        public QueryBuilder actionList(List<String> action){
            this.actionList = action;
            return this;
        }

        public QueryBuilder fetchAction(){
            setFetchFields("fetchFields","action");
            return this;
        }

        public QueryBuilder excludeAction(){
            setFetchFields("excludeFields","action");
            return this;
        }



        public QueryBuilder fuzzyParams (List<String> fuzzyParams){
            this.fuzzyParams = fuzzyParams;
            return this;
        }

        public QueryBuilder fuzzyParams (String ... fuzzyParams){
            if (fuzzyParams != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyParams){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyParams = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyParams (List<String> rightFuzzyParams){
            this.rightFuzzyParams = rightFuzzyParams;
            return this;
        }

        public QueryBuilder rightFuzzyParams (String ... rightFuzzyParams){
            if (rightFuzzyParams != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyParams){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyParams = list;
            }
            return this;
        }

        public QueryBuilder params(String params){
            setParams(params);
            return this;
        }

        public QueryBuilder paramsList(String ... params){
            if (params != null){
                List<String> list = new ArrayList<>();
                for (String item : params){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.paramsList = list;
            }

            return this;
        }

        public QueryBuilder paramsList(List<String> params){
            this.paramsList = params;
            return this;
        }

        public QueryBuilder fetchParams(){
            setFetchFields("fetchFields","params");
            return this;
        }

        public QueryBuilder excludeParams(){
            setFetchFields("excludeFields","params");
            return this;
        }



        public QueryBuilder isMenuBetWeen(Integer isMenuSt,Integer isMenuEd){
            this.isMenuSt = isMenuSt;
            this.isMenuEd = isMenuEd;
            return this;
        }

        public QueryBuilder isMenuGreaterEqThan(Integer isMenuSt){
            this.isMenuSt = isMenuSt;
            return this;
        }
        public QueryBuilder isMenuLessEqThan(Integer isMenuEd){
            this.isMenuEd = isMenuEd;
            return this;
        }


        public QueryBuilder isMenu(Integer isMenu){
            setIsMenu(isMenu);
            return this;
        }

        public QueryBuilder isMenuList(Integer ... isMenu){
            if (isMenu != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : isMenu){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.isMenuList = list;
            }

            return this;
        }

        public QueryBuilder isMenuList(List<Integer> isMenu){
            this.isMenuList = isMenu;
            return this;
        }

        public QueryBuilder fetchIsMenu(){
            setFetchFields("fetchFields","isMenu");
            return this;
        }

        public QueryBuilder excludeIsMenu(){
            setFetchFields("excludeFields","isMenu");
            return this;
        }



        public QueryBuilder isCountBetWeen(Integer isCountSt,Integer isCountEd){
            this.isCountSt = isCountSt;
            this.isCountEd = isCountEd;
            return this;
        }

        public QueryBuilder isCountGreaterEqThan(Integer isCountSt){
            this.isCountSt = isCountSt;
            return this;
        }
        public QueryBuilder isCountLessEqThan(Integer isCountEd){
            this.isCountEd = isCountEd;
            return this;
        }


        public QueryBuilder isCount(Integer isCount){
            setIsCount(isCount);
            return this;
        }

        public QueryBuilder isCountList(Integer ... isCount){
            if (isCount != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : isCount){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.isCountList = list;
            }

            return this;
        }

        public QueryBuilder isCountList(List<Integer> isCount){
            this.isCountList = isCount;
            return this;
        }

        public QueryBuilder fetchIsCount(){
            setFetchFields("fetchFields","isCount");
            return this;
        }

        public QueryBuilder excludeIsCount(){
            setFetchFields("excludeFields","isCount");
            return this;
        }



        public QueryBuilder sortBetWeen(Integer sortSt,Integer sortEd){
            this.sortSt = sortSt;
            this.sortEd = sortEd;
            return this;
        }

        public QueryBuilder sortGreaterEqThan(Integer sortSt){
            this.sortSt = sortSt;
            return this;
        }
        public QueryBuilder sortLessEqThan(Integer sortEd){
            this.sortEd = sortEd;
            return this;
        }


        public QueryBuilder sort(Integer sort){
            setSort(sort);
            return this;
        }

        public QueryBuilder sortList(Integer ... sort){
            if (sort != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : sort){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.sortList = list;
            }

            return this;
        }

        public QueryBuilder sortList(List<Integer> sort){
            this.sortList = sort;
            return this;
        }

        public QueryBuilder fetchSort(){
            setFetchFields("fetchFields","sort");
            return this;
        }

        public QueryBuilder excludeSort(){
            setFetchFields("excludeFields","sort");
            return this;
        }



        public QueryBuilder levelBetWeen(Integer levelSt,Integer levelEd){
            this.levelSt = levelSt;
            this.levelEd = levelEd;
            return this;
        }

        public QueryBuilder levelGreaterEqThan(Integer levelSt){
            this.levelSt = levelSt;
            return this;
        }
        public QueryBuilder levelLessEqThan(Integer levelEd){
            this.levelEd = levelEd;
            return this;
        }


        public QueryBuilder level(Integer level){
            setLevel(level);
            return this;
        }

        public QueryBuilder levelList(Integer ... level){
            if (level != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : level){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.levelList = list;
            }

            return this;
        }

        public QueryBuilder levelList(List<Integer> level){
            this.levelList = level;
            return this;
        }

        public QueryBuilder fetchLevel(){
            setFetchFields("fetchFields","level");
            return this;
        }

        public QueryBuilder excludeLevel(){
            setFetchFields("excludeFields","level");
            return this;
        }



        public QueryBuilder fuzzyIcon (List<String> fuzzyIcon){
            this.fuzzyIcon = fuzzyIcon;
            return this;
        }

        public QueryBuilder fuzzyIcon (String ... fuzzyIcon){
            if (fuzzyIcon != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyIcon){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyIcon = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyIcon (List<String> rightFuzzyIcon){
            this.rightFuzzyIcon = rightFuzzyIcon;
            return this;
        }

        public QueryBuilder rightFuzzyIcon (String ... rightFuzzyIcon){
            if (rightFuzzyIcon != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyIcon){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyIcon = list;
            }
            return this;
        }

        public QueryBuilder icon(String icon){
            setIcon(icon);
            return this;
        }

        public QueryBuilder iconList(String ... icon){
            if (icon != null){
                List<String> list = new ArrayList<>();
                for (String item : icon){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.iconList = list;
            }

            return this;
        }

        public QueryBuilder iconList(List<String> icon){
            this.iconList = icon;
            return this;
        }

        public QueryBuilder fetchIcon(){
            setFetchFields("fetchFields","icon");
            return this;
        }

        public QueryBuilder excludeIcon(){
            setFetchFields("excludeFields","icon");
            return this;
        }



        public QueryBuilder addtimeBetWeen(Integer addtimeSt,Integer addtimeEd){
            this.addtimeSt = addtimeSt;
            this.addtimeEd = addtimeEd;
            return this;
        }

        public QueryBuilder addtimeGreaterEqThan(Integer addtimeSt){
            this.addtimeSt = addtimeSt;
            return this;
        }
        public QueryBuilder addtimeLessEqThan(Integer addtimeEd){
            this.addtimeEd = addtimeEd;
            return this;
        }


        public QueryBuilder addtime(Integer addtime){
            setAddtime(addtime);
            return this;
        }

        public QueryBuilder addtimeList(Integer ... addtime){
            if (addtime != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : addtime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.addtimeList = list;
            }

            return this;
        }

        public QueryBuilder addtimeList(List<Integer> addtime){
            this.addtimeList = addtime;
            return this;
        }

        public QueryBuilder fetchAddtime(){
            setFetchFields("fetchFields","addtime");
            return this;
        }

        public QueryBuilder excludeAddtime(){
            setFetchFields("excludeFields","addtime");
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

        public Module build(){
            return this;
        }
    }

}
