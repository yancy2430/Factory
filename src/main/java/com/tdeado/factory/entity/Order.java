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
public class Order implements Serializable {

    private static final long serialVersionUID = 1524998276397L;


    /**
    * 主键
    * 订单id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 订单名称
    * isNullAble:0
    */
    private String orderName;

    /**
    * 
    * isNullAble:1
    */
    private Integer customerId;

    /**
    * 标注
    * isNullAble:0
    */
    private String remarks;

    /**
    * 添加时间
    * isNullAble:0
    */
    private String dateline;

    /**
    * 订单状态
    * isNullAble:0
    */
    private Integer status;

    /**
    * 截止时间
    * isNullAble:1,defaultVal:
    */
    private String deadline;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setOrderName(String orderName){
        this.orderName = orderName;
    }

    public String getOrderName(){
        return this.orderName;
    }

    public void setCustomerId(Integer customerId){
        this.customerId = customerId;
    }

    public Integer getCustomerId(){
        return this.customerId;
    }

    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

    public String getRemarks(){
        return this.remarks;
    }

    public void setDateline(String dateline){
        this.dateline = dateline;
    }

    public String getDateline(){
        return this.dateline;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public Integer getStatus(){
        return this.status;
    }

    public void setDeadline(String deadline){
        this.deadline = deadline;
    }

    public String getDeadline(){
        return this.deadline;
    }
    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                "orderName='" + orderName + '\'' +
                "customerId='" + customerId + '\'' +
                "remarks='" + remarks + '\'' +
                "dateline='" + dateline + '\'' +
                "status='" + status + '\'' +
                "deadline='" + deadline + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Order{
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

        private List<String> orderNameList;


        private List<String> fuzzyOrderName;

        public List<String> getFuzzyOrderName(){
            return this.fuzzyOrderName;
        }

        private List<String> rightFuzzyOrderName;

        public List<String> getRightFuzzyOrderName(){
            return this.rightFuzzyOrderName;
        }
        private List<Integer> customerIdList;

        private Integer customerIdSt;

        private Integer customerIdEd;

        public Integer getCustomerIdSt(){
            return this.customerIdSt;
        }

        public Integer getCustomerIdEd(){
            return this.customerIdEd;
        }

        private List<String> remarksList;


        private List<String> fuzzyRemarks;

        public List<String> getFuzzyRemarks(){
            return this.fuzzyRemarks;
        }

        private List<String> rightFuzzyRemarks;

        public List<String> getRightFuzzyRemarks(){
            return this.rightFuzzyRemarks;
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
        private List<Integer> statusList;

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){
            return this.statusSt;
        }

        public Integer getStatusEd(){
            return this.statusEd;
        }

        private List<String> deadlineList;


        private List<String> fuzzyDeadline;

        public List<String> getFuzzyDeadline(){
            return this.fuzzyDeadline;
        }

        private List<String> rightFuzzyDeadline;

        public List<String> getRightFuzzyDeadline(){
            return this.rightFuzzyDeadline;
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



        public QueryBuilder fuzzyOrderName (List<String> fuzzyOrderName){
            this.fuzzyOrderName = fuzzyOrderName;
            return this;
        }

        public QueryBuilder fuzzyOrderName (String ... fuzzyOrderName){
            if (fuzzyOrderName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyOrderName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyOrderName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyOrderName (List<String> rightFuzzyOrderName){
            this.rightFuzzyOrderName = rightFuzzyOrderName;
            return this;
        }

        public QueryBuilder rightFuzzyOrderName (String ... rightFuzzyOrderName){
            if (rightFuzzyOrderName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyOrderName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyOrderName = list;
            }
            return this;
        }

        public QueryBuilder orderName(String orderName){
            setOrderName(orderName);
            return this;
        }

        public QueryBuilder orderNameList(String ... orderName){
            if (orderName != null){
                List<String> list = new ArrayList<>();
                for (String item : orderName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.orderNameList = list;
            }

            return this;
        }

        public QueryBuilder orderNameList(List<String> orderName){
            this.orderNameList = orderName;
            return this;
        }

        public QueryBuilder fetchOrderName(){
            setFetchFields("fetchFields","orderName");
            return this;
        }

        public QueryBuilder excludeOrderName(){
            setFetchFields("excludeFields","orderName");
            return this;
        }



        public QueryBuilder customerIdBetWeen(Integer customerIdSt,Integer customerIdEd){
            this.customerIdSt = customerIdSt;
            this.customerIdEd = customerIdEd;
            return this;
        }

        public QueryBuilder customerIdGreaterEqThan(Integer customerIdSt){
            this.customerIdSt = customerIdSt;
            return this;
        }
        public QueryBuilder customerIdLessEqThan(Integer customerIdEd){
            this.customerIdEd = customerIdEd;
            return this;
        }


        public QueryBuilder customerId(Integer customerId){
            setCustomerId(customerId);
            return this;
        }

        public QueryBuilder customerIdList(Integer ... customerId){
            if (customerId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : customerId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.customerIdList = list;
            }

            return this;
        }

        public QueryBuilder customerIdList(List<Integer> customerId){
            this.customerIdList = customerId;
            return this;
        }

        public QueryBuilder fetchCustomerId(){
            setFetchFields("fetchFields","customerId");
            return this;
        }

        public QueryBuilder excludeCustomerId(){
            setFetchFields("excludeFields","customerId");
            return this;
        }



        public QueryBuilder fuzzyRemarks (List<String> fuzzyRemarks){
            this.fuzzyRemarks = fuzzyRemarks;
            return this;
        }

        public QueryBuilder fuzzyRemarks (String ... fuzzyRemarks){
            if (fuzzyRemarks != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyRemarks){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyRemarks = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyRemarks (List<String> rightFuzzyRemarks){
            this.rightFuzzyRemarks = rightFuzzyRemarks;
            return this;
        }

        public QueryBuilder rightFuzzyRemarks (String ... rightFuzzyRemarks){
            if (rightFuzzyRemarks != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyRemarks){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyRemarks = list;
            }
            return this;
        }

        public QueryBuilder remarks(String remarks){
            setRemarks(remarks);
            return this;
        }

        public QueryBuilder remarksList(String ... remarks){
            if (remarks != null){
                List<String> list = new ArrayList<>();
                for (String item : remarks){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.remarksList = list;
            }

            return this;
        }

        public QueryBuilder remarksList(List<String> remarks){
            this.remarksList = remarks;
            return this;
        }

        public QueryBuilder fetchRemarks(){
            setFetchFields("fetchFields","remarks");
            return this;
        }

        public QueryBuilder excludeRemarks(){
            setFetchFields("excludeFields","remarks");
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



        public QueryBuilder fuzzyDeadline (List<String> fuzzyDeadline){
            this.fuzzyDeadline = fuzzyDeadline;
            return this;
        }

        public QueryBuilder fuzzyDeadline (String ... fuzzyDeadline){
            if (fuzzyDeadline != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyDeadline){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyDeadline = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyDeadline (List<String> rightFuzzyDeadline){
            this.rightFuzzyDeadline = rightFuzzyDeadline;
            return this;
        }

        public QueryBuilder rightFuzzyDeadline (String ... rightFuzzyDeadline){
            if (rightFuzzyDeadline != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyDeadline){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyDeadline = list;
            }
            return this;
        }

        public QueryBuilder deadline(String deadline){
            setDeadline(deadline);
            return this;
        }

        public QueryBuilder deadlineList(String ... deadline){
            if (deadline != null){
                List<String> list = new ArrayList<>();
                for (String item : deadline){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.deadlineList = list;
            }

            return this;
        }

        public QueryBuilder deadlineList(List<String> deadline){
            this.deadlineList = deadline;
            return this;
        }

        public QueryBuilder fetchDeadline(){
            setFetchFields("fetchFields","deadline");
            return this;
        }

        public QueryBuilder excludeDeadline(){
            setFetchFields("excludeFields","deadline");
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

        public Order build(){
            return this;
        }
    }

}
