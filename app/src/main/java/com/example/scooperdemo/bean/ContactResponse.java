package com.example.scooperdemo.bean;

import java.util.List;

public class ContactResponse {

    private List<ContentBean> content;
    private Boolean last;
    private Integer totalElements;
    private Integer totalPages;
    private Integer numberOfElements;
    private List<SortBean> sort;
    private Boolean first;
    private Integer size;
    private Integer number;

    public List<ContentBean> getContent() {
        return content;
    }

    public void setContent(List<ContentBean> content) {
        this.content = content;
    }

    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public List<SortBean> getSort() {
        return sort;
    }

    public void setSort(List<SortBean> sort) {
        this.sort = sort;
    }

    public Boolean getFirst() {
        return first;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public static class ContentBean {
        private Long dateCreated;
        private Long dateModified;
        private Boolean deleted;
        private Integer id;
        private List<?> children;
        private Boolean leaf;
        private Object text;
        private Object name;
        private String userName;
        private Object sex;
        private String post;
        private String dispatchPhone;
        private String phone;
        private Object email;
        private Object address;
        private Object remark;
        private Integer parentId;
        private Object childId;
        private String departmentName;
        private Integer pid;

        public Long getDateCreated() {
            return dateCreated;
        }

        public void setDateCreated(Long dateCreated) {
            this.dateCreated = dateCreated;
        }

        public Long getDateModified() {
            return dateModified;
        }

        public void setDateModified(Long dateModified) {
            this.dateModified = dateModified;
        }

        public Boolean getDeleted() {
            return deleted;
        }

        public void setDeleted(Boolean deleted) {
            this.deleted = deleted;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public List<?> getChildren() {
            return children;
        }

        public void setChildren(List<?> children) {
            this.children = children;
        }

        public Boolean getLeaf() {
            return leaf;
        }

        public void setLeaf(Boolean leaf) {
            this.leaf = leaf;
        }

        public Object getText() {
            return text;
        }

        public void setText(Object text) {
            this.text = text;
        }

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Object getSex() {
            return sex;
        }

        public void setSex(Object sex) {
            this.sex = sex;
        }

        public String getPost() {
            return post;
        }

        public void setPost(String post) {
            this.post = post;
        }

        public String getDispatchPhone() {
            return dispatchPhone;
        }

        public void setDispatchPhone(String dispatchPhone) {
            this.dispatchPhone = dispatchPhone;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Object getEmail() {
            return email;
        }

        public void setEmail(Object email) {
            this.email = email;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getRemark() {
            return remark;
        }

        public void setRemark(Object remark) {
            this.remark = remark;
        }

        public Integer getParentId() {
            return parentId;
        }

        public void setParentId(Integer parentId) {
            this.parentId = parentId;
        }

        public Object getChildId() {
            return childId;
        }

        public void setChildId(Object childId) {
            this.childId = childId;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public Integer getPid() {
            return pid;
        }

        public void setPid(Integer pid) {
            this.pid = pid;
        }
    }

    public static class SortBean {
        private String direction;
        private String property;
        private Boolean ignoreCase;
        private String nullHandling;
        private Boolean descending;
        private Boolean ascending;

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public Boolean getIgnoreCase() {
            return ignoreCase;
        }

        public void setIgnoreCase(Boolean ignoreCase) {
            this.ignoreCase = ignoreCase;
        }

        public String getNullHandling() {
            return nullHandling;
        }

        public void setNullHandling(String nullHandling) {
            this.nullHandling = nullHandling;
        }

        public Boolean getDescending() {
            return descending;
        }

        public void setDescending(Boolean descending) {
            this.descending = descending;
        }

        public Boolean getAscending() {
            return ascending;
        }

        public void setAscending(Boolean ascending) {
            this.ascending = ascending;
        }
    }
}
