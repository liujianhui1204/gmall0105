package com.example.demo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_sku_info", schema = "gmall", catalog = "")
public class PmsSkuInfo {
    private long id;
    private Long productId;
    private Double price;
    private String skuName;
    private String skuDesc;
    private Double weight;
    private Long tmId;
    private Long catalog3Id;
    private String skuDefaultImg;

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
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "sku_name")
    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    @Basic
    @Column(name = "sku_desc")
    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    @Basic
    @Column(name = "weight")
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "tm_id")
    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
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
    @Column(name = "sku_default_img")
    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsSkuInfo that = (PmsSkuInfo) o;
        return id == that.id &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(price, that.price) &&
                Objects.equals(skuName, that.skuName) &&
                Objects.equals(skuDesc, that.skuDesc) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(tmId, that.tmId) &&
                Objects.equals(catalog3Id, that.catalog3Id) &&
                Objects.equals(skuDefaultImg, that.skuDefaultImg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, price, skuName, skuDesc, weight, tmId, catalog3Id, skuDefaultImg);
    }
}
