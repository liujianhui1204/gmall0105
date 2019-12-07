package com.liujianhui.gmall.user.bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "wms_ware_order_task", schema = "gmall", catalog = "")
public class WmsWareOrderTask {
    private long id;
    private Long orderId;
    private String consignee;
    private String consigneeTel;
    private String deliveryAddress;
    private String orderComment;
    private String paymentWay;
    private String taskStatus;
    private String orderBody;
    private String trackingNo;
    private Timestamp createTime;
    private Long wareId;
    private String taskComment;

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
    @Column(name = "consignee")
    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    @Basic
    @Column(name = "consignee_tel")
    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel;
    }

    @Basic
    @Column(name = "delivery_address")
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Basic
    @Column(name = "order_comment")
    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    @Basic
    @Column(name = "payment_way")
    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    @Basic
    @Column(name = "task_status")
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Basic
    @Column(name = "order_body")
    public String getOrderBody() {
        return orderBody;
    }

    public void setOrderBody(String orderBody) {
        this.orderBody = orderBody;
    }

    @Basic
    @Column(name = "tracking_no")
    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
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
    @Column(name = "ware_id")
    public Long getWareId() {
        return wareId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    @Basic
    @Column(name = "task_comment")
    public String getTaskComment() {
        return taskComment;
    }

    public void setTaskComment(String taskComment) {
        this.taskComment = taskComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WmsWareOrderTask that = (WmsWareOrderTask) o;
        return id == that.id &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(consignee, that.consignee) &&
                Objects.equals(consigneeTel, that.consigneeTel) &&
                Objects.equals(deliveryAddress, that.deliveryAddress) &&
                Objects.equals(orderComment, that.orderComment) &&
                Objects.equals(paymentWay, that.paymentWay) &&
                Objects.equals(taskStatus, that.taskStatus) &&
                Objects.equals(orderBody, that.orderBody) &&
                Objects.equals(trackingNo, that.trackingNo) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(wareId, that.wareId) &&
                Objects.equals(taskComment, that.taskComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, consignee, consigneeTel, deliveryAddress, orderComment, paymentWay, taskStatus, orderBody, trackingNo, createTime, wareId, taskComment);
    }
}
