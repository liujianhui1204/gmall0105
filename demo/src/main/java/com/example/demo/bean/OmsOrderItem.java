package com.example.demo.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "oms_order_item", schema = "gmall", catalog = "")
public class OmsOrderItem {
    private long id;
    private Long orderId;
    private String orderSn;
    private Long productId;
    private String productPic;
    private String productName;
    private String productBrand;
    private String productSn;
    private BigDecimal productPrice;
    private Integer productQuantity;
    private Long productSkuId;
    private String productSkuCode;
    private Long productCategoryId;
    private String sp1;
    private String sp2;
    private String sp3;
    private String promotionName;
    private BigDecimal promotionAmount;
    private BigDecimal couponAmount;
    private BigDecimal integrationAmount;
    private BigDecimal realAmount;
    private Integer giftIntegration;
    private Integer giftGrowth;
    private String productAttr;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_id")
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_sn")
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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
    @Column(name = "product_pic")
    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
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
    @Column(name = "product_brand")
    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    @Basic
    @Column(name = "product_sn")
    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    @Basic
    @Column(name = "product_price")
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    @Basic
    @Column(name = "product_quantity")
    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Basic
    @Column(name = "product_sku_id")
    public Long getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    @Basic
    @Column(name = "product_sku_code")
    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    @Basic
    @Column(name = "product_category_id")
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Basic
    @Column(name = "sp1")
    public String getSp1() {
        return sp1;
    }

    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    @Basic
    @Column(name = "sp2")
    public String getSp2() {
        return sp2;
    }

    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    @Basic
    @Column(name = "sp3")
    public String getSp3() {
        return sp3;
    }

    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    @Basic
    @Column(name = "promotion_name")
    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    @Basic
    @Column(name = "promotion_amount")
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    @Basic
    @Column(name = "coupon_amount")
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    @Basic
    @Column(name = "integration_amount")
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    @Basic
    @Column(name = "real_amount")
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    @Basic
    @Column(name = "gift_integration")
    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    @Basic
    @Column(name = "gift_growth")
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    @Basic
    @Column(name = "product_attr")
    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrderItem that = (OmsOrderItem) o;
        return id == that.id &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(orderSn, that.orderSn) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(productPic, that.productPic) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(productBrand, that.productBrand) &&
                Objects.equals(productSn, that.productSn) &&
                Objects.equals(productPrice, that.productPrice) &&
                Objects.equals(productQuantity, that.productQuantity) &&
                Objects.equals(productSkuId, that.productSkuId) &&
                Objects.equals(productSkuCode, that.productSkuCode) &&
                Objects.equals(productCategoryId, that.productCategoryId) &&
                Objects.equals(sp1, that.sp1) &&
                Objects.equals(sp2, that.sp2) &&
                Objects.equals(sp3, that.sp3) &&
                Objects.equals(promotionName, that.promotionName) &&
                Objects.equals(promotionAmount, that.promotionAmount) &&
                Objects.equals(couponAmount, that.couponAmount) &&
                Objects.equals(integrationAmount, that.integrationAmount) &&
                Objects.equals(realAmount, that.realAmount) &&
                Objects.equals(giftIntegration, that.giftIntegration) &&
                Objects.equals(giftGrowth, that.giftGrowth) &&
                Objects.equals(productAttr, that.productAttr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, orderSn, productId, productPic, productName, productBrand, productSn, productPrice, productQuantity, productSkuId, productSkuCode, productCategoryId, sp1, sp2, sp3, promotionName, promotionAmount, couponAmount, integrationAmount, realAmount, giftIntegration, giftGrowth, productAttr);
    }
}
