package com.example.demo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_base_attr_info", schema = "gmall", catalog = "")
public class PmsBaseAttrInfo {
    private long id;
    private String attrName;
    private Long catalog3Id;
    private String isEnabled;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attr_name")
    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Basic
    @Column(name = "catalog3_id")
    public Long getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(Long catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    @Basic
    @Column(name = "is_enabled")
    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsBaseAttrInfo that = (PmsBaseAttrInfo) o;
        return id == that.id &&
                Objects.equals(attrName, that.attrName) &&
                Objects.equals(catalog3Id, that.catalog3Id) &&
                Objects.equals(isEnabled, that.isEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attrName, catalog3Id, isEnabled);
    }
}
