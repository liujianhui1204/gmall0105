package com.example.demo.bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "pms_comment", schema = "gmall", catalog = "")
public class PmsComment {
    private long id;
    private Long productId;
    private String memberNickName;
    private String productName;
    private Integer star;
    private String memberIp;
    private Timestamp createTime;
    private Integer showStatus;
    private String productAttribute;
    private Integer collectCouont;
    private Integer readCount;
    private String content;
    private String pics;
    private String memberIcon;
    private Integer replayCount;

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
    @Column(name = "member_nick_name")
    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
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
    @Column(name = "star")
    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    @Basic
    @Column(name = "member_ip")
    public String getMemberIp() {
        return memberIp;
    }

    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
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
    @Column(name = "show_status")
    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    @Basic
    @Column(name = "product_attribute")
    public String getProductAttribute() {
        return productAttribute;
    }

    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
    }

    @Basic
    @Column(name = "collect_couont")
    public Integer getCollectCouont() {
        return collectCouont;
    }

    public void setCollectCouont(Integer collectCouont) {
        this.collectCouont = collectCouont;
    }

    @Basic
    @Column(name = "read_count")
    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "pics")
    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    @Basic
    @Column(name = "member_icon")
    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    @Basic
    @Column(name = "replay_count")
    public Integer getReplayCount() {
        return replayCount;
    }

    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsComment that = (PmsComment) o;
        return id == that.id &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(memberNickName, that.memberNickName) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(star, that.star) &&
                Objects.equals(memberIp, that.memberIp) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(showStatus, that.showStatus) &&
                Objects.equals(productAttribute, that.productAttribute) &&
                Objects.equals(collectCouont, that.collectCouont) &&
                Objects.equals(readCount, that.readCount) &&
                Objects.equals(content, that.content) &&
                Objects.equals(pics, that.pics) &&
                Objects.equals(memberIcon, that.memberIcon) &&
                Objects.equals(replayCount, that.replayCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, memberNickName, productName, star, memberIp, createTime, showStatus, productAttribute, collectCouont, readCount, content, pics, memberIcon, replayCount);
    }
}
