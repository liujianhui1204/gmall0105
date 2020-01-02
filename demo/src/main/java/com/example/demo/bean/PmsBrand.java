package com.example.demo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_brand", schema = "gmall", catalog = "")
public class PmsBrand {
    private long id;
    private String name;
    private String firstLetter;
    private Integer sort;
    private Integer factoryStatus;
    private Integer showStatus;
    private Integer productCount;
    private Integer productCommentCount;
    private String logo;
    private String bigPic;
    private String brandStory;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "first_letter")
    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    @Basic
    @Column(name = "sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "factory_status")
    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    @Basic
    @Column(name = "show_status")
    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    @Basic
    @Column(name = "product_count")
    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    @Basic
    @Column(name = "product_comment_count")
    public Integer getProductCommentCount() {
        return productCommentCount;
    }

    public void setProductCommentCount(Integer productCommentCount) {
        this.productCommentCount = productCommentCount;
    }

    @Basic
    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "big_pic")
    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    @Basic
    @Column(name = "brand_story")
    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsBrand pmsBrand = (PmsBrand) o;
        return id == pmsBrand.id &&
                Objects.equals(name, pmsBrand.name) &&
                Objects.equals(firstLetter, pmsBrand.firstLetter) &&
                Objects.equals(sort, pmsBrand.sort) &&
                Objects.equals(factoryStatus, pmsBrand.factoryStatus) &&
                Objects.equals(showStatus, pmsBrand.showStatus) &&
                Objects.equals(productCount, pmsBrand.productCount) &&
                Objects.equals(productCommentCount, pmsBrand.productCommentCount) &&
                Objects.equals(logo, pmsBrand.logo) &&
                Objects.equals(bigPic, pmsBrand.bigPic) &&
                Objects.equals(brandStory, pmsBrand.brandStory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, firstLetter, sort, factoryStatus, showStatus, productCount, productCommentCount, logo, bigPic, brandStory);
    }
}
