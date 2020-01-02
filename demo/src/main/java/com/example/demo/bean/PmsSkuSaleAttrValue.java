package com.example.demo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_sku_sale_attr_value", schema = "gmall", catalog = "")
public class PmsSkuSaleAttrValue {
    private long id;
    private Long skuId;
    private Long saleAttrId;
    private Long saleAttrValueId;
    private String saleAttrName;
    private String saleAttrValueName;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sku_id")
    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @Basic
    @Column(name = "sale_attr_id")
    public Long getSaleAttrId() {
        return saleAttrId;
    }

    public void setSaleAttrId(Long saleAttrId) {
        this.saleAttrId = saleAttrId;
    }

    @Basic
    @Column(name = "sale_attr_value_id")
    public Long getSaleAttrValueId() {
        return saleAttrValueId;
    }

    public void setSaleAttrValueId(Long saleAttrValueId) {
        this.saleAttrValueId = saleAttrValueId;
    }

    @Basic
    @Column(name = "sale_attr_name")
    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    @Basic
    @Column(name = "sale_attr_value_name")
    public String getSaleAttrValueName() {
        return saleAttrValueName;
    }

    public void setSaleAttrValueName(String saleAttrValueName) {
        this.saleAttrValueName = saleAttrValueName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsSkuSaleAttrValue that = (PmsSkuSaleAttrValue) o;
        return id == that.id &&
                Objects.equals(skuId, that.skuId) &&
                Objects.equals(saleAttrId, that.saleAttrId) &&
                Objects.equals(saleAttrValueId, that.saleAttrValueId) &&
                Objects.equals(saleAttrName, that.saleAttrName) &&
                Objects.equals(saleAttrValueName, that.saleAttrValueName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skuId, saleAttrId, saleAttrValueId, saleAttrName, saleAttrValueName);
    }
}
