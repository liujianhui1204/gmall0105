package com.liujianhui.gmall.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wms_ware_order_task_detail", schema = "gmall")
public class WmsWareOrderTaskDetail {
    private long id;
    private Long skuId;
    private String skuName;
    private Integer skuNums;
    private Long taskId;
    private Integer skuNum;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sku_id")
    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
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
    @Column(name = "sku_nums")
    public Integer getSkuNums() {
        return skuNums;
    }

    public void setSkuNums(Integer skuNums) {
        this.skuNums = skuNums;
    }

    @Basic
    @Column(name = "task_id")
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "sku_num")
    public Integer getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WmsWareOrderTaskDetail that = (WmsWareOrderTaskDetail) o;
        return id == that.id &&
                Objects.equals(skuId, that.skuId) &&
                Objects.equals(skuName, that.skuName) &&
                Objects.equals(skuNums, that.skuNums) &&
                Objects.equals(taskId, that.taskId) &&
                Objects.equals(skuNum, that.skuNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skuId, skuName, skuNums, taskId, skuNum);
    }
}
