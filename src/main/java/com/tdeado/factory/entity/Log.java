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
public class Log implements Serializable {

    private static final long serialVersionUID = 1524998255169L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer logId;

    /**
    * 
    * isNullAble:0
    */
    private String modular;

    /**
    * 
    * isNullAble:0
    */
    private String message;

    /**
    * 操作ID
    * isNullAble:0
    */
    private Integer operationid;

    /**
    * 
    * isNullAble:0
    */
    private String dateline;

    /**
    * 
    * isNullAble:0
    */
    private Integer adminId;


    public void setLogId(Integer logId){
        this.logId = logId;
    }

    public Integer getLogId(){
        return this.logId;
    }

    public void setModular(String modular){
        this.modular = modular;
    }

    public String getModular(){
        return this.modular;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public void setOperationid(Integer operationid){
        this.operationid = operationid;
    }

    public Integer getOperationid(){
        return this.operationid;
    }

    public void setDateline(String dateline){
        this.dateline = dateline;
    }

    public String getDateline(){
        return this.dateline;
    }

    public void setAdminId(Integer adminId){
        this.adminId = adminId;
    }

    public Integer getAdminId(){
        return this.adminId;
    }
    @Override
    public String toString() {
        return "Log{" +
                "logId='" + logId + '\'' +
                "modular='" + modular + '\'' +
                "message='" + message + '\'' +
                "operationid='" + operationid + '\'' +
                "dateline='" + dateline + '\'' +
                "adminId='" + adminId + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Log{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> logIdList;

        private Integer logIdSt;

        private Integer logIdEd;

        public Integer getLogIdSt(){
            return this.logIdSt;
        }

        public Integer getLogIdEd(){
            return this.logIdEd;
        }

        private List<String> modularList;


        private List<String> fuzzyModular;

        public List<String> getFuzzyModular(){
            return this.fuzzyModular;
        }

        private List<String> rightFuzzyModular;

        public List<String> getRightFuzzyModular(){
            return this.rightFuzzyModular;
        }
        private List<String> messageList;


        private List<String> fuzzyMessage;

        public List<String> getFuzzyMessage(){
            return this.fuzzyMessage;
        }

        private List<String> rightFuzzyMessage;

        public List<String> getRightFuzzyMessage(){
            return this.rightFuzzyMessage;
        }
        private List<Integer> operationidList;

        private Integer operationidSt;

        private Integer operationidEd;

        public Integer getOperationidSt(){
            return this.operationidSt;
        }

        public Integer getOperationidEd(){
            return this.operationidEd;
        }

        private List<String> datelineList;


        private List<String> fuzzyDateline;

        public List<String> getFuzzyDateline(){
            return this.fuzzyDateline;
        }

        private List<String> rightFuzzyDateline;

        public List<String> getRightFuzzyDateline(){
            return this.rightFuzzyDateline;
        }
        private List<Integer> adminIdList;

        private Integer adminIdSt;

        private Integer adminIdEd;

        public Integer getAdminIdSt(){
            return this.adminIdSt;
        }

        public Integer getAdminIdEd(){
            return this.adminIdEd;
        }

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder logIdBetWeen(Integer logIdSt,Integer logIdEd){
            this.logIdSt = logIdSt;
            this.logIdEd = logIdEd;
            return this;
        }

        public QueryBuilder logIdGreaterEqThan(Integer logIdSt){
            this.logIdSt = logIdSt;
            return this;
        }
        public QueryBuilder logIdLessEqThan(Integer logIdEd){
            this.logIdEd = logIdEd;
            return this;
        }


        public QueryBuilder logId(Integer logId){
            setLogId(logId);
            return this;
        }

        public QueryBuilder logIdList(Integer ... logId){
            if (logId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : logId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.logIdList = list;
            }

            return this;
        }

        public QueryBuilder logIdList(List<Integer> logId){
            this.logIdList = logId;
            return this;
        }

        public QueryBuilder fetchLogId(){
            setFetchFields("fetchFields","logId");
            return this;
        }

        public QueryBuilder excludeLogId(){
            setFetchFields("excludeFields","logId");
            return this;
        }



        public QueryBuilder fuzzyModular (List<String> fuzzyModular){
            this.fuzzyModular = fuzzyModular;
            return this;
        }

        public QueryBuilder fuzzyModular (String ... fuzzyModular){
            if (fuzzyModular != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyModular){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyModular = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyModular (List<String> rightFuzzyModular){
            this.rightFuzzyModular = rightFuzzyModular;
            return this;
        }

        public QueryBuilder rightFuzzyModular (String ... rightFuzzyModular){
            if (rightFuzzyModular != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyModular){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyModular = list;
            }
            return this;
        }

        public QueryBuilder modular(String modular){
            setModular(modular);
            return this;
        }

        public QueryBuilder modularList(String ... modular){
            if (modular != null){
                List<String> list = new ArrayList<>();
                for (String item : modular){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.modularList = list;
            }

            return this;
        }

        public QueryBuilder modularList(List<String> modular){
            this.modularList = modular;
            return this;
        }

        public QueryBuilder fetchModular(){
            setFetchFields("fetchFields","modular");
            return this;
        }

        public QueryBuilder excludeModular(){
            setFetchFields("excludeFields","modular");
            return this;
        }



        public QueryBuilder fuzzyMessage (List<String> fuzzyMessage){
            this.fuzzyMessage = fuzzyMessage;
            return this;
        }

        public QueryBuilder fuzzyMessage (String ... fuzzyMessage){
            if (fuzzyMessage != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyMessage){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyMessage = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyMessage (List<String> rightFuzzyMessage){
            this.rightFuzzyMessage = rightFuzzyMessage;
            return this;
        }

        public QueryBuilder rightFuzzyMessage (String ... rightFuzzyMessage){
            if (rightFuzzyMessage != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyMessage){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyMessage = list;
            }
            return this;
        }

        public QueryBuilder message(String message){
            setMessage(message);
            return this;
        }

        public QueryBuilder messageList(String ... message){
            if (message != null){
                List<String> list = new ArrayList<>();
                for (String item : message){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.messageList = list;
            }

            return this;
        }

        public QueryBuilder messageList(List<String> message){
            this.messageList = message;
            return this;
        }

        public QueryBuilder fetchMessage(){
            setFetchFields("fetchFields","message");
            return this;
        }

        public QueryBuilder excludeMessage(){
            setFetchFields("excludeFields","message");
            return this;
        }



        public QueryBuilder operationidBetWeen(Integer operationidSt,Integer operationidEd){
            this.operationidSt = operationidSt;
            this.operationidEd = operationidEd;
            return this;
        }

        public QueryBuilder operationidGreaterEqThan(Integer operationidSt){
            this.operationidSt = operationidSt;
            return this;
        }
        public QueryBuilder operationidLessEqThan(Integer operationidEd){
            this.operationidEd = operationidEd;
            return this;
        }


        public QueryBuilder operationid(Integer operationid){
            setOperationid(operationid);
            return this;
        }

        public QueryBuilder operationidList(Integer ... operationid){
            if (operationid != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : operationid){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.operationidList = list;
            }

            return this;
        }

        public QueryBuilder operationidList(List<Integer> operationid){
            this.operationidList = operationid;
            return this;
        }

        public QueryBuilder fetchOperationid(){
            setFetchFields("fetchFields","operationid");
            return this;
        }

        public QueryBuilder excludeOperationid(){
            setFetchFields("excludeFields","operationid");
            return this;
        }



        public QueryBuilder fuzzyDateline (List<String> fuzzyDateline){
            this.fuzzyDateline = fuzzyDateline;
            return this;
        }

        public QueryBuilder fuzzyDateline (String ... fuzzyDateline){
            if (fuzzyDateline != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyDateline){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyDateline = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyDateline (List<String> rightFuzzyDateline){
            this.rightFuzzyDateline = rightFuzzyDateline;
            return this;
        }

        public QueryBuilder rightFuzzyDateline (String ... rightFuzzyDateline){
            if (rightFuzzyDateline != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyDateline){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyDateline = list;
            }
            return this;
        }

        public QueryBuilder dateline(String dateline){
            setDateline(dateline);
            return this;
        }

        public QueryBuilder datelineList(String ... dateline){
            if (dateline != null){
                List<String> list = new ArrayList<>();
                for (String item : dateline){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.datelineList = list;
            }

            return this;
        }

        public QueryBuilder datelineList(List<String> dateline){
            this.datelineList = dateline;
            return this;
        }

        public QueryBuilder fetchDateline(){
            setFetchFields("fetchFields","dateline");
            return this;
        }

        public QueryBuilder excludeDateline(){
            setFetchFields("excludeFields","dateline");
            return this;
        }



        public QueryBuilder adminIdBetWeen(Integer adminIdSt,Integer adminIdEd){
            this.adminIdSt = adminIdSt;
            this.adminIdEd = adminIdEd;
            return this;
        }

        public QueryBuilder adminIdGreaterEqThan(Integer adminIdSt){
            this.adminIdSt = adminIdSt;
            return this;
        }
        public QueryBuilder adminIdLessEqThan(Integer adminIdEd){
            this.adminIdEd = adminIdEd;
            return this;
        }


        public QueryBuilder adminId(Integer adminId){
            setAdminId(adminId);
            return this;
        }

        public QueryBuilder adminIdList(Integer ... adminId){
            if (adminId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : adminId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.adminIdList = list;
            }

            return this;
        }

        public QueryBuilder adminIdList(List<Integer> adminId){
            this.adminIdList = adminId;
            return this;
        }

        public QueryBuilder fetchAdminId(){
            setFetchFields("fetchFields","adminId");
            return this;
        }

        public QueryBuilder excludeAdminId(){
            setFetchFields("excludeFields","adminId");
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

        public Log build(){
            return this;
        }
    }

}
