package com.example.demo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pms_base_catalog3", schema = "gmall", catalog = "")
public class PmsBaseCatalog3 {
    private long id;
    private String name;
    private Long catalog2Id;

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
    @Column(name = "catalog2_id")
    public Long getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(Long catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsBaseCatalog3 that = (PmsBaseCatalog3) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(catalog2Id, that.catalog2Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, catalog2Id);
    }
}
