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
public class StorageMateriel implements Serializable {

    private static final long serialVersionUID = 1524998378987L;


    /**
    * 主键
    * ID
    * isNullAble:0
    */
    private Integer id;

    /**
    * 料号
    * isNullAble:0
    */
    private String materielNo;

    /**
    * 类别
    * isNullAble:0
    */
    private Integer cateId;

    /**
    * 单位
    * isNullAble:1,defaultVal:
    */
    private String materielCompany;

    /**
    * 数量
    * isNullAble:0
    */
    private Integer materielNumber;

    /**
    * 名称
    * isNullAble:0
    */
    private String materielName;

    /**
    * 规格
    * isNullAble:1,defaultVal:
    */
    private String spec;

    /**
    * 添加时间
    * isNullAble:0
    */
    private String dateline;

    /**
    * 备注
    * isNullAble:1,defaultVal:
    */
    private String remarks;

    /**
    * 
    * isNullAble:1,defaultVal:
    */
    private String image;

    /**
    * 
    * isNullAble:0
    */
    private Integer locationId;

    /**
    * 已占用数量
    * isNullAble:0
    */
    private Integer lockNumber;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setMaterielNo(String materielNo){
        this.materielNo = materielNo;
    }

    public String getMaterielNo(){
        return this.materielNo;
    }

    public void setCateId(Integer cateId){
        this.cateId = cateId;
    }

    public Integer getCateId(){
        return this.cateId;
    }

    public void setMaterielCompany(String materielCompany){
        this.materielCompany = materielCompany;
    }

    public String getMaterielCompany(){
        return this.materielCompany;
    }

    public void setMaterielNumber(Integer materielNumber){
        this.materielNumber = materielNumber;
    }

    public Integer getMaterielNumber(){
        return this.materielNumber;
    }

    public void setMaterielName(String materielName){
        this.materielName = materielName;
    }

    public String getMaterielName(){
        return this.materielName;
    }

    public void setSpec(String spec){
        this.spec = spec;
    }

    public String getSpec(){
        return this.spec;
    }

    public void setDateline(String dateline){
        this.dateline = dateline;
    }

    public String getDateline(){
        return this.dateline;
    }

    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

    public String getRemarks(){
        return this.remarks;
    }

    public void setImage(String image){
        this.image = image;
    }

    public String getImage(){
        return this.image;
    }

    public void setLocationId(Integer locationId){
        this.locationId = locationId;
    }

    public Integer getLocationId(){
        return this.locationId;
    }

    public void setLockNumber(Integer lockNumber){
        this.lockNumber = lockNumber;
    }

    public Integer getLockNumber(){
        return this.lockNumber;
    }
    @Override
    public String toString() {
        return "StorageMateriel{" +
                "id='" + id + '\'' +
                "materielNo='" + materielNo + '\'' +
                "cateId='" + cateId + '\'' +
                "materielCompany='" + materielCompany + '\'' +
                "materielNumber='" + materielNumber + '\'' +
                "materielName='" + materielName + '\'' +
                "spec='" + spec + '\'' +
                "dateline='" + dateline + '\'' +
                "remarks='" + remarks + '\'' +
                "image='" + image + '\'' +
                "locationId='" + locationId + '\'' +
                "lockNumber='" + lockNumber + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends StorageMateriel{
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

        private List<String> materielNoList;


        private List<String> fuzzyMaterielNo;

        public List<String> getFuzzyMaterielNo(){
            return this.fuzzyMaterielNo;
        }

        private List<String> rightFuzzyMaterielNo;

        public List<String> getRightFuzzyMaterielNo(){
            return this.rightFuzzyMaterielNo;
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

        private List<String> materielCompanyList;


        private List<String> fuzzyMaterielCompany;

        public List<String> getFuzzyMaterielCompany(){
            return this.fuzzyMaterielCompany;
        }

        private List<String> rightFuzzyMaterielCompany;

        public List<String> getRightFuzzyMaterielCompany(){
            return this.rightFuzzyMaterielCompany;
        }
        private List<Integer> materielNumberList;

        private Integer materielNumberSt;

        private Integer materielNumberEd;

        public Integer getMaterielNumberSt(){
            return this.materielNumberSt;
        }

        public Integer getMaterielNumberEd(){
            return this.materielNumberEd;
        }

        private List<String> materielNameList;


        private List<String> fuzzyMaterielName;

        public List<String> getFuzzyMaterielName(){
            return this.fuzzyMaterielName;
        }

        private List<String> rightFuzzyMaterielName;

        public List<String> getRightFuzzyMaterielName(){
            return this.rightFuzzyMaterielName;
        }
        private List<String> specList;


        private List<String> fuzzySpec;

        public List<String> getFuzzySpec(){
            return this.fuzzySpec;
        }

        private List<String> rightFuzzySpec;

        public List<String> getRightFuzzySpec(){
            return this.rightFuzzySpec;
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
        private List<String> remarksList;


        private List<String> fuzzyRemarks;

        public List<String> getFuzzyRemarks(){
            return this.fuzzyRemarks;
        }

        private List<String> rightFuzzyRemarks;

        public List<String> getRightFuzzyRemarks(){
            return this.rightFuzzyRemarks;
        }
        private List<String> imageList;


        private List<String> fuzzyImage;

        public List<String> getFuzzyImage(){
            return this.fuzzyImage;
        }

        private List<String> rightFuzzyImage;

        public List<String> getRightFuzzyImage(){
            return this.rightFuzzyImage;
        }
        private List<Integer> locationIdList;

        private Integer locationIdSt;

        private Integer locationIdEd;

        public Integer getLocationIdSt(){
            return this.locationIdSt;
        }

        public Integer getLocationIdEd(){
            return this.locationIdEd;
        }

        private List<Integer> lockNumberList;

        private Integer lockNumberSt;

        private Integer lockNumberEd;

        public Integer getLockNumberSt(){
            return this.lockNumberSt;
        }

        public Integer getLockNumberEd(){
            return this.lockNumberEd;
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



        public QueryBuilder fuzzyMaterielNo (List<String> fuzzyMaterielNo){
            this.fuzzyMaterielNo = fuzzyMaterielNo;
            return this;
        }

        public QueryBuilder fuzzyMaterielNo (String ... fuzzyMaterielNo){
            if (fuzzyMaterielNo != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyMaterielNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyMaterielNo = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyMaterielNo (List<String> rightFuzzyMaterielNo){
            this.rightFuzzyMaterielNo = rightFuzzyMaterielNo;
            return this;
        }

        public QueryBuilder rightFuzzyMaterielNo (String ... rightFuzzyMaterielNo){
            if (rightFuzzyMaterielNo != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyMaterielNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyMaterielNo = list;
            }
            return this;
        }

        public QueryBuilder materielNo(String materielNo){
            setMaterielNo(materielNo);
            return this;
        }

        public QueryBuilder materielNoList(String ... materielNo){
            if (materielNo != null){
                List<String> list = new ArrayList<>();
                for (String item : materielNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.materielNoList = list;
            }

            return this;
        }

        public QueryBuilder materielNoList(List<String> materielNo){
            this.materielNoList = materielNo;
            return this;
        }

        public QueryBuilder fetchMaterielNo(){
            setFetchFields("fetchFields","materielNo");
            return this;
        }

        public QueryBuilder excludeMaterielNo(){
            setFetchFields("excludeFields","materielNo");
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



        public QueryBuilder fuzzyMaterielCompany (List<String> fuzzyMaterielCompany){
            this.fuzzyMaterielCompany = fuzzyMaterielCompany;
            return this;
        }

        public QueryBuilder fuzzyMaterielCompany (String ... fuzzyMaterielCompany){
            if (fuzzyMaterielCompany != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyMaterielCompany){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyMaterielCompany = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyMaterielCompany (List<String> rightFuzzyMaterielCompany){
            this.rightFuzzyMaterielCompany = rightFuzzyMaterielCompany;
            return this;
        }

        public QueryBuilder rightFuzzyMaterielCompany (String ... rightFuzzyMaterielCompany){
            if (rightFuzzyMaterielCompany != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyMaterielCompany){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyMaterielCompany = list;
            }
            return this;
        }

        public QueryBuilder materielCompany(String materielCompany){
            setMaterielCompany(materielCompany);
            return this;
        }

        public QueryBuilder materielCompanyList(String ... materielCompany){
            if (materielCompany != null){
                List<String> list = new ArrayList<>();
                for (String item : materielCompany){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.materielCompanyList = list;
            }

            return this;
        }

        public QueryBuilder materielCompanyList(List<String> materielCompany){
            this.materielCompanyList = materielCompany;
            return this;
        }

        public QueryBuilder fetchMaterielCompany(){
            setFetchFields("fetchFields","materielCompany");
            return this;
        }

        public QueryBuilder excludeMaterielCompany(){
            setFetchFields("excludeFields","materielCompany");
            return this;
        }



        public QueryBuilder materielNumberBetWeen(Integer materielNumberSt,Integer materielNumberEd){
            this.materielNumberSt = materielNumberSt;
            this.materielNumberEd = materielNumberEd;
            return this;
        }

        public QueryBuilder materielNumberGreaterEqThan(Integer materielNumberSt){
            this.materielNumberSt = materielNumberSt;
            return this;
        }
        public QueryBuilder materielNumberLessEqThan(Integer materielNumberEd){
            this.materielNumberEd = materielNumberEd;
            return this;
        }


        public QueryBuilder materielNumber(Integer materielNumber){
            setMaterielNumber(materielNumber);
            return this;
        }

        public QueryBuilder materielNumberList(Integer ... materielNumber){
            if (materielNumber != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : materielNumber){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.materielNumberList = list;
            }

            return this;
        }

        public QueryBuilder materielNumberList(List<Integer> materielNumber){
            this.materielNumberList = materielNumber;
            return this;
        }

        public QueryBuilder fetchMaterielNumber(){
            setFetchFields("fetchFields","materielNumber");
            return this;
        }

        public QueryBuilder excludeMaterielNumber(){
            setFetchFields("excludeFields","materielNumber");
            return this;
        }



        public QueryBuilder fuzzyMaterielName (List<String> fuzzyMaterielName){
            this.fuzzyMaterielName = fuzzyMaterielName;
            return this;
        }

        public QueryBuilder fuzzyMaterielName (String ... fuzzyMaterielName){
            if (fuzzyMaterielName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyMaterielName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyMaterielName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyMaterielName (List<String> rightFuzzyMaterielName){
            this.rightFuzzyMaterielName = rightFuzzyMaterielName;
            return this;
        }

        public QueryBuilder rightFuzzyMaterielName (String ... rightFuzzyMaterielName){
            if (rightFuzzyMaterielName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyMaterielName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyMaterielName = list;
            }
            return this;
        }

        public QueryBuilder materielName(String materielName){
            setMaterielName(materielName);
            return this;
        }

        public QueryBuilder materielNameList(String ... materielName){
            if (materielName != null){
                List<String> list = new ArrayList<>();
                for (String item : materielName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.materielNameList = list;
            }

            return this;
        }

        public QueryBuilder materielNameList(List<String> materielName){
            this.materielNameList = materielName;
            return this;
        }

        public QueryBuilder fetchMaterielName(){
            setFetchFields("fetchFields","materielName");
            return this;
        }

        public QueryBuilder excludeMaterielName(){
            setFetchFields("excludeFields","materielName");
            return this;
        }



        public QueryBuilder fuzzySpec (List<String> fuzzySpec){
            this.fuzzySpec = fuzzySpec;
            return this;
        }

        public QueryBuilder fuzzySpec (String ... fuzzySpec){
            if (fuzzySpec != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySpec){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySpec = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySpec (List<String> rightFuzzySpec){
            this.rightFuzzySpec = rightFuzzySpec;
            return this;
        }

        public QueryBuilder rightFuzzySpec (String ... rightFuzzySpec){
            if (rightFuzzySpec != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySpec){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySpec = list;
            }
            return this;
        }

        public QueryBuilder spec(String spec){
            setSpec(spec);
            return this;
        }

        public QueryBuilder specList(String ... spec){
            if (spec != null){
                List<String> list = new ArrayList<>();
                for (String item : spec){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.specList = list;
            }

            return this;
        }

        public QueryBuilder specList(List<String> spec){
            this.specList = spec;
            return this;
        }

        public QueryBuilder fetchSpec(){
            setFetchFields("fetchFields","spec");
            return this;
        }

        public QueryBuilder excludeSpec(){
            setFetchFields("excludeFields","spec");
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



        public QueryBuilder fuzzyImage (List<String> fuzzyImage){
            this.fuzzyImage = fuzzyImage;
            return this;
        }

        public QueryBuilder fuzzyImage (String ... fuzzyImage){
            if (fuzzyImage != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyImage){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyImage = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyImage (List<String> rightFuzzyImage){
            this.rightFuzzyImage = rightFuzzyImage;
            return this;
        }

        public QueryBuilder rightFuzzyImage (String ... rightFuzzyImage){
            if (rightFuzzyImage != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyImage){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyImage = list;
            }
            return this;
        }

        public QueryBuilder image(String image){
            setImage(image);
            return this;
        }

        public QueryBuilder imageList(String ... image){
            if (image != null){
                List<String> list = new ArrayList<>();
                for (String item : image){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.imageList = list;
            }

            return this;
        }

        public QueryBuilder imageList(List<String> image){
            this.imageList = image;
            return this;
        }

        public QueryBuilder fetchImage(){
            setFetchFields("fetchFields","image");
            return this;
        }

        public QueryBuilder excludeImage(){
            setFetchFields("excludeFields","image");
            return this;
        }



        public QueryBuilder locationIdBetWeen(Integer locationIdSt,Integer locationIdEd){
            this.locationIdSt = locationIdSt;
            this.locationIdEd = locationIdEd;
            return this;
        }

        public QueryBuilder locationIdGreaterEqThan(Integer locationIdSt){
            this.locationIdSt = locationIdSt;
            return this;
        }
        public QueryBuilder locationIdLessEqThan(Integer locationIdEd){
            this.locationIdEd = locationIdEd;
            return this;
        }


        public QueryBuilder locationId(Integer locationId){
            setLocationId(locationId);
            return this;
        }

        public QueryBuilder locationIdList(Integer ... locationId){
            if (locationId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : locationId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.locationIdList = list;
            }

            return this;
        }

        public QueryBuilder locationIdList(List<Integer> locationId){
            this.locationIdList = locationId;
            return this;
        }

        public QueryBuilder fetchLocationId(){
            setFetchFields("fetchFields","locationId");
            return this;
        }

        public QueryBuilder excludeLocationId(){
            setFetchFields("excludeFields","locationId");
            return this;
        }



        public QueryBuilder lockNumberBetWeen(Integer lockNumberSt,Integer lockNumberEd){
            this.lockNumberSt = lockNumberSt;
            this.lockNumberEd = lockNumberEd;
            return this;
        }

        public QueryBuilder lockNumberGreaterEqThan(Integer lockNumberSt){
            this.lockNumberSt = lockNumberSt;
            return this;
        }
        public QueryBuilder lockNumberLessEqThan(Integer lockNumberEd){
            this.lockNumberEd = lockNumberEd;
            return this;
        }


        public QueryBuilder lockNumber(Integer lockNumber){
            setLockNumber(lockNumber);
            return this;
        }

        public QueryBuilder lockNumberList(Integer ... lockNumber){
            if (lockNumber != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : lockNumber){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.lockNumberList = list;
            }

            return this;
        }

        public QueryBuilder lockNumberList(List<Integer> lockNumber){
            this.lockNumberList = lockNumber;
            return this;
        }

        public QueryBuilder fetchLockNumber(){
            setFetchFields("fetchFields","lockNumber");
            return this;
        }

        public QueryBuilder excludeLockNumber(){
            setFetchFields("excludeFields","lockNumber");
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

        public StorageMateriel build(){
            return this;
        }
    }

}
