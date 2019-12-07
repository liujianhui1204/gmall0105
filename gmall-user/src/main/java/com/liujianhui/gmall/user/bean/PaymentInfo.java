package com.liujianhui.gmall.user.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "payment_info", schema = "gmall", catalog = "")
public class PaymentInfo {
    private long id;
    private String orderSn;
    private String orderId;
    private String alipayTradeNo;
    private BigDecimal totalAmount;
    private String subject;
    private String paymentStatus;
    private Timestamp createTime;
    private Timestamp confirmTime;
    private String callbackContent;
    private Timestamp callbackTime;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "order_id")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "alipay_trade_no")
    public String getAlipayTradeNo() {
        return alipayTradeNo;
    }

    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
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
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "payment_status")
    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
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
    @Column(name = "confirm_time")
    public Timestamp getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Timestamp confirmTime) {
        this.confirmTime = confirmTime;
    }

    @Basic
    @Column(name = "callback_content")
    public String getCallbackContent() {
        return callbackContent;
    }

    public void setCallbackContent(String callbackContent) {
        this.callbackContent = callbackContent;
    }

    @Basic
    @Column(name = "callback_time")
    public Timestamp getCallbackTime() {
        return callbackTime;
    }

    public void setCallbackTime(Timestamp callbackTime) {
        this.callbackTime = callbackTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentInfo that = (PaymentInfo) o;
        return id == that.id &&
                Objects.equals(orderSn, that.orderSn) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(alipayTradeNo, that.alipayTradeNo) &&
                Objects.equals(totalAmount, that.totalAmount) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(paymentStatus, that.paymentStatus) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(confirmTime, that.confirmTime) &&
                Objects.equals(callbackContent, that.callbackContent) &&
                Objects.equals(callbackTime, that.callbackTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderSn, orderId, alipayTradeNo, totalAmount, subject, paymentStatus, createTime, confirmTime, callbackContent, callbackTime);
    }
}
