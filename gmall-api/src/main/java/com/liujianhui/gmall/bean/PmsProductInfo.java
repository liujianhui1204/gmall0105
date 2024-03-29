package com.liujianhui.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "pms_product_info", schema = "gmall")
public class PmsProductInfo implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private String description;
    private Long catalog3Id;
    private Long tmId;
    @Transient
    private List<PmsProductSaleAttr> pmsProductSaleAttrs;
    @Transient
    private List<PmsProductImage> pmsProductImages;

    public List<PmsProductSaleAttr> getPmsProductSaleAttrs() {
        return pmsProductSaleAttrs;
    }

    public void setPmsProductSaleAttrs(List<PmsProductSaleAttr> pmsProductSaleAttrs) {
        this.pmsProductSaleAttrs = pmsProductSaleAttrs;
    }

    public List<PmsProductImage> getPmsProductImages() {
        return pmsProductImages;
    }

    public void setPmsProductImages(List<PmsProductImage> pmsProductImages) {
        this.pmsProductImages = pmsProductImages;
    }

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "tm_id")
    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsProductInfo that = (PmsProductInfo) o;
        return id == that.id &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(catalog3Id, that.catalog3Id) &&
                Objects.equals(tmId, that.tmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, description, catalog3Id, tmId);
    }
}
