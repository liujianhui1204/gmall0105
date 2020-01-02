package com.example.demo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_product_image", schema = "gmall", catalog = "")
public class PmsProductImage {
    private long id;
    private Long productId;
    private String imgName;
    private String imgUrl;

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
    @Column(name = "img_name")
    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    @Basic
    @Column(name = "img_url")
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsProductImage that = (PmsProductImage) o;
        return id == that.id &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(imgName, that.imgName) &&
                Objects.equals(imgUrl, that.imgUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, imgName, imgUrl);
    }
}
