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
public class OrderProductList implements Serializable {

    private static final long serialVersionUID = 1524998283571L;


    /**
    * 订单id
    * isNullAble:0
    */
    private Integer orderId;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String productNo;

    /**
    * 产品id
    * isNullAble:0
    */
    private Integer productId;

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
    * 数量
    * isNullAble:0
    */
    private Integer amount;

    /**
    * 生产工艺
    * isNullAble:0,defaultVal:
    */
    private String production;

    /**
    * 
    * isNullAble:0
    */
    private Integer cateId;

    /**
    * 
    * isNullAble:0
    */
    private Integer productUpid;

    /**
    * 
    * isNullAble:1
    */
    private String remarks;


    public void setOrderId(Integer orderId){
        this.orderId = orderId;
    }

    public Integer getOrderId(){
        return this.orderId;
    }

    public void setProductNo(String productNo){
        this.productNo = productNo;
    }

    public String getProductNo(){
        return this.productNo;
    }

    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public Integer getProductId(){
        return this.productId;
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

    public void setAmount(Integer amount){
        this.amount = amount;
    }

    public Integer getAmount(){
        return this.amount;
    }

    public void setProduction(String production){
        this.production = production;
    }

    public String getProduction(){
        return this.production;
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

    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

    public String getRemarks(){
        return this.remarks;
    }
    @Override
    public String toString() {
        return "OrderProductList{" +
                "orderId='" + orderId + '\'' +
                "productNo='" + productNo + '\'' +
                "productId='" + productId + '\'' +
                "productName='" + productName + '\'' +
                "standard='" + standard + '\'' +
                "amount='" + amount + '\'' +
                "production='" + production + '\'' +
                "cateId='" + cateId + '\'' +
                "productUpid='" + productUpid + '\'' +
                "remarks='" + remarks + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends OrderProductList{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<Integer> orderIdList;

        private Integer orderIdSt;

        private Integer orderIdEd;

        public Integer getOrderIdSt(){
            return this.orderIdSt;
        }

        public Integer getOrderIdEd(){
            return this.orderIdEd;
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
        private List<Integer> productIdList;

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){
            return this.productIdSt;
        }

        public Integer getProductIdEd(){
            return this.productIdEd;
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
        private List<Integer> amountList;

        private Integer amountSt;

        private Integer amountEd;

        public Integer getAmountSt(){
            return this.amountSt;
        }

        public Integer getAmountEd(){
            return this.amountEd;
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

        private List<String> remarksList;


        private List<String> fuzzyRemarks;

        public List<String> getFuzzyRemarks(){
            return this.fuzzyRemarks;
        }

        private List<String> rightFuzzyRemarks;

        public List<String> getRightFuzzyRemarks(){
            return this.rightFuzzyRemarks;
        }
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder orderIdBetWeen(Integer orderIdSt,Integer orderIdEd){
            this.orderIdSt = orderIdSt;
            this.orderIdEd = orderIdEd;
            return this;
        }

        public QueryBuilder orderIdGreaterEqThan(Integer orderIdSt){
            this.orderIdSt = orderIdSt;
            return this;
        }
        public QueryBuilder orderIdLessEqThan(Integer orderIdEd){
            this.orderIdEd = orderIdEd;
            return this;
        }


        public QueryBuilder orderId(Integer orderId){
            setOrderId(orderId);
            return this;
        }

        public QueryBuilder orderIdList(Integer ... orderId){
            if (orderId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : orderId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.orderIdList = list;
            }

            return this;
        }

        public QueryBuilder orderIdList(List<Integer> orderId){
            this.orderIdList = orderId;
            return this;
        }

        public QueryBuilder fetchOrderId(){
            setFetchFields("fetchFields","orderId");
            return this;
        }

        public QueryBuilder excludeOrderId(){
            setFetchFields("excludeFields","orderId");
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



        public QueryBuilder productIdBetWeen(Integer productIdSt,Integer productIdEd){
            this.productIdSt = productIdSt;
            this.productIdEd = productIdEd;
            return this;
        }

        public QueryBuilder productIdGreaterEqThan(Integer productIdSt){
            this.productIdSt = productIdSt;
            return this;
        }
        public QueryBuilder productIdLessEqThan(Integer productIdEd){
            this.productIdEd = productIdEd;
            return this;
        }


        public QueryBuilder productId(Integer productId){
            setProductId(productId);
            return this;
        }

        public QueryBuilder productIdList(Integer ... productId){
            if (productId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : productId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.productIdList = list;
            }

            return this;
        }

        public QueryBuilder productIdList(List<Integer> productId){
            this.productIdList = productId;
            return this;
        }

        public QueryBuilder fetchProductId(){
            setFetchFields("fetchFields","productId");
            return this;
        }

        public QueryBuilder excludeProductId(){
            setFetchFields("excludeFields","productId");
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



        public QueryBuilder amountBetWeen(Integer amountSt,Integer amountEd){
            this.amountSt = amountSt;
            this.amountEd = amountEd;
            return this;
        }

        public QueryBuilder amountGreaterEqThan(Integer amountSt){
            this.amountSt = amountSt;
            return this;
        }
        public QueryBuilder amountLessEqThan(Integer amountEd){
            this.amountEd = amountEd;
            return this;
        }


        public QueryBuilder amount(Integer amount){
            setAmount(amount);
            return this;
        }

        public QueryBuilder amountList(Integer ... amount){
            if (amount != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : amount){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.amountList = list;
            }

            return this;
        }

        public QueryBuilder amountList(List<Integer> amount){
            this.amountList = amount;
            return this;
        }

        public QueryBuilder fetchAmount(){
            setFetchFields("fetchFields","amount");
            return this;
        }

        public QueryBuilder excludeAmount(){
            setFetchFields("excludeFields","amount");
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

        public OrderProductList build(){
            return this;
        }
    }

}
