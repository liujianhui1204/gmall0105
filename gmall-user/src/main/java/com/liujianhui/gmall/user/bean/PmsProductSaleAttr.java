package com.liujianhui.gmall.user.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_product_sale_attr", schema = "gmall", catalog = "")
public class PmsProductSaleAttr {
    private long id;
    private Long productId;
    private Long saleAttrId;
    private String saleAttrName;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_id")
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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
    @Column(name = "sale_attr_name")
    public String getSaleAttrName() {
        return saleAttrName;
    }

    public void setSaleAttrName(String saleAttrName) {
        this.saleAttrName = saleAttrName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsProductSaleAttr that = (PmsProductSaleAttr) o;
        return id == that.id &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(saleAttrId, that.saleAttrId) &&
                Objects.equals(saleAttrName, that.saleAttrName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, saleAttrId, saleAttrName);
    }
}
