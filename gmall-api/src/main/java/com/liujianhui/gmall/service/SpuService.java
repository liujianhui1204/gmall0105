package com.liujianhui.gmall.service;

import com.liujianhui.gmall.bean.PmsProductInfo;

import java.util.List;

public interface SpuService {
    //商品spu列表
    List<PmsProductInfo> spuList(Long catalog3Id);
}
