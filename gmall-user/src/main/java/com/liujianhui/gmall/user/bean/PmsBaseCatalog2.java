package com.liujianhui.gmall.user.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_base_catalog2", schema = "gmall", catalog = "")
public class PmsBaseCatalog2 {
    private int id;
    private String name;
    private Integer catalog1Id;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
