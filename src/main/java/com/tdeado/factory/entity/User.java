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
public class User implements Serializable {

    private static final long serialVersionUID = 1524998405481L;


    /**
    * 主键
    * 用户ID
    * isNullAble:0
    */
    private Integer id;

    /**
    * 员工姓名
    * isNullAble:0
    */
    private String userName;

    /**
    * 员工ID
    * isNullAble:0
    */
    private String userNo;

    /**
    * 职位
    * isNullAble:0
    */
    private String position;

    /**
    * 入职时间
    * isNullAble:0
    */
    private String entryTime;

    /**
    * 离职时间
    * isNullAble:0
    */
    private String dimissionTime;

    /**
    * 状态 0离职 1在职 2删除
    * isNullAble:0
    */
    private Integer status;

    /**
    * 联系电话
    * isNullAble:0
    */
    private String phone;

    /**
    * 分组id
    * isNullAble:0
    */
    private Integer cateId;


    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setUserNo(String userNo){
        this.userNo = userNo;
    }

    public String getUserNo(){
        return this.userNo;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getPosition(){
        return this.position;
    }

    public void setEntryTime(String entryTime){
        this.entryTime = entryTime;
    }

    public String getEntryTime(){
        return this.entryTime;
    }

    public void setDimissionTime(String dimissionTime){
        this.dimissionTime = dimissionTime;
    }

    public String getDimissionTime(){
        return this.dimissionTime;
    }

    public void setStatus(Integer status){
        this.status = status;
    }

    public Integer getStatus(){
        return this.status;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setCateId(Integer cateId){
        this.cateId = cateId;
    }

    public Integer getCateId(){
        return this.cateId;
    }
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                "userName='" + userName + '\'' +
                "userNo='" + userNo + '\'' +
                "position='" + position + '\'' +
                "entryTime='" + entryTime + '\'' +
                "dimissionTime='" + dimissionTime + '\'' +
                "status='" + status + '\'' +
                "phone='" + phone + '\'' +
                "cateId='" + cateId + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends User{
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

        private List<String> userNameList;


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){
            return this.fuzzyUserName;
        }

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){
            return this.rightFuzzyUserName;
        }
        private List<String> userNoList;


        private List<String> fuzzyUserNo;

        public List<String> getFuzzyUserNo(){
            return this.fuzzyUserNo;
        }

        private List<String> rightFuzzyUserNo;

        public List<String> getRightFuzzyUserNo(){
            return this.rightFuzzyUserNo;
        }
        private List<String> positionList;


        private List<String> fuzzyPosition;

        public List<String> getFuzzyPosition(){
            return this.fuzzyPosition;
        }

        private List<String> rightFuzzyPosition;

        public List<String> getRightFuzzyPosition(){
            return this.rightFuzzyPosition;
        }
        private List<String> entryTimeList;


        private List<String> fuzzyEntryTime;

        public List<String> getFuzzyEntryTime(){
            return this.fuzzyEntryTime;
        }

        private List<String> rightFuzzyEntryTime;

        public List<String> getRightFuzzyEntryTime(){
            return this.rightFuzzyEntryTime;
        }
        private List<String> dimissionTimeList;


        private List<String> fuzzyDimissionTime;

        public List<String> getFuzzyDimissionTime(){
            return this.fuzzyDimissionTime;
        }

        private List<String> rightFuzzyDimissionTime;

        public List<String> getRightFuzzyDimissionTime(){
            return this.rightFuzzyDimissionTime;
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

        private List<String> phoneList;


        private List<String> fuzzyPhone;

        public List<String> getFuzzyPhone(){
            return this.fuzzyPhone;
        }

        private List<String> rightFuzzyPhone;

        public List<String> getRightFuzzyPhone(){
            return this.rightFuzzyPhone;
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



        public QueryBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName (String ... fuzzyUserName){
            if (fuzzyUserName != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyUserName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyUserName = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            if (rightFuzzyUserName != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyUserName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyUserName = list;
            }
            return this;
        }

        public QueryBuilder userName(String userName){
            setUserName(userName);
            return this;
        }

        public QueryBuilder userNameList(String ... userName){
            if (userName != null){
                List<String> list = new ArrayList<>();
                for (String item : userName){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.userNameList = list;
            }

            return this;
        }

        public QueryBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public QueryBuilder fetchUserName(){
            setFetchFields("fetchFields","userName");
            return this;
        }

        public QueryBuilder excludeUserName(){
            setFetchFields("excludeFields","userName");
            return this;
        }



        public QueryBuilder fuzzyUserNo (List<String> fuzzyUserNo){
            this.fuzzyUserNo = fuzzyUserNo;
            return this;
        }

        public QueryBuilder fuzzyUserNo (String ... fuzzyUserNo){
            if (fuzzyUserNo != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyUserNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyUserNo = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyUserNo (List<String> rightFuzzyUserNo){
            this.rightFuzzyUserNo = rightFuzzyUserNo;
            return this;
        }

        public QueryBuilder rightFuzzyUserNo (String ... rightFuzzyUserNo){
            if (rightFuzzyUserNo != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyUserNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyUserNo = list;
            }
            return this;
        }

        public QueryBuilder userNo(String userNo){
            setUserNo(userNo);
            return this;
        }

        public QueryBuilder userNoList(String ... userNo){
            if (userNo != null){
                List<String> list = new ArrayList<>();
                for (String item : userNo){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.userNoList = list;
            }

            return this;
        }

        public QueryBuilder userNoList(List<String> userNo){
            this.userNoList = userNo;
            return this;
        }

        public QueryBuilder fetchUserNo(){
            setFetchFields("fetchFields","userNo");
            return this;
        }

        public QueryBuilder excludeUserNo(){
            setFetchFields("excludeFields","userNo");
            return this;
        }



        public QueryBuilder fuzzyPosition (List<String> fuzzyPosition){
            this.fuzzyPosition = fuzzyPosition;
            return this;
        }

        public QueryBuilder fuzzyPosition (String ... fuzzyPosition){
            if (fuzzyPosition != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPosition){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPosition = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPosition (List<String> rightFuzzyPosition){
            this.rightFuzzyPosition = rightFuzzyPosition;
            return this;
        }

        public QueryBuilder rightFuzzyPosition (String ... rightFuzzyPosition){
            if (rightFuzzyPosition != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPosition){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPosition = list;
            }
            return this;
        }

        public QueryBuilder position(String position){
            setPosition(position);
            return this;
        }

        public QueryBuilder positionList(String ... position){
            if (position != null){
                List<String> list = new ArrayList<>();
                for (String item : position){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.positionList = list;
            }

            return this;
        }

        public QueryBuilder positionList(List<String> position){
            this.positionList = position;
            return this;
        }

        public QueryBuilder fetchPosition(){
            setFetchFields("fetchFields","position");
            return this;
        }

        public QueryBuilder excludePosition(){
            setFetchFields("excludeFields","position");
            return this;
        }



        public QueryBuilder fuzzyEntryTime (List<String> fuzzyEntryTime){
            this.fuzzyEntryTime = fuzzyEntryTime;
            return this;
        }

        public QueryBuilder fuzzyEntryTime (String ... fuzzyEntryTime){
            if (fuzzyEntryTime != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyEntryTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyEntryTime = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyEntryTime (List<String> rightFuzzyEntryTime){
            this.rightFuzzyEntryTime = rightFuzzyEntryTime;
            return this;
        }

        public QueryBuilder rightFuzzyEntryTime (String ... rightFuzzyEntryTime){
            if (rightFuzzyEntryTime != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyEntryTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyEntryTime = list;
            }
            return this;
        }

        public QueryBuilder entryTime(String entryTime){
            setEntryTime(entryTime);
            return this;
        }

        public QueryBuilder entryTimeList(String ... entryTime){
            if (entryTime != null){
                List<String> list = new ArrayList<>();
                for (String item : entryTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.entryTimeList = list;
            }

            return this;
        }

        public QueryBuilder entryTimeList(List<String> entryTime){
            this.entryTimeList = entryTime;
            return this;
        }

        public QueryBuilder fetchEntryTime(){
            setFetchFields("fetchFields","entryTime");
            return this;
        }

        public QueryBuilder excludeEntryTime(){
            setFetchFields("excludeFields","entryTime");
            return this;
        }



        public QueryBuilder fuzzyDimissionTime (List<String> fuzzyDimissionTime){
            this.fuzzyDimissionTime = fuzzyDimissionTime;
            return this;
        }

        public QueryBuilder fuzzyDimissionTime (String ... fuzzyDimissionTime){
            if (fuzzyDimissionTime != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyDimissionTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyDimissionTime = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyDimissionTime (List<String> rightFuzzyDimissionTime){
            this.rightFuzzyDimissionTime = rightFuzzyDimissionTime;
            return this;
        }

        public QueryBuilder rightFuzzyDimissionTime (String ... rightFuzzyDimissionTime){
            if (rightFuzzyDimissionTime != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyDimissionTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyDimissionTime = list;
            }
            return this;
        }

        public QueryBuilder dimissionTime(String dimissionTime){
            setDimissionTime(dimissionTime);
            return this;
        }

        public QueryBuilder dimissionTimeList(String ... dimissionTime){
            if (dimissionTime != null){
                List<String> list = new ArrayList<>();
                for (String item : dimissionTime){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.dimissionTimeList = list;
            }

            return this;
        }

        public QueryBuilder dimissionTimeList(List<String> dimissionTime){
            this.dimissionTimeList = dimissionTime;
            return this;
        }

        public QueryBuilder fetchDimissionTime(){
            setFetchFields("fetchFields","dimissionTime");
            return this;
        }

        public QueryBuilder excludeDimissionTime(){
            setFetchFields("excludeFields","dimissionTime");
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



        public QueryBuilder fuzzyPhone (List<String> fuzzyPhone){
            this.fuzzyPhone = fuzzyPhone;
            return this;
        }

        public QueryBuilder fuzzyPhone (String ... fuzzyPhone){
            if (fuzzyPhone != null){
                List<String> list = new ArrayList<>();
                for (String item : fuzzyPhone){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.fuzzyPhone = list;
            }
            return this;
        }

        public QueryBuilder rightFuzzyPhone (List<String> rightFuzzyPhone){
            this.rightFuzzyPhone = rightFuzzyPhone;
            return this;
        }

        public QueryBuilder rightFuzzyPhone (String ... rightFuzzyPhone){
            if (rightFuzzyPhone != null){
                List<String> list = new ArrayList<>();
                for (String item : rightFuzzyPhone){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.rightFuzzyPhone = list;
            }
            return this;
        }

        public QueryBuilder phone(String phone){
            setPhone(phone);
            return this;
        }

        public QueryBuilder phoneList(String ... phone){
            if (phone != null){
                List<String> list = new ArrayList<>();
                for (String item : phone){
                    if (item != null){
                        list.add(item);
                    }
                }
                this.phoneList = list;
            }

            return this;
        }

        public QueryBuilder phoneList(List<String> phone){
            this.phoneList = phone;
            return this;
        }

        public QueryBuilder fetchPhone(){
            setFetchFields("fetchFields","phone");
            return this;
        }

        public QueryBuilder excludePhone(){
            setFetchFields("excludeFields","phone");
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

        public User build(){
            return this;
        }
    }

}
