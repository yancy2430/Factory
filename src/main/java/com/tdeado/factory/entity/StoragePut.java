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
public class StoragePut implements Serializable {

    private static final long serialVersionUID = 1524998384974L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 供应商ID
    * isNullAble:0
    */
    private Integer supplierId;

    /**
    * 订单名称
    * isNullAble:0,defaultVal:
    */
    private String name;

    /**
    * 添加时间
    * isNullAble:0
    */
    private Integer addtime;

    /**
    * 入库单号
    * isNullAble:0,defaultVal:
    */
    private String putorderId;

    /**
    * 
    * isNullAble:0
    */
    private String info;

    /**
    * 
    * isNullAble:0
    */
    private String remarks;

    /**
    * 入库时间
    * isNullAble:0,defaultVal:
    */
    private String puttime;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setSupplierId(Integer supplierId){
        this.supplierId = supplierId;
    }

    public Integer getSupplierId(){
        return this.supplierId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAddtime(Integer addtime){
        this.addtime = addtime;
    }

    public Integer getAddtime(){
        return this.addtime;
    }

    public void setPutorderId(String putorderId){
        this.putorderId = putorderId;
    }

    public String getPutorderId(){
        return this.putorderId;
    }

    public void setInfo(String info){
        this.info = info;
    }

    public String getInfo(){
        return this.info;
    }

    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

    public String getRemarks(){
        return this.remarks;
    }

    public void setPuttime(String puttime){
        this.puttime = puttime;
    }

    public String getPuttime(){
        return this.puttime;
    }
    @Override
    public String toString() {
        return "StoragePut{" +
                "id='" + id + '\'' +
                "supplierId='" + supplierId + '\'' +
                "name='" + name + '\'' +
                "addtime='" + addtime + '\'' +
                "putorderId='" + putorderId + '\'' +
                "info='" + info + '\'' +
                "remarks='" + remarks + '\'' +
                "puttime='" + puttime + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends StoragePut{
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

        private List<Integer> supplierIdList;

        private Integer supplierIdSt;

        private Integer supplierIdEd;

        public Integer getSupplierIdSt(){
            return this.supplierIdSt;
        }

        public Integer getSupplierIdEd(){
            return this.supplierIdEd;
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
        private List<Integer> addtimeList;

        private Integer addtimeSt;

        private Integer addtimeEd;

        public Integer getAddtimeSt(){
            return this.addtimeSt;
        }

        public Integer getAddtimeEd(){
            return this.addtimeEd;
        }

        private List<String> putorderIdList;


        private List<String> fuzzyPutorderId;

        public List<String> getFuzzyPutorderId(){
            return this.fuzzyPutorderId;
        }

        private List<String> rightFuzzyPutorderId;

        public List<String> getRightFuzzyPutorderId(){
            return this.rightFuzzyPutorderId;
        }
        private List<String> infoList;


        private List<String> fuzzyInfo;

        public List<String> getFuzzyInfo(){
            return this.fuzzyInfo;
        }

        private List<String> rightFuzzyInfo;

        public List<String> getRightFuzzyInfo(){
            return this.rightFuzzyInfo;
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
        private List<String> puttimeList;


        private List<String> fuzzyPuttime;

        public List<String> getFuzzyPuttime(){
            return this.fuzzyPuttime;
        }

        private List<String> rightFuzzyPuttime;

        public List<String> getRightFuzzyPuttime(){
            return this.rightFuzzyPuttime;
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



        public QueryBuilder supplierIdBetWeen(Integer supplierIdSt,Integer supplierIdEd){
            this.supplierIdSt = supplierIdSt;
            this.supplierIdEd = supplierIdEd;
            return this;
        }

        public QueryBuilder supplierIdGreaterEqThan(Integer supplierIdSt){
            this.supplierIdSt = supplierIdSt;
            return this;
        }
        public QueryBuilder supplierIdLessEqThan(Integer supplierIdEd){
            this.supplierIdEd = supplierIdEd;
            return this;
        }


        public QueryBuilder supplierId(Integer supplierId){
            setSupplierId(supplierId);
            return this;
        }

        public QueryBuilder supplierIdList(Integer ... supplierId){
            if (supplierId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : supplierId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.supplierIdList = list;
            }

            return this;
        }

        public QueryBuilder supplierIdList(List<Integer> supplierId){
            this.supplierIdList = supplierId;
            return this;
        }

        public QueryBuilder fetchSupplierId(){
            setFetchFields("fetchFields","supplierId");
            return this;
        }

        public QueryBuilder excludeSupplierId(){
            setFetchFields("excludeFields","supplierId");
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



        public QueryBuilder fuzzyPutorderId (List<String> fuzzyPutorderId){
            this.fuzzyPutorderId = fuzzyPutorderId;
            return this;
        }

        public QueryBuilder fuzzyPutorderId (String ... fuzzyPutorderId){
            if (fuzzyPutorderId != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPutorderId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPutorderId = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPutorderId (List<String> rightFuzzyPutorderId){
            this.rightFuzzyPutorderId = rightFuzzyPutorderId;
            return this;
        }

        public QueryBuilder rightFuzzyPutorderId (String ... rightFuzzyPutorderId){
            if (rightFuzzyPutorderId != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPutorderId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPutorderId = list;
            }
            return this;
        }

        public QueryBuilder putorderId(String putorderId){
            setPutorderId(putorderId);
            return this;
        }

        public QueryBuilder putorderIdList(String ... putorderId){
            if (putorderId != null){
                List<String> list = new ArrayList<>();
                for (String item : putorderId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.putorderIdList = list;
            }

            return this;
        }

        public QueryBuilder putorderIdList(List<String> putorderId){
            this.putorderIdList = putorderId;
            return this;
        }

        public QueryBuilder fetchPutorderId(){
            setFetchFields("fetchFields","putorderId");
            return this;
        }

        public QueryBuilder excludePutorderId(){
            setFetchFields("excludeFields","putorderId");
            return this;
        }



        public QueryBuilder fuzzyInfo (List<String> fuzzyInfo){
            this.fuzzyInfo = fuzzyInfo;
            return this;
        }

        public QueryBuilder fuzzyInfo (String ... fuzzyInfo){
            if (fuzzyInfo != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyInfo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyInfo = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyInfo (List<String> rightFuzzyInfo){
            this.rightFuzzyInfo = rightFuzzyInfo;
            return this;
        }

        public QueryBuilder rightFuzzyInfo (String ... rightFuzzyInfo){
            if (rightFuzzyInfo != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyInfo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyInfo = list;
            }
            return this;
        }

        public QueryBuilder info(String info){
            setInfo(info);
            return this;
        }

        public QueryBuilder infoList(String ... info){
            if (info != null){
                List<String> list = new ArrayList<>();
                for (String item : info){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.infoList = list;
            }

            return this;
        }

        public QueryBuilder infoList(List<String> info){
            this.infoList = info;
            return this;
        }

        public QueryBuilder fetchInfo(){
            setFetchFields("fetchFields","info");
            return this;
        }

        public QueryBuilder excludeInfo(){
            setFetchFields("excludeFields","info");
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



        public QueryBuilder fuzzyPuttime (List<String> fuzzyPuttime){
            this.fuzzyPuttime = fuzzyPuttime;
            return this;
        }

        public QueryBuilder fuzzyPuttime (String ... fuzzyPuttime){
            if (fuzzyPuttime != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPuttime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPuttime = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPuttime (List<String> rightFuzzyPuttime){
            this.rightFuzzyPuttime = rightFuzzyPuttime;
            return this;
        }

        public QueryBuilder rightFuzzyPuttime (String ... rightFuzzyPuttime){
            if (rightFuzzyPuttime != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPuttime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPuttime = list;
            }
            return this;
        }

        public QueryBuilder puttime(String puttime){
            setPuttime(puttime);
            return this;
        }

        public QueryBuilder puttimeList(String ... puttime){
            if (puttime != null){
                List<String> list = new ArrayList<>();
                for (String item : puttime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.puttimeList = list;
            }

            return this;
        }

        public QueryBuilder puttimeList(List<String> puttime){
            this.puttimeList = puttime;
            return this;
        }

        public QueryBuilder fetchPuttime(){
            setFetchFields("fetchFields","puttime");
            return this;
        }

        public QueryBuilder excludePuttime(){
            setFetchFields("excludeFields","puttime");
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

        public StoragePut build(){
            return this;
        }
    }

}
