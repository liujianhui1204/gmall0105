package com.liujianhui.gmall.user.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_base_attr_value", schema = "gmall", catalog = "")
public class PmsBaseAttrValue {
    private long id;
    private String valueName;
    private Long attrId;
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
    @Column(name = "value_name")
    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    @Basic
    @Column(name = "attr_id")
    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
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
        PmsBaseAttrValue that = (PmsBaseAttrValue) o;
        return id == that.id &&
                Objects.equals(valueName, that.valueName) &&
                Objects.equals(attrId, that.attrId) &&
                Objects.equals(isEnabled, that.isEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valueName, attrId, isEnabled);
    }
}
