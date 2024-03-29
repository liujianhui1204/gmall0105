package com.liujianhui.gmall.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "pms_base_catalog2", schema = "gmall")
public class PmsBaseCatalog2 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer catalog1Id;

    @Transient
    private List<PmsBaseCatalog3> catalog3s;

    public List<PmsBaseCatalog3> getCatalog3s() {
        return catalog3s;
    }

    public void setCatalog3s(List<PmsBaseCatalog3> catalog3s) {
        this.catalog3s = catalog3s;
    }

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
    @Column(name = "catalog1_id")
    public Integer getCatalog1Id() {
        return catalog1Id;
    }

    public void setCatalog1Id(Integer catalog1Id) {
        this.catalog1Id = catalog1Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsBaseCatalog2 that = (PmsBaseCatalog2) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(catalog1Id, that.catalog1Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, catalog1Id);
    }
}
