package com.sunsfan.entity;

public class UserRelation {
    private Long id;

    private Long userid;

    private Long departmentid;

    private Boolean isdelete = Boolean.FALSE;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "UserRelation{" +
                "id=" + id +
                ", userid=" + userid +
                ", departmentid=" + departmentid +
                '}';
    }
}