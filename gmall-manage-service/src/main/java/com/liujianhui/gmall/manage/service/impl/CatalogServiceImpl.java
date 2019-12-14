package com.liujianhui.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.liujianhui.gmall.bean.PmsBaseCatalog1;
import com.liujianhui.gmall.bean.PmsBaseCatalog2;
import com.liujianhui.gmall.bean.PmsBaseCatalog3;
import com.liujianhui.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.liujianhui.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.liujianhui.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import com.liujianhui.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class CatalogServiceImpl implements CatalogService {
    //一级类目
    @Autowired
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    //二级类目
    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    //三级类目
    @Autowired
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;
    //查询三级类目
    @Override
    public List<PmsBaseCatalog3> getCatalog3(Integer catalog2Id) {
        Example e = new Example(PmsBaseCatalog3.class);
        e.createCriteria().andEqualTo("catalog2Id",catalog2Id);
        List<PmsBaseCatalog3> pmsBaseCatalog3 = this.pmsBaseCatalog3Mapper.selectByExample(e);
        return pmsBaseCatalog3;
    }

    //查询二级类目
    @Override
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id) {
        /*
        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);
        List<PmsBaseCatalog2> pmsBaseCatalog2s = this.pmsBaseCatalog2Mapper.select(pmsBaseCatalog2);
        */
        //使用反射创建通用mapper的Example实例
        Example e = new Example(PmsBaseCatalog2.class);
        e.createCriteria().andEqualTo("catalog1Id",catalog1Id);
        List<PmsBaseCatalog2> pmsBaseCatalog2s = this.pmsBaseCatalog2Mapper.selectByExample(e);
        return pmsBaseCatalog2s;
    }
    //查询一级类目
    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> pmsBaseCatalog1s = this.pmsBaseCatalog1Mapper.selectAll();
        return pmsBaseCatalog1s;
    }
}
