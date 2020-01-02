package com.example.demo.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wms_ware_sku", schema = "gmall", catalog = "")
public class WmsWareSku {
    private long id;
    private Long skuId;
    private Long warehouseId;
    private Integer stock;
    private String stockName;
    private Integer stockLocked;

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
    @Column(name = "warehouse_id")
    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    @Basic
    @Column(name = "stock")
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "stock_name")
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Basic
    @Column(name = "stock_locked")
    public Integer getStockLocked() {
        return stockLocked;
    }

    public void setStockLocked(Integer stockLocked) {
        this.stockLocked = stockLocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WmsWareSku that = (WmsWareSku) o;
        return id == that.id &&
                Objects.equals(skuId, that.skuId) &&
                Objects.equals(warehouseId, that.warehouseId) &&
                Objects.equals(stock, that.stock) &&
                Objects.equals(stockName, that.stockName) &&
                Objects.equals(stockLocked, that.stockLocked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skuId, warehouseId, stock, stockName, stockLocked);
    }
}
