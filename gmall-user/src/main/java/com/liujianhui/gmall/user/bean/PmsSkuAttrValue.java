package com.liujianhui.gmall.user.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_sku_attr_value", schema = "gmall", catalog = "")
public class PmsSkuAttrValue {
    private long id;
    private Long attrId;
    private Long valueId;
    private Long skuId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "value_id")
    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    @Basic
    @Column(name = "sku_id")
    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsSkuAttrValue that = (PmsSkuAttrValue) o;
        return id == that.id &&
                Objects.equals(attrId, that.attrId) &&
                Objects.equals(valueId, that.valueId) &&
                Objects.equals(skuId, that.skuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attrId, valueId, skuId);
    }
}
