package com.liujianhui.gmall.user.bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pms_product_vertify_record", schema = "gmall", catalog = "")
public class PmsProductVertifyRecord {
    private long id;
    private Long productId;
    private Timestamp createTime;
    private String vertifyMan;
    private Integer status;
    private String detail;

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
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "vertify_man")
    public String getVertifyMan() {
        return vertifyMan;
    }

    public void setVertifyMan(String vertifyMan) {
        this.vertifyMan = vertifyMan;
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
    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsProductVertifyRecord that = (PmsProductVertifyRecord) o;
        return id == that.id &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(vertifyMan, that.vertifyMan) &&
                Objects.equals(status, that.status) &&
                Objects.equals(detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, createTime, vertifyMan, status, detail);
    }
}
