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
public class Supplier implements Serializable {

    private static final long serialVersionUID = 1524998391428L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:0
    */
    private Integer cateId;

    /**
    * 供应商名称
    * isNullAble:0,defaultVal:
    */
    private String supplierName;

    /**
    * 供应商简介
    * isNullAble:0
    */
    private String desc;

    /**
    * 联系方式
    * isNullAble:0,defaultVal:
    */
    private String contact;

    /**
    * 联系人
    * isNullAble:0,defaultVal:
    */
    private String linkman;

    /**
    * 供应商编号
    * isNullAble:0,defaultVal:
    */
    private String supplierNo;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setCateId(Integer cateId){
        this.cateId = cateId;
    }

    public Integer getCateId(){
        return this.cateId;
    }

    public void setSupplierName(String supplierName){
        this.supplierName = supplierName;
    }

    public String getSupplierName(){
        return this.supplierName;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return this.desc;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    public String getContact(){
        return this.contact;
    }

    public void setLinkman(String linkman){
        this.linkman = linkman;
    }

    public String getLinkman(){
        return this.linkman;
    }

    public void setSupplierNo(String supplierNo){
        this.supplierNo = supplierNo;
    }

    public String getSupplierNo(){
        return this.supplierNo;
    }
    @Override
    public String toString() {
        return "Supplier{" +
                "id='" + id + '\'' +
                "cateId='" + cateId + '\'' +
                "supplierName='" + supplierName + '\'' +
                "desc='" + desc + '\'' +
                "contact='" + contact + '\'' +
                "linkman='" + linkman + '\'' +
                "supplierNo='" + supplierNo + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends Supplier{
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

        private List<Integer> cateIdList;

        private Integer cateIdSt;

        private Integer cateIdEd;

        public Integer getCateIdSt(){
            return this.cateIdSt;
        }

        public Integer getCateIdEd(){
            return this.cateIdEd;
        }

        private List<String> supplierNameList;


        private List<String> fuzzySupplierName;

        public List<String> getFuzzySupplierName(){
            return this.fuzzySupplierName;
        }

        private List<String> rightFuzzySupplierName;

        public List<String> getRightFuzzySupplierName(){
            return this.rightFuzzySupplierName;
        }
        private List<String> descList;


        private List<String> fuzzyDesc;

        public List<String> getFuzzyDesc(){
            return this.fuzzyDesc;
        }

        private List<String> rightFuzzyDesc;

        public List<String> getRightFuzzyDesc(){
            return this.rightFuzzyDesc;
        }
        private List<String> contactList;


        private List<String> fuzzyContact;

        public List<String> getFuzzyContact(){
            return this.fuzzyContact;
        }

        private List<String> rightFuzzyContact;

        public List<String> getRightFuzzyContact(){
            return this.rightFuzzyContact;
        }
        private List<String> linkmanList;


        private List<String> fuzzyLinkman;

        public List<String> getFuzzyLinkman(){
            return this.fuzzyLinkman;
        }

        private List<String> rightFuzzyLinkman;

        public List<String> getRightFuzzyLinkman(){
            return this.rightFuzzyLinkman;
        }
        private List<String> supplierNoList;


        private List<String> fuzzySupplierNo;

        public List<String> getFuzzySupplierNo(){
            return this.fuzzySupplierNo;
        }

        private List<String> rightFuzzySupplierNo;

        public List<String> getRightFuzzySupplierNo(){
            return this.rightFuzzySupplierNo;
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



        public QueryBuilder fuzzySupplierName (List<String> fuzzySupplierName){
            this.fuzzySupplierName = fuzzySupplierName;
            return this;
        }

        public QueryBuilder fuzzySupplierName (String ... fuzzySupplierName){
            if (fuzzySupplierName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySupplierName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySupplierName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySupplierName (List<String> rightFuzzySupplierName){
            this.rightFuzzySupplierName = rightFuzzySupplierName;
            return this;
        }

        public QueryBuilder rightFuzzySupplierName (String ... rightFuzzySupplierName){
            if (rightFuzzySupplierName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySupplierName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySupplierName = list;
            }
            return this;
        }

        public QueryBuilder supplierName(String supplierName){
            setSupplierName(supplierName);
            return this;
        }

        public QueryBuilder supplierNameList(String ... supplierName){
            if (supplierName != null){
                List<String> list = new ArrayList<>();
                for (String item : supplierName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.supplierNameList = list;
            }

            return this;
        }

        public QueryBuilder supplierNameList(List<String> supplierName){
            this.supplierNameList = supplierName;
            return this;
        }

        public QueryBuilder fetchSupplierName(){
            setFetchFields("fetchFields","supplierName");
            return this;
        }

        public QueryBuilder excludeSupplierName(){
            setFetchFields("excludeFields","supplierName");
            return this;
        }



        public QueryBuilder fuzzyDesc (List<String> fuzzyDesc){
            this.fuzzyDesc = fuzzyDesc;
            return this;
        }

        public QueryBuilder fuzzyDesc (String ... fuzzyDesc){
            if (fuzzyDesc != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyDesc){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyDesc = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyDesc (List<String> rightFuzzyDesc){
            this.rightFuzzyDesc = rightFuzzyDesc;
            return this;
        }

        public QueryBuilder rightFuzzyDesc (String ... rightFuzzyDesc){
            if (rightFuzzyDesc != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyDesc){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyDesc = list;
            }
            return this;
        }

        public QueryBuilder desc(String desc){
            setDesc(desc);
            return this;
        }

        public QueryBuilder descList(String ... desc){
            if (desc != null){
                List<String> list = new ArrayList<>();
                for (String item : desc){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.descList = list;
            }

            return this;
        }

        public QueryBuilder descList(List<String> desc){
            this.descList = desc;
            return this;
        }

        public QueryBuilder fetchDesc(){
            setFetchFields("fetchFields","desc");
            return this;
        }

        public QueryBuilder excludeDesc(){
            setFetchFields("excludeFields","desc");
            return this;
        }



        public QueryBuilder fuzzyContact (List<String> fuzzyContact){
            this.fuzzyContact = fuzzyContact;
            return this;
        }

        public QueryBuilder fuzzyContact (String ... fuzzyContact){
            if (fuzzyContact != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyContact){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyContact = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyContact (List<String> rightFuzzyContact){
            this.rightFuzzyContact = rightFuzzyContact;
            return this;
        }

        public QueryBuilder rightFuzzyContact (String ... rightFuzzyContact){
            if (rightFuzzyContact != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyContact){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyContact = list;
            }
            return this;
        }

        public QueryBuilder contact(String contact){
            setContact(contact);
            return this;
        }

        public QueryBuilder contactList(String ... contact){
            if (contact != null){
                List<String> list = new ArrayList<>();
                for (String item : contact){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.contactList = list;
            }

            return this;
        }

        public QueryBuilder contactList(List<String> contact){
            this.contactList = contact;
            return this;
        }

        public QueryBuilder fetchContact(){
            setFetchFields("fetchFields","contact");
            return this;
        }

        public QueryBuilder excludeContact(){
            setFetchFields("excludeFields","contact");
            return this;
        }



        public QueryBuilder fuzzyLinkman (List<String> fuzzyLinkman){
            this.fuzzyLinkman = fuzzyLinkman;
            return this;
        }

        public QueryBuilder fuzzyLinkman (String ... fuzzyLinkman){
            if (fuzzyLinkman != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyLinkman){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyLinkman = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyLinkman (List<String> rightFuzzyLinkman){
            this.rightFuzzyLinkman = rightFuzzyLinkman;
            return this;
        }

        public QueryBuilder rightFuzzyLinkman (String ... rightFuzzyLinkman){
            if (rightFuzzyLinkman != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyLinkman){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyLinkman = list;
            }
            return this;
        }

        public QueryBuilder linkman(String linkman){
            setLinkman(linkman);
            return this;
        }

        public QueryBuilder linkmanList(String ... linkman){
            if (linkman != null){
                List<String> list = new ArrayList<>();
                for (String item : linkman){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.linkmanList = list;
            }

            return this;
        }

        public QueryBuilder linkmanList(List<String> linkman){
            this.linkmanList = linkman;
            return this;
        }

        public QueryBuilder fetchLinkman(){
            setFetchFields("fetchFields","linkman");
            return this;
        }

        public QueryBuilder excludeLinkman(){
            setFetchFields("excludeFields","linkman");
            return this;
        }



        public QueryBuilder fuzzySupplierNo (List<String> fuzzySupplierNo){
            this.fuzzySupplierNo = fuzzySupplierNo;
            return this;
        }

        public QueryBuilder fuzzySupplierNo (String ... fuzzySupplierNo){
            if (fuzzySupplierNo != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzySupplierNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzySupplierNo = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzySupplierNo (List<String> rightFuzzySupplierNo){
            this.rightFuzzySupplierNo = rightFuzzySupplierNo;
            return this;
        }

        public QueryBuilder rightFuzzySupplierNo (String ... rightFuzzySupplierNo){
            if (rightFuzzySupplierNo != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzySupplierNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzySupplierNo = list;
            }
            return this;
        }

        public QueryBuilder supplierNo(String supplierNo){
            setSupplierNo(supplierNo);
            return this;
        }

        public QueryBuilder supplierNoList(String ... supplierNo){
            if (supplierNo != null){
                List<String> list = new ArrayList<>();
                for (String item : supplierNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.supplierNoList = list;
            }

            return this;
        }

        public QueryBuilder supplierNoList(List<String> supplierNo){
            this.supplierNoList = supplierNo;
            return this;
        }

        public QueryBuilder fetchSupplierNo(){
            setFetchFields("fetchFields","supplierNo");
            return this;
        }

        public QueryBuilder excludeSupplierNo(){
            setFetchFields("excludeFields","supplierNo");
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

        public Supplier build(){
            return this;
        }
    }

}
