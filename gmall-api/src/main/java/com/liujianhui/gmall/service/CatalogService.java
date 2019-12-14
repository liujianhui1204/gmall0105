package com.liujianhui.gmall.service;

import com.liujianhui.gmall.bean.PmsBaseCatalog1;
import com.liujianhui.gmall.bean.PmsBaseCatalog2;
import com.liujianhui.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {
    //查询三级类目
    List<PmsBaseCatalog3> getCatalog3(Integer catalog2Id);
    //查询二级类目
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id);
    //查询一级类目
    public List<PmsBaseCatalog1> getCatalog1();


}
