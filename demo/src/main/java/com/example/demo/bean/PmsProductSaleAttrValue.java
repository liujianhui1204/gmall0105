package com.example.demo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_product_sale_attr_value", schema = "gmall", catalog = "")
public class PmsProductSaleAttrValue {
    private long id;
    private Long productId;
    private Long saleAttrId;
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
        PmsProductSaleAttrValue that = (PmsProductSaleAttrValue) o;
        return id == that.id &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(saleAttrId, that.saleAttrId) &&
                Objects.equals(saleAttrValueName, that.saleAttrValueName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, saleAttrId, saleAttrValueName);
    }
}
