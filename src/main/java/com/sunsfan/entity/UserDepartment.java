package com.sunsfan.entity;

import java.util.List;

public class UserDepartment {
    private Long id;

    private String departmenttype;

    private String departmentname;

    private String groupname;

    private Boolean isdelete = Boolean.FALSE;

    private List<User> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmenttype() {
        return departmenttype;
    }

    public void setDepartmenttype(String departmenttype) {
        this.departmenttype = departmenttype == null ? null : departmenttype.trim();
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users=users;
    }

    @Override
    public String toString() {
        return "UserDepartment{" +
                "id=" + id +
                ", departmenttype='" + departmenttype + '\'' +
                ", departmentname='" + departmentname + '\'' +
                ", groupname='" + groupname + '\'' +
                '}';
    }
}