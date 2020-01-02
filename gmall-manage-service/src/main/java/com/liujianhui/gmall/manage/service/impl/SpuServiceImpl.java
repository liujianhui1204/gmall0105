package com.liujianhui.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.liujianhui.gmall.bean.PmsProductInfo;
import com.liujianhui.gmall.manage.mapper.PmsProductInfoMapper;
import com.liujianhui.gmall.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class SpuServiceImpl implements SpuService {
    @Autowired
    private PmsProductInfoMapper pmsProductInfoMapper;

    //商品spu列表
    @Override
    public List<PmsProductInfo> spuList(Long catalog3Id) {
        PmsProductInfo pmsProductInfo = new PmsProductInfo();
        pmsProductInfo.setCatalog3Id(catalog3Id);
        List<PmsProductInfo> pmsProductInfos = this.pmsProductInfoMapper.select(pmsProductInfo);
        return pmsProductInfos;
    }
}
