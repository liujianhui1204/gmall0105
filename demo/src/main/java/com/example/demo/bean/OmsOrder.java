package com.example.demo.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "oms_order", schema = "gmall", catalog = "")
public class OmsOrder {
    private long id;
    private long memberId;
    private Long couponId;
    private String orderSn;
    private Timestamp createTime;
    private String memberUsername;
    private BigDecimal totalAmount;
    private BigDecimal payAmount;
    private BigDecimal freightAmount;
    private BigDecimal promotionAmount;
    private BigDecimal integrationAmount;
    private BigDecimal couponAmount;
    private BigDecimal discountAmount;
    private Integer payType;
    private Integer sourceType;
    private Integer status;
    private Integer orderType;
    private String deliveryCompany;
    private String deliverySn;
    private Integer autoConfirmDay;
    private Integer integration;
    private Integer growth;
    private String promotionInfo;
    private Integer billType;
    private String billHeader;
    private String billContent;
    private String billReceiverPhone;
    private String billReceiverEmail;
    private String receiverName;
    private String receiverPhone;
    private String receiverPostCode;
    private String receiverProvince;
    private String receiverCity;
    private String receiverRegion;
    private String receiverDetailAddress;
    private String note;
    private Integer confirmStatus;
    private int deleteStatus;
    private Integer useIntegration;
    private Timestamp paymentTime;
    private Timestamp deliveryTime;
    private Timestamp receiveTime;
    private Timestamp commentTime;
    private Timestamp modifyTime;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "member_id")
    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "coupon_id")
    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
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
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "member_username")
    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    @Basic
    @Column(name = "total_amount")
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Basic
    @Column(name = "pay_amount")
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    @Basic
    @Column(name = "freight_amount")
    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
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
    @Column(name = "integration_amount")
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
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
    @Column(name = "discount_amount")
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Basic
    @Column(name = "pay_type")
    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "source_type")
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "order_type")
    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    @Basic
    @Column(name = "delivery_company")
    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    @Basic
    @Column(name = "delivery_sn")
    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }

    @Basic
    @Column(name = "auto_confirm_day")
    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    @Basic
    @Column(name = "integration")
    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    @Basic
    @Column(name = "growth")
    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    @Basic
    @Column(name = "promotion_info")
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    @Basic
    @Column(name = "bill_type")
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    @Basic
    @Column(name = "bill_header")
    public String getBillHeader() {
        return billHeader;
    }

    public void setBillHeader(String billHeader) {
        this.billHeader = billHeader;
    }

    @Basic
    @Column(name = "bill_content")
    public String getBillContent() {
        return billContent;
    }

    public void setBillContent(String billContent) {
        this.billContent = billContent;
    }

    @Basic
    @Column(name = "bill_receiver_phone")
    public String getBillReceiverPhone() {
        return billReceiverPhone;
    }

    public void setBillReceiverPhone(String billReceiverPhone) {
        this.billReceiverPhone = billReceiverPhone;
    }

    @Basic
    @Column(name = "bill_receiver_email")
    public String getBillReceiverEmail() {
        return billReceiverEmail;
    }

    public void setBillReceiverEmail(String billReceiverEmail) {
        this.billReceiverEmail = billReceiverEmail;
    }

    @Basic
    @Column(name = "receiver_name")
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Basic
    @Column(name = "receiver_phone")
    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    @Basic
    @Column(name = "receiver_post_code")
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    @Basic
    @Column(name = "receiver_province")
    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    @Basic
    @Column(name = "receiver_city")
    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    @Basic
    @Column(name = "receiver_region")
    public String getReceiverRegion() {
        return receiverRegion;
    }

    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    @Basic
    @Column(name = "receiver_detail_address")
    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "confirm_status")
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    @Basic
    @Column(name = "delete_status")
    public int getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(int deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Basic
    @Column(name = "use_integration")
    public Integer getUseIntegration() {
        return useIntegration;
    }

    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    @Basic
    @Column(name = "payment_time")
    public Timestamp getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Basic
    @Column(name = "delivery_time")
    public Timestamp getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Timestamp deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Basic
    @Column(name = "receive_time")
    public Timestamp getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Timestamp receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Basic
    @Column(name = "comment_time")
    public Timestamp getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Timestamp commentTime) {
        this.commentTime = commentTime;
    }

    @Basic
    @Column(name = "modify_time")
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrder omsOrder = (OmsOrder) o;
        return id == omsOrder.id &&
                memberId == omsOrder.memberId &&
                deleteStatus == omsOrder.deleteStatus &&
                Objects.equals(couponId, omsOrder.couponId) &&
                Objects.equals(orderSn, omsOrder.orderSn) &&
                Objects.equals(createTime, omsOrder.createTime) &&
                Objects.equals(memberUsername, omsOrder.memberUsername) &&
                Objects.equals(totalAmount, omsOrder.totalAmount) &&
                Objects.equals(payAmount, omsOrder.payAmount) &&
                Objects.equals(freightAmount, omsOrder.freightAmount) &&
                Objects.equals(promotionAmount, omsOrder.promotionAmount) &&
                Objects.equals(integrationAmount, omsOrder.integrationAmount) &&
                Objects.equals(couponAmount, omsOrder.couponAmount) &&
                Objects.equals(discountAmount, omsOrder.discountAmount) &&
                Objects.equals(payType, omsOrder.payType) &&
                Objects.equals(sourceType, omsOrder.sourceType) &&
                Objects.equals(status, omsOrder.status) &&
                Objects.equals(orderType, omsOrder.orderType) &&
                Objects.equals(deliveryCompany, omsOrder.deliveryCompany) &&
                Objects.equals(deliverySn, omsOrder.deliverySn) &&
                Objects.equals(autoConfirmDay, omsOrder.autoConfirmDay) &&
                Objects.equals(integration, omsOrder.integration) &&
                Objects.equals(growth, omsOrder.growth) &&
                Objects.equals(promotionInfo, omsOrder.promotionInfo) &&
                Objects.equals(billType, omsOrder.billType) &&
                Objects.equals(billHeader, omsOrder.billHeader) &&
                Objects.equals(billContent, omsOrder.billContent) &&
                Objects.equals(billReceiverPhone, omsOrder.billReceiverPhone) &&
                Objects.equals(billReceiverEmail, omsOrder.billReceiverEmail) &&
                Objects.equals(receiverName, omsOrder.receiverName) &&
                Objects.equals(receiverPhone, omsOrder.receiverPhone) &&
                Objects.equals(receiverPostCode, omsOrder.receiverPostCode) &&
                Objects.equals(receiverProvince, omsOrder.receiverProvince) &&
                Objects.equals(receiverCity, omsOrder.receiverCity) &&
                Objects.equals(receiverRegion, omsOrder.receiverRegion) &&
                Objects.equals(receiverDetailAddress, omsOrder.receiverDetailAddress) &&
                Objects.equals(note, omsOrder.note) &&
                Objects.equals(confirmStatus, omsOrder.confirmStatus) &&
                Objects.equals(useIntegration, omsOrder.useIntegration) &&
                Objects.equals(paymentTime, omsOrder.paymentTime) &&
                Objects.equals(deliveryTime, omsOrder.deliveryTime) &&
                Objects.equals(receiveTime, omsOrder.receiveTime) &&
                Objects.equals(commentTime, omsOrder.commentTime) &&
                Objects.equals(modifyTime, omsOrder.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, couponId, orderSn, createTime, memberUsername, totalAmount, payAmount, freightAmount, promotionAmount, integrationAmount, couponAmount, discountAmount, payType, sourceType, status, orderType, deliveryCompany, deliverySn, autoConfirmDay, integration, growth, promotionInfo, billType, billHeader, billContent, billReceiverPhone, billReceiverEmail, receiverName, receiverPhone, receiverPostCode, receiverProvince, receiverCity, receiverRegion, receiverDetailAddress, note, confirmStatus, deleteStatus, useIntegration, paymentTime, deliveryTime, receiveTime, commentTime, modifyTime);
    }
}
