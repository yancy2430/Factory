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
public class ProductMateriel implements Serializable {

    private static final long serialVersionUID = 1524998341317L;


    /**
    * 产品id
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 物料ID
    * isNullAble:0
    */
    private Integer materielId;

    /**
    * 
    * isNullAble:0
    */
    private String materielNo;

    /**
    * 物料名称
    * isNullAble:0
    */
    private String materielName;

    /**
    * 数量
    * isNullAble:0,defaultVal:1
    */
    private Integer materielNumber;

    /**
    * 
    * isNullAble:0
    */
    private String materielCompany;

    /**
    * 
    * isNullAble:0
    */
    private Integer cateId;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String spec;

    /**
    * 
    * isNullAble:1
    */
    private String remarks;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String image;

    /**
    * 
    * isNullAble:1
    */
    private Integer locationId;


    public void setProductId(Integer productId){
        this.productId = productId;
    }

    public Integer getProductId(){
        return this.productId;
    }

    public void setMaterielId(Integer materielId){
        this.materielId = materielId;
    }

    public Integer getMaterielId(){
        return this.materielId;
    }

    public void setMaterielNo(String materielNo){
        this.materielNo = materielNo;
    }

    public String getMaterielNo(){
        return this.materielNo;
    }

    public void setMaterielName(String materielName){
        this.materielName = materielName;
    }

    public String getMaterielName(){
        return this.materielName;
    }

    public void setMaterielNumber(Integer materielNumber){
        this.materielNumber = materielNumber;
    }

    public Integer getMaterielNumber(){
        return this.materielNumber;
    }

    public void setMaterielCompany(String materielCompany){
        this.materielCompany = materielCompany;
    }

    public String getMaterielCompany(){
        return this.materielCompany;
    }

    public void setCateId(Integer cateId){
        this.cateId = cateId;
    }

    public Integer getCateId(){
        return this.cateId;
    }

    public void setSpec(String spec){
        this.spec = spec;
    }

    public String getSpec(){
        return this.spec;
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
    @Override
    public String toString() {
        return "ProductMateriel{" +
                "productId='" + productId + '\'' +
                "materielId='" + materielId + '\'' +
                "materielNo='" + materielNo + '\'' +
                "materielName='" + materielName + '\'' +
                "materielNumber='" + materielNumber + '\'' +
                "materielCompany='" + materielCompany + '\'' +
                "cateId='" + cateId + '\'' +
                "spec='" + spec + '\'' +
                "remarks='" + remarks + '\'' +
                "image='" + image + '\'' +
                "locationId='" + locationId + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends ProductMateriel{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
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

        private List<Integer> materielIdList;

        private Integer materielIdSt;

        private Integer materielIdEd;

        public Integer getMaterielIdSt(){
            return this.materielIdSt;
        }

        public Integer getMaterielIdEd(){
            return this.materielIdEd;
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
        private List<String> materielNameList;


        private List<String> fuzzyMaterielName;

        public List<String> getFuzzyMaterielName(){
            return this.fuzzyMaterielName;
        }

        private List<String> rightFuzzyMaterielName;

        public List<String> getRightFuzzyMaterielName(){
            return this.rightFuzzyMaterielName;
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

        private List<String> materielCompanyList;


        private List<String> fuzzyMaterielCompany;

        public List<String> getFuzzyMaterielCompany(){
            return this.fuzzyMaterielCompany;
        }

        private List<String> rightFuzzyMaterielCompany;

        public List<String> getRightFuzzyMaterielCompany(){
            return this.rightFuzzyMaterielCompany;
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

        private List<String> specList;


        private List<String> fuzzySpec;

        public List<String> getFuzzySpec(){
            return this.fuzzySpec;
        }

        private List<String> rightFuzzySpec;

        public List<String> getRightFuzzySpec(){
            return this.rightFuzzySpec;
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

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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



        public QueryBuilder materielIdBetWeen(Integer materielIdSt,Integer materielIdEd){
            this.materielIdSt = materielIdSt;
            this.materielIdEd = materielIdEd;
            return this;
        }

        public QueryBuilder materielIdGreaterEqThan(Integer materielIdSt){
            this.materielIdSt = materielIdSt;
            return this;
        }
        public QueryBuilder materielIdLessEqThan(Integer materielIdEd){
            this.materielIdEd = materielIdEd;
            return this;
        }


        public QueryBuilder materielId(Integer materielId){
            setMaterielId(materielId);
            return this;
        }

        public QueryBuilder materielIdList(Integer ... materielId){
            if (materielId != null){
                List<Integer> list = new ArrayList<>();
                for (Integer item : materielId){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.materielIdList = list;
            }

            return this;
        }

        public QueryBuilder materielIdList(List<Integer> materielId){
            this.materielIdList = materielId;
            return this;
        }

        public QueryBuilder fetchMaterielId(){
            setFetchFields("fetchFields","materielId");
            return this;
        }

        public QueryBuilder excludeMaterielId(){
            setFetchFields("excludeFields","materielId");
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

        public ProductMateriel build(){
            return this;
        }
    }

}
