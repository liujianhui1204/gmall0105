package com.liujianhui.gmall.manage.controller;
/*
* 一级类目
* */
import com.alibaba.dubbo.config.annotation.Reference;
import com.liujianhui.gmall.bean.PmsBaseCatalog1;
import com.liujianhui.gmall.bean.PmsBaseCatalog2;
import com.liujianhui.gmall.bean.PmsBaseCatalog3;
import com.liujianhui.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@EnableAsync开启异步注解
@CrossOrigin//跨域注解
public class CatalogController {
    //创建分类服务的对象
    @Reference
    private CatalogService catalogService;
    //查询三级类目
    @RequestMapping("/getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(Integer catalog2Id){
        List<PmsBaseCatalog3> pmsBaseCatalog3s = this.catalogService.getCatalog3(catalog2Id);
        return pmsBaseCatalog3s;
    }
    //查询二级类目
    @RequestMapping("/getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id){
        List<PmsBaseCatalog2> pmsBaseCatalog2s = this.catalogService.getCatalog2(catalog1Id);
        return pmsBaseCatalog2s;
    }
    //查询一级类目
    @RequestMapping("/getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> catalog1 = this.catalogService.getCatalog1();
        return catalog1;
    }
}
