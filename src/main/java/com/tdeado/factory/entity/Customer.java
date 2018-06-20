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
public class Customer implements Serializable {

    private static final long serialVersionUID = 1524998196922L;


    /**
    * 主键
    * 客户ID
    * isNullAble:0
    */
    private Integer id;

    /**
    * 客户名称
    * isNullAble:0
    */
    private String customerName;

    /**
    * 客户电话
    * isNullAble:0
    */
    private String tel;

    /**
    * 添加时间
    * isNullAble:0
    */
    private String dateline;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setTel(String tel){
        this.tel = tel;
    }

    public String getTel(){
        return this.tel;
    }

    public void setDateline(String dateline){
        this.dateline = dateline;
    }

    public String getDateline(){
        return this.dateline;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                "customerName='" + customerName + '\'' +
                "tel='" + tel + '\'' +
                "dateline='" + dateline + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Customer{
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

        private List<String> customerNameList;


        private List<String> fuzzyCustomerName;

        public List<String> getFuzzyCustomerName(){
            return this.fuzzyCustomerName;
        }

        private List<String> rightFuzzyCustomerName;

        public List<String> getRightFuzzyCustomerName(){
            return this.rightFuzzyCustomerName;
        }
        private List<String> telList;


        private List<String> fuzzyTel;

        public List<String> getFuzzyTel(){
            return this.fuzzyTel;
        }

        private List<String> rightFuzzyTel;

        public List<String> getRightFuzzyTel(){
            return this.rightFuzzyTel;
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



        public QueryBuilder fuzzyCustomerName (List<String> fuzzyCustomerName){
            this.fuzzyCustomerName = fuzzyCustomerName;
            return this;
        }

        public QueryBuilder fuzzyCustomerName (String ... fuzzyCustomerName){
            if (fuzzyCustomerName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyCustomerName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyCustomerName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyCustomerName (List<String> rightFuzzyCustomerName){
            this.rightFuzzyCustomerName = rightFuzzyCustomerName;
            return this;
        }

        public QueryBuilder rightFuzzyCustomerName (String ... rightFuzzyCustomerName){
            if (rightFuzzyCustomerName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyCustomerName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyCustomerName = list;
            }
            return this;
        }

        public QueryBuilder customerName(String customerName){
            setCustomerName(customerName);
            return this;
        }

        public QueryBuilder customerNameList(String ... customerName){
            if (customerName != null){
                List<String> list = new ArrayList<>();
                for (String item : customerName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.customerNameList = list;
            }

            return this;
        }

        public QueryBuilder customerNameList(List<String> customerName){
            this.customerNameList = customerName;
            return this;
        }

        public QueryBuilder fetchCustomerName(){
            setFetchFields("fetchFields","customerName");
            return this;
        }

        public QueryBuilder excludeCustomerName(){
            setFetchFields("excludeFields","customerName");
            return this;
        }



        public QueryBuilder fuzzyTel (List<String> fuzzyTel){
            this.fuzzyTel = fuzzyTel;
            return this;
        }

        public QueryBuilder fuzzyTel (String ... fuzzyTel){
            if (fuzzyTel != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyTel){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyTel = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyTel (List<String> rightFuzzyTel){
            this.rightFuzzyTel = rightFuzzyTel;
            return this;
        }

        public QueryBuilder rightFuzzyTel (String ... rightFuzzyTel){
            if (rightFuzzyTel != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyTel){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyTel = list;
            }
            return this;
        }

        public QueryBuilder tel(String tel){
            setTel(tel);
            return this;
        }

        public QueryBuilder telList(String ... tel){
            if (tel != null){
                List<String> list = new ArrayList<>();
                for (String item : tel){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.telList = list;
            }

            return this;
        }

        public QueryBuilder telList(List<String> tel){
            this.telList = tel;
            return this;
        }

        public QueryBuilder fetchTel(){
            setFetchFields("fetchFields","tel");
            return this;
        }

        public QueryBuilder excludeTel(){
            setFetchFields("excludeFields","tel");
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

        public Customer build(){
            return this;
        }
    }

}
