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
public class Product implements Serializable {

    private static final long serialVersionUID = 1524998327808L;


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
    private String productNo;

    /**
    * 产品名称
    * isNullAble:0
    */
    private String productName;

    /**
    * 规格
    * isNullAble:0
    */
    private String standard;

    /**
    * 生产工艺
    * isNullAble:0
    */
    private String production;

    /**
    * 
    * isNullAble:0
    */
    private String dateline;

    /**
    * 
    * isNullAble:0,defaultVal:1
    */
    private Integer status;

    /**
    * 工序分类
    * isNullAble:0
    */
    private Integer cateId;

    /**
    * 所属上级产品
    * isNullAble:0
    */
    private Integer productUpid;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setProductNo(String productNo){
        this.productNo = productNo;
    }

    public String getProductNo(){
        return this.productNo;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return this.productName;
    }

    public void setStandard(String standard){
        this.standard = standard;
    }

    public String getStandard(){
        return this.standard;
    }

    public void setProduction(String production){
        this.production = production;
    }

    public String getProduction(){
        return this.production;
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

    public void setCateId(Integer cateId){
        this.cateId = cateId;
    }

    public Integer getCateId(){
        return this.cateId;
    }

    public void setProductUpid(Integer productUpid){
        this.productUpid = productUpid;
    }

    public Integer getProductUpid(){
        return this.productUpid;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                "productNo='" + productNo + '\'' +
                "productName='" + productName + '\'' +
                "standard='" + standard + '\'' +
                "production='" + production + '\'' +
                "dateline='" + dateline + '\'' +
                "status='" + status + '\'' +
                "cateId='" + cateId + '\'' +
                "productUpid='" + productUpid + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Product{
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

        private List<String> productNoList;


        private List<String> fuzzyProductNo;

        public List<String> getFuzzyProductNo(){
            return this.fuzzyProductNo;
        }

        private List<String> rightFuzzyProductNo;

        public List<String> getRightFuzzyProductNo(){
            return this.rightFuzzyProductNo;
        }
        private List<String> productNameList;


        private List<String> fuzzyProductName;

        public List<String> getFuzzyProductName(){
            return this.fuzzyProductName;
        }

        private List<String> rightFuzzyProductName;

        public List<String> getRightFuzzyProductName(){
            return this.rightFuzzyProductName;
        }
        private List<String> standardList;


        private List<String> fuzzyStandard;

        public List<String> getFuzzyStandard(){
            return this.fuzzyStandard;
        }

        private List<String> rightFuzzyStandard;

        public List<String> getRightFuzzyStandard(){
            return this.rightFuzzyStandard;
        }
        private List<String> productionList;


        private List<String> fuzzyProduction;

        public List<String> getFuzzyProduction(){
            return this.fuzzyProduction;
        }

        private List<String> rightFuzzyProduction;

        public List<String> getRightFuzzyProduction(){
            return this.rightFuzzyProduction;
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

        private List<Integer> cateIdList;

        private Integer cateIdSt;

        private Integer cateIdEd;

        public Integer getCateIdSt(){
            return this.cateIdSt;
        }

        public Integer getCateIdEd(){
            return this.cateIdEd;
        }

        private List<Integer> productUpidList;

        private Integer productUpidSt;

        private Integer productUpidEd;

        public Integer getProductUpidSt(){
            return this.productUpidSt;
        }

        public Integer getProductUpidEd(){
            return this.productUpidEd;
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



        public QueryBuilder fuzzyProductNo (List<String> fuzzyProductNo){
            this.fuzzyProductNo = fuzzyProductNo;
            return this;
        }

        public QueryBuilder fuzzyProductNo (String ... fuzzyProductNo){
            if (fuzzyProductNo != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyProductNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyProductNo = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyProductNo (List<String> rightFuzzyProductNo){
            this.rightFuzzyProductNo = rightFuzzyProductNo;
            return this;
        }

        public QueryBuilder rightFuzzyProductNo (String ... rightFuzzyProductNo){
            if (rightFuzzyProductNo != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyProductNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyProductNo = list;
            }
            return this;
        }

        public QueryBuilder productNo(String productNo){
            setProductNo(productNo);
            return this;
        }

        public QueryBuilder productNoList(String ... productNo){
            if (productNo != null){
                List<String> list = new ArrayList<>();
                for (String item : productNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.productNoList = list;
            }

            return this;
        }

        public QueryBuilder productNoList(List<String> productNo){
            this.productNoList = productNo;
            return this;
        }

        public QueryBuilder fetchProductNo(){
            setFetchFields("fetchFields","productNo");
            return this;
        }

        public QueryBuilder excludeProductNo(){
            setFetchFields("excludeFields","productNo");
            return this;
        }



        public QueryBuilder fuzzyProductName (List<String> fuzzyProductName){
            this.fuzzyProductName = fuzzyProductName;
            return this;
        }

        public QueryBuilder fuzzyProductName (String ... fuzzyProductName){
            if (fuzzyProductName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyProductName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyProductName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyProductName (List<String> rightFuzzyProductName){
            this.rightFuzzyProductName = rightFuzzyProductName;
            return this;
        }

        public QueryBuilder rightFuzzyProductName (String ... rightFuzzyProductName){
            if (rightFuzzyProductName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyProductName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyProductName = list;
            }
            return this;
        }

        public QueryBuilder productName(String productName){
            setProductName(productName);
            return this;
        }

        public QueryBuilder productNameList(String ... productName){
            if (productName != null){
                List<String> list = new ArrayList<>();
                for (String item : productName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.productNameList = list;
            }

            return this;
        }

        public QueryBuilder productNameList(List<String> productName){
            this.productNameList = productName;
            return this;
        }

        public QueryBuilder fetchProductName(){
            setFetchFields("fetchFields","productName");
            return this;
        }

        public QueryBuilder excludeProductName(){
            setFetchFields("excludeFields","productName");
            return this;
        }



        public QueryBuilder fuzzyStandard (List<String> fuzzyStandard){
            this.fuzzyStandard = fuzzyStandard;
            return this;
        }

        public QueryBuilder fuzzyStandard (String ... fuzzyStandard){
            if (fuzzyStandard != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyStandard){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyStandard = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyStandard (List<String> rightFuzzyStandard){
            this.rightFuzzyStandard = rightFuzzyStandard;
            return this;
        }

        public QueryBuilder rightFuzzyStandard (String ... rightFuzzyStandard){
            if (rightFuzzyStandard != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyStandard){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyStandard = list;
            }
            return this;
        }

        public QueryBuilder standard(String standard){
            setStandard(standard);
            return this;
        }

        public QueryBuilder standardList(String ... standard){
            if (standard != null){
                List<String> list = new ArrayList<>();
                for (String item : standard){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.standardList = list;
            }

            return this;
        }

        public QueryBuilder standardList(List<String> standard){
            this.standardList = standard;
            return this;
        }

        public QueryBuilder fetchStandard(){
            setFetchFields("fetchFields","standard");
            return this;
        }

        public QueryBuilder excludeStandard(){
            setFetchFields("excludeFields","standard");
            return this;
        }



        public QueryBuilder fuzzyProduction (List<String> fuzzyProduction){
            this.fuzzyProduction = fuzzyProduction;
            return this;
        }

        public QueryBuilder fuzzyProduction (String ... fuzzyProduction){
            if (fuzzyProduction != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyProduction){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyProduction = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyProduction (List<String> rightFuzzyProduction){
            this.rightFuzzyProduction = rightFuzzyProduction;
            return this;
        }

        public QueryBuilder rightFuzzyProduction (String ... rightFuzzyProduction){
            if (rightFuzzyProduction != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyProduction){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyProduction = list;
            }
            return this;
        }

        public QueryBuilder production(String production){
            setProduction(production);
            return this;
        }

        public QueryBuilder productionList(String ... production){
            if (production != null){
                List<String> list = new ArrayList<>();
                for (String item : production){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.productionList = list;
            }

            return this;
        }

        public QueryBuilder productionList(List<String> production){
            this.productionList = production;
            return this;
        }

        public QueryBuilder fetchProduction(){
            setFetchFields("fetchFields","production");
            return this;
        }

        public QueryBuilder excludeProduction(){
            setFetchFields("excludeFields","production");
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



        public QueryBuilder cateIdBetWeen(Integer cateIdSt,Integer cateIdEd){
            this.cateIdSt = cateIdSt;
            this.cateIdEd = cateIdEd;
            return this;
        }

        public QueryBuilder cateIdGreaterEqThan(Integer cateIdSt){
            this.cateIdSt = cateIdSt;
            return this;
        }
        public QueryBuilder cateIdLessEqThan(Integer cateIdEd){
            this.cateIdEd = cateIdEd;
            return this;
        }


        public QueryBuilder cateId(Integer cateId){
            setCateId(cateId);
            return this;
        }

        public QueryBuilder cateIdList(Integer ... cateId){
            if (cateId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : cateId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.cateIdList = list;
            }

            return this;
        }

        public QueryBuilder cateIdList(List<Integer> cateId){
            this.cateIdList = cateId;
            return this;
        }

        public QueryBuilder fetchCateId(){
            setFetchFields("fetchFields","cateId");
            return this;
        }

        public QueryBuilder excludeCateId(){
            setFetchFields("excludeFields","cateId");
            return this;
        }



        public QueryBuilder productUpidBetWeen(Integer productUpidSt,Integer productUpidEd){
            this.productUpidSt = productUpidSt;
            this.productUpidEd = productUpidEd;
            return this;
        }

        public QueryBuilder productUpidGreaterEqThan(Integer productUpidSt){
            this.productUpidSt = productUpidSt;
            return this;
        }
        public QueryBuilder productUpidLessEqThan(Integer productUpidEd){
            this.productUpidEd = productUpidEd;
            return this;
        }


        public QueryBuilder productUpid(Integer productUpid){
            setProductUpid(productUpid);
            return this;
        }

        public QueryBuilder productUpidList(Integer ... productUpid){
            if (productUpid != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : productUpid){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.productUpidList = list;
            }

            return this;
        }

        public QueryBuilder productUpidList(List<Integer> productUpid){
            this.productUpidList = productUpid;
            return this;
        }

        public QueryBuilder fetchProductUpid(){
            setFetchFields("fetchFields","productUpid");
            return this;
        }

        public QueryBuilder excludeProductUpid(){
            setFetchFields("excludeFields","productUpid");
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

        public Product build(){
            return this;
        }
    }

}
