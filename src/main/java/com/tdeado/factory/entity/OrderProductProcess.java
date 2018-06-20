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
public class OrderProductProcess implements Serializable {

    private static final long serialVersionUID = 1524998291805L;


    /**
    * 订单id
    * isNullAble:0
    */
    private Integer orderId;

    /**
    * 产品id
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String processNo;

    /**
    * 工序id
    * isNullAble:0
    */
    private Integer processId;

    /**
    * 工序名称
    * isNullAble:0
    */
    private String processName;

    /**
    * 工序价格
    * isNullAble:0
    */
    private Double processPrice;

    /**
    * 标准速率/小时
    * isNullAble:0
    */
    private String ratio;

    /**
    * 工序分类id
    * isNullAble:0
    */
    private Integer cateId;

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

    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public Integer getProductId(){
        return this.productId;
    }

    public void setProcessNo(String processNo){
        this.processNo = processNo;
    }

    public String getProcessNo(){
        return this.processNo;
    }

    public void setProcessId(Integer processId){
        this.processId = processId;
    }

    public Integer getProcessId(){
        return this.processId;
    }

    public void setProcessName(String processName){
        this.processName = processName;
    }

    public String getProcessName(){
        return this.processName;
    }

    public void setProcessPrice(Double processPrice){
        this.processPrice = processPrice;
    }

    public Double getProcessPrice(){
        return this.processPrice;
    }

    public void setRatio(String ratio){
        this.ratio = ratio;
    }

    public String getRatio(){
        return this.ratio;
    }

    public void setCateId(Integer cateId){
        this.cateId = cateId;
    }

    public Integer getCateId(){
        return this.cateId;
    }

    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

    public String getRemarks(){
        return this.remarks;
    }
    @Override
    public String toString() {
        return "OrderProductProcess{" +
                "orderId='" + orderId + '\'' +
                "productId='" + productId + '\'' +
                "processNo='" + processNo + '\'' +
                "processId='" + processId + '\'' +
                "processName='" + processName + '\'' +
                "processPrice='" + processPrice + '\'' +
                "ratio='" + ratio + '\'' +
                "cateId='" + cateId + '\'' +
                "remarks='" + remarks + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends OrderProductProcess{
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

        private List<Integer> productIdList;

        private Integer productIdSt;

        private Integer productIdEd;

        public Integer getProductIdSt(){
            return this.productIdSt;
        }

        public Integer getProductIdEd(){
            return this.productIdEd;
        }

        private List<String> processNoList;


        private List<String> fuzzyProcessNo;

        public List<String> getFuzzyProcessNo(){
            return this.fuzzyProcessNo;
        }

        private List<String> rightFuzzyProcessNo;

        public List<String> getRightFuzzyProcessNo(){
            return this.rightFuzzyProcessNo;
        }
        private List<Integer> processIdList;

        private Integer processIdSt;

        private Integer processIdEd;

        public Integer getProcessIdSt(){
            return this.processIdSt;
        }

        public Integer getProcessIdEd(){
            return this.processIdEd;
        }

        private List<String> processNameList;


        private List<String> fuzzyProcessName;

        public List<String> getFuzzyProcessName(){
            return this.fuzzyProcessName;
        }

        private List<String> rightFuzzyProcessName;

        public List<String> getRightFuzzyProcessName(){
            return this.rightFuzzyProcessName;
        }
        private List<Double> processPriceList;

        private Double processPriceSt;

        private Double processPriceEd;

        public Double getProcessPriceSt(){
            return this.processPriceSt;
        }

        public Double getProcessPriceEd(){
            return this.processPriceEd;
        }

        private List<String> ratioList;


        private List<String> fuzzyRatio;

        public List<String> getFuzzyRatio(){
            return this.fuzzyRatio;
        }

        private List<String> rightFuzzyRatio;

        public List<String> getRightFuzzyRatio(){
            return this.rightFuzzyRatio;
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



        public QueryBuilder fuzzyProcessNo (List<String> fuzzyProcessNo){
            this.fuzzyProcessNo = fuzzyProcessNo;
            return this;
        }

        public QueryBuilder fuzzyProcessNo (String ... fuzzyProcessNo){
            if (fuzzyProcessNo != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyProcessNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyProcessNo = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyProcessNo (List<String> rightFuzzyProcessNo){
            this.rightFuzzyProcessNo = rightFuzzyProcessNo;
            return this;
        }

        public QueryBuilder rightFuzzyProcessNo (String ... rightFuzzyProcessNo){
            if (rightFuzzyProcessNo != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyProcessNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyProcessNo = list;
            }
            return this;
        }

        public QueryBuilder processNo(String processNo){
            setProcessNo(processNo);
            return this;
        }

        public QueryBuilder processNoList(String ... processNo){
            if (processNo != null){
                List<String> list = new ArrayList<>();
                for (String item : processNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.processNoList = list;
            }

            return this;
        }

        public QueryBuilder processNoList(List<String> processNo){
            this.processNoList = processNo;
            return this;
        }

        public QueryBuilder fetchProcessNo(){
            setFetchFields("fetchFields","processNo");
            return this;
        }

        public QueryBuilder excludeProcessNo(){
            setFetchFields("excludeFields","processNo");
            return this;
        }



        public QueryBuilder processIdBetWeen(Integer processIdSt,Integer processIdEd){
            this.processIdSt = processIdSt;
            this.processIdEd = processIdEd;
            return this;
        }

        public QueryBuilder processIdGreaterEqThan(Integer processIdSt){
            this.processIdSt = processIdSt;
            return this;
        }
        public QueryBuilder processIdLessEqThan(Integer processIdEd){
            this.processIdEd = processIdEd;
            return this;
        }


        public QueryBuilder processId(Integer processId){
            setProcessId(processId);
            return this;
        }

        public QueryBuilder processIdList(Integer ... processId){
            if (processId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : processId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.processIdList = list;
            }

            return this;
        }

        public QueryBuilder processIdList(List<Integer> processId){
            this.processIdList = processId;
            return this;
        }

        public QueryBuilder fetchProcessId(){
            setFetchFields("fetchFields","processId");
            return this;
        }

        public QueryBuilder excludeProcessId(){
            setFetchFields("excludeFields","processId");
            return this;
        }



        public QueryBuilder fuzzyProcessName (List<String> fuzzyProcessName){
            this.fuzzyProcessName = fuzzyProcessName;
            return this;
        }

        public QueryBuilder fuzzyProcessName (String ... fuzzyProcessName){
            if (fuzzyProcessName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyProcessName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyProcessName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyProcessName (List<String> rightFuzzyProcessName){
            this.rightFuzzyProcessName = rightFuzzyProcessName;
            return this;
        }

        public QueryBuilder rightFuzzyProcessName (String ... rightFuzzyProcessName){
            if (rightFuzzyProcessName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyProcessName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyProcessName = list;
            }
            return this;
        }

        public QueryBuilder processName(String processName){
            setProcessName(processName);
            return this;
        }

        public QueryBuilder processNameList(String ... processName){
            if (processName != null){
                List<String> list = new ArrayList<>();
                for (String item : processName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.processNameList = list;
            }

            return this;
        }

        public QueryBuilder processNameList(List<String> processName){
            this.processNameList = processName;
            return this;
        }

        public QueryBuilder fetchProcessName(){
            setFetchFields("fetchFields","processName");
            return this;
        }

        public QueryBuilder excludeProcessName(){
            setFetchFields("excludeFields","processName");
            return this;
        }



        public QueryBuilder processPriceBetWeen(Double processPriceSt,Double processPriceEd){
            this.processPriceSt = processPriceSt;
            this.processPriceEd = processPriceEd;
            return this;
        }

        public QueryBuilder processPriceGreaterEqThan(Double processPriceSt){
            this.processPriceSt = processPriceSt;
            return this;
        }
        public QueryBuilder processPriceLessEqThan(Double processPriceEd){
            this.processPriceEd = processPriceEd;
            return this;
        }


        public QueryBuilder processPrice(Double processPrice){
            setProcessPrice(processPrice);
            return this;
        }

        public QueryBuilder processPriceList(Double ... processPrice){
            if (processPrice != null){
                List<Double> list = new ArrayList<>();
                for (Double item : processPrice){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.processPriceList = list;
            }

            return this;
        }

        public QueryBuilder processPriceList(List<Double> processPrice){
            this.processPriceList = processPrice;
            return this;
        }

        public QueryBuilder fetchProcessPrice(){
            setFetchFields("fetchFields","processPrice");
            return this;
        }

        public QueryBuilder excludeProcessPrice(){
            setFetchFields("excludeFields","processPrice");
            return this;
        }



        public QueryBuilder fuzzyRatio (List<String> fuzzyRatio){
            this.fuzzyRatio = fuzzyRatio;
            return this;
        }

        public QueryBuilder fuzzyRatio (String ... fuzzyRatio){
            if (fuzzyRatio != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyRatio){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyRatio = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyRatio (List<String> rightFuzzyRatio){
            this.rightFuzzyRatio = rightFuzzyRatio;
            return this;
        }

        public QueryBuilder rightFuzzyRatio (String ... rightFuzzyRatio){
            if (rightFuzzyRatio != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyRatio){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyRatio = list;
            }
            return this;
        }

        public QueryBuilder ratio(String ratio){
            setRatio(ratio);
            return this;
        }

        public QueryBuilder ratioList(String ... ratio){
            if (ratio != null){
                List<String> list = new ArrayList<>();
                for (String item : ratio){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.ratioList = list;
            }

            return this;
        }

        public QueryBuilder ratioList(List<String> ratio){
            this.ratioList = ratio;
            return this;
        }

        public QueryBuilder fetchRatio(){
            setFetchFields("fetchFields","ratio");
            return this;
        }

        public QueryBuilder excludeRatio(){
            setFetchFields("excludeFields","ratio");
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

        public OrderProductProcess build(){
            return this;
        }
    }

}
