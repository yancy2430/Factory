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
public class Piecework implements Serializable {

    private static final long serialVersionUID = 1524998298229L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 员工名称
    * isNullAble:0
    */
    private Integer userId;

    /**
    * 产品所属订单id
    * isNullAble:0
    */
    private Integer orderId;

    /**
    * 产品id
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 产品工序id
    * isNullAble:0
    */
    private Integer processId;

    /**
    * 合格数量
    * isNullAble:0
    */
    private Integer goodNumber;

    /**
    * 工序单价
    * isNullAble:0
    */
    private Double processPrice;

    /**
    * 计件工资
    * isNullAble:0
    */
    private Double piecework;

    /**
    * 平时加班
    * isNullAble:0
    */
    private Integer normalAddTime;

    /**
    * 周末加班
    * isNullAble:0
    */
    private Integer weekAddTime;

    /**
    * 补贴
    * isNullAble:0
    */
    private Double subsidy;

    /**
    * 备注
    * isNullAble:0
    */
    private Integer remarks;

    /**
    * 添加时间
    * isNullAble:0
    */
    private String dateline;

    /**
    * 员工组别id
    * isNullAble:0
    */
    private Integer cateId;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public Integer getUserId(){
        return this.userId;
    }

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

    public void setProcessId(Integer processId){
        this.processId = processId;
    }

    public Integer getProcessId(){
        return this.processId;
    }

    public void setGoodNumber(Integer goodNumber){
        this.goodNumber = goodNumber;
    }

    public Integer getGoodNumber(){
        return this.goodNumber;
    }

    public void setProcessPrice(Double processPrice){
        this.processPrice = processPrice;
    }

    public Double getProcessPrice(){
        return this.processPrice;
    }

    public void setPiecework(Double piecework){
        this.piecework = piecework;
    }

    public Double getPiecework(){
        return this.piecework;
    }

    public void setNormalAddTime(Integer normalAddTime){
        this.normalAddTime = normalAddTime;
    }

    public Integer getNormalAddTime(){
        return this.normalAddTime;
    }

    public void setWeekAddTime(Integer weekAddTime){
        this.weekAddTime = weekAddTime;
    }

    public Integer getWeekAddTime(){
        return this.weekAddTime;
    }

    public void setSubsidy(Double subsidy){
        this.subsidy = subsidy;
    }

    public Double getSubsidy(){
        return this.subsidy;
    }

    public void setRemarks(Integer remarks){
        this.remarks = remarks;
    }

    public Integer getRemarks(){
        return this.remarks;
    }

    public void setDateline(String dateline){
        this.dateline = dateline;
    }

    public String getDateline(){
        return this.dateline;
    }

    public void setCateId(Integer cateId){
        this.cateId = cateId;
    }

    public Integer getCateId(){
        return this.cateId;
    }
    @Override
    public String toString() {
        return "Piecework{" +
                "id='" + id + '\'' +
                "userId='" + userId + '\'' +
                "orderId='" + orderId + '\'' +
                "productId='" + productId + '\'' +
                "processId='" + processId + '\'' +
                "goodNumber='" + goodNumber + '\'' +
                "processPrice='" + processPrice + '\'' +
                "piecework='" + piecework + '\'' +
                "normalAddTime='" + normalAddTime + '\'' +
                "weekAddTime='" + weekAddTime + '\'' +
                "subsidy='" + subsidy + '\'' +
                "remarks='" + remarks + '\'' +
                "dateline='" + dateline + '\'' +
                "cateId='" + cateId + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Piecework{
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

        private List<Integer> userIdList;

        private Integer userIdSt;

        private Integer userIdEd;

        public Integer getUserIdSt(){
            return this.userIdSt;
        }

        public Integer getUserIdEd(){
            return this.userIdEd;
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

        private List<Integer> processIdList;

        private Integer processIdSt;

        private Integer processIdEd;

        public Integer getProcessIdSt(){
            return this.processIdSt;
        }

        public Integer getProcessIdEd(){
            return this.processIdEd;
        }

        private List<Integer> goodNumberList;

        private Integer goodNumberSt;

        private Integer goodNumberEd;

        public Integer getGoodNumberSt(){
            return this.goodNumberSt;
        }

        public Integer getGoodNumberEd(){
            return this.goodNumberEd;
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

        private List<Double> pieceworkList;

        private Double pieceworkSt;

        private Double pieceworkEd;

        public Double getPieceworkSt(){
            return this.pieceworkSt;
        }

        public Double getPieceworkEd(){
            return this.pieceworkEd;
        }

        private List<Integer> normalAddTimeList;

        private Integer normalAddTimeSt;

        private Integer normalAddTimeEd;

        public Integer getNormalAddTimeSt(){
            return this.normalAddTimeSt;
        }

        public Integer getNormalAddTimeEd(){
            return this.normalAddTimeEd;
        }

        private List<Integer> weekAddTimeList;

        private Integer weekAddTimeSt;

        private Integer weekAddTimeEd;

        public Integer getWeekAddTimeSt(){
            return this.weekAddTimeSt;
        }

        public Integer getWeekAddTimeEd(){
            return this.weekAddTimeEd;
        }

        private List<Double> subsidyList;

        private Double subsidySt;

        private Double subsidyEd;

        public Double getSubsidySt(){
            return this.subsidySt;
        }

        public Double getSubsidyEd(){
            return this.subsidyEd;
        }

        private List<Integer> remarksList;

        private Integer remarksSt;

        private Integer remarksEd;

        public Integer getRemarksSt(){
            return this.remarksSt;
        }

        public Integer getRemarksEd(){
            return this.remarksEd;
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
        private List<Integer> cateIdList;

        private Integer cateIdSt;

        private Integer cateIdEd;

        public Integer getCateIdSt(){
            return this.cateIdSt;
        }

        public Integer getCateIdEd(){
            return this.cateIdEd;
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



        public QueryBuilder userIdBetWeen(Integer userIdSt,Integer userIdEd){
            this.userIdSt = userIdSt;
            this.userIdEd = userIdEd;
            return this;
        }

        public QueryBuilder userIdGreaterEqThan(Integer userIdSt){
            this.userIdSt = userIdSt;
            return this;
        }
        public QueryBuilder userIdLessEqThan(Integer userIdEd){
            this.userIdEd = userIdEd;
            return this;
        }


        public QueryBuilder userId(Integer userId){
            setUserId(userId);
            return this;
        }

        public QueryBuilder userIdList(Integer ... userId){
            if (userId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : userId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.userIdList = list;
            }

            return this;
        }

        public QueryBuilder userIdList(List<Integer> userId){
            this.userIdList = userId;
            return this;
        }

        public QueryBuilder fetchUserId(){
            setFetchFields("fetchFields","userId");
            return this;
        }

        public QueryBuilder excludeUserId(){
            setFetchFields("excludeFields","userId");
            return this;
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



        public QueryBuilder goodNumberBetWeen(Integer goodNumberSt,Integer goodNumberEd){
            this.goodNumberSt = goodNumberSt;
            this.goodNumberEd = goodNumberEd;
            return this;
        }

        public QueryBuilder goodNumberGreaterEqThan(Integer goodNumberSt){
            this.goodNumberSt = goodNumberSt;
            return this;
        }
        public QueryBuilder goodNumberLessEqThan(Integer goodNumberEd){
            this.goodNumberEd = goodNumberEd;
            return this;
        }


        public QueryBuilder goodNumber(Integer goodNumber){
            setGoodNumber(goodNumber);
            return this;
        }

        public QueryBuilder goodNumberList(Integer ... goodNumber){
            if (goodNumber != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : goodNumber){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.goodNumberList = list;
            }

            return this;
        }

        public QueryBuilder goodNumberList(List<Integer> goodNumber){
            this.goodNumberList = goodNumber;
            return this;
        }

        public QueryBuilder fetchGoodNumber(){
            setFetchFields("fetchFields","goodNumber");
            return this;
        }

        public QueryBuilder excludeGoodNumber(){
            setFetchFields("excludeFields","goodNumber");
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



        public QueryBuilder pieceworkBetWeen(Double pieceworkSt,Double pieceworkEd){
            this.pieceworkSt = pieceworkSt;
            this.pieceworkEd = pieceworkEd;
            return this;
        }

        public QueryBuilder pieceworkGreaterEqThan(Double pieceworkSt){
            this.pieceworkSt = pieceworkSt;
            return this;
        }
        public QueryBuilder pieceworkLessEqThan(Double pieceworkEd){
            this.pieceworkEd = pieceworkEd;
            return this;
        }


        public QueryBuilder piecework(Double piecework){
            setPiecework(piecework);
            return this;
        }

        public QueryBuilder pieceworkList(Double ... piecework){
            if (piecework != null){
                List<Double> list = new ArrayList<>();
                for (Double item : piecework){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.pieceworkList = list;
            }

            return this;
        }

        public QueryBuilder pieceworkList(List<Double> piecework){
            this.pieceworkList = piecework;
            return this;
        }

        public QueryBuilder fetchPiecework(){
            setFetchFields("fetchFields","piecework");
            return this;
        }

        public QueryBuilder excludePiecework(){
            setFetchFields("excludeFields","piecework");
            return this;
        }



        public QueryBuilder normalAddTimeBetWeen(Integer normalAddTimeSt,Integer normalAddTimeEd){
            this.normalAddTimeSt = normalAddTimeSt;
            this.normalAddTimeEd = normalAddTimeEd;
            return this;
        }

        public QueryBuilder normalAddTimeGreaterEqThan(Integer normalAddTimeSt){
            this.normalAddTimeSt = normalAddTimeSt;
            return this;
        }
        public QueryBuilder normalAddTimeLessEqThan(Integer normalAddTimeEd){
            this.normalAddTimeEd = normalAddTimeEd;
            return this;
        }


        public QueryBuilder normalAddTime(Integer normalAddTime){
            setNormalAddTime(normalAddTime);
            return this;
        }

        public QueryBuilder normalAddTimeList(Integer ... normalAddTime){
            if (normalAddTime != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : normalAddTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.normalAddTimeList = list;
            }

            return this;
        }

        public QueryBuilder normalAddTimeList(List<Integer> normalAddTime){
            this.normalAddTimeList = normalAddTime;
            return this;
        }

        public QueryBuilder fetchNormalAddTime(){
            setFetchFields("fetchFields","normalAddTime");
            return this;
        }

        public QueryBuilder excludeNormalAddTime(){
            setFetchFields("excludeFields","normalAddTime");
            return this;
        }



        public QueryBuilder weekAddTimeBetWeen(Integer weekAddTimeSt,Integer weekAddTimeEd){
            this.weekAddTimeSt = weekAddTimeSt;
            this.weekAddTimeEd = weekAddTimeEd;
            return this;
        }

        public QueryBuilder weekAddTimeGreaterEqThan(Integer weekAddTimeSt){
            this.weekAddTimeSt = weekAddTimeSt;
            return this;
        }
        public QueryBuilder weekAddTimeLessEqThan(Integer weekAddTimeEd){
            this.weekAddTimeEd = weekAddTimeEd;
            return this;
        }


        public QueryBuilder weekAddTime(Integer weekAddTime){
            setWeekAddTime(weekAddTime);
            return this;
        }

        public QueryBuilder weekAddTimeList(Integer ... weekAddTime){
            if (weekAddTime != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : weekAddTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.weekAddTimeList = list;
            }

            return this;
        }

        public QueryBuilder weekAddTimeList(List<Integer> weekAddTime){
            this.weekAddTimeList = weekAddTime;
            return this;
        }

        public QueryBuilder fetchWeekAddTime(){
            setFetchFields("fetchFields","weekAddTime");
            return this;
        }

        public QueryBuilder excludeWeekAddTime(){
            setFetchFields("excludeFields","weekAddTime");
            return this;
        }



        public QueryBuilder subsidyBetWeen(Double subsidySt,Double subsidyEd){
            this.subsidySt = subsidySt;
            this.subsidyEd = subsidyEd;
            return this;
        }

        public QueryBuilder subsidyGreaterEqThan(Double subsidySt){
            this.subsidySt = subsidySt;
            return this;
        }
        public QueryBuilder subsidyLessEqThan(Double subsidyEd){
            this.subsidyEd = subsidyEd;
            return this;
        }


        public QueryBuilder subsidy(Double subsidy){
            setSubsidy(subsidy);
            return this;
        }

        public QueryBuilder subsidyList(Double ... subsidy){
            if (subsidy != null){
                List<Double> list = new ArrayList<>();
                for (Double item : subsidy){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.subsidyList = list;
            }

            return this;
        }

        public QueryBuilder subsidyList(List<Double> subsidy){
            this.subsidyList = subsidy;
            return this;
        }

        public QueryBuilder fetchSubsidy(){
            setFetchFields("fetchFields","subsidy");
            return this;
        }

        public QueryBuilder excludeSubsidy(){
            setFetchFields("excludeFields","subsidy");
            return this;
        }



        public QueryBuilder remarksBetWeen(Integer remarksSt,Integer remarksEd){
            this.remarksSt = remarksSt;
            this.remarksEd = remarksEd;
            return this;
        }

        public QueryBuilder remarksGreaterEqThan(Integer remarksSt){
            this.remarksSt = remarksSt;
            return this;
        }
        public QueryBuilder remarksLessEqThan(Integer remarksEd){
            this.remarksEd = remarksEd;
            return this;
        }


        public QueryBuilder remarks(Integer remarks){
            setRemarks(remarks);
            return this;
        }

        public QueryBuilder remarksList(Integer ... remarks){
            if (remarks != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : remarks){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.remarksList = list;
            }

            return this;
        }

        public QueryBuilder remarksList(List<Integer> remarks){
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

        public Piecework build(){
            return this;
        }
    }

}
