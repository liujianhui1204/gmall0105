package com.liujianhui.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liujianhui.gmall.bean.PmsProductInfo;
import com.liujianhui.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class SpuContoller {
    @Reference
    SpuService spuService;
    //商品spu列表
    @RequestMapping("/spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(Long catalog3Id){
        List<PmsProductInfo> pmsProductInfos = this.spuService.spuList(catalog3Id);
        return pmsProductInfos;
    }
}
