package com.liujianhui.gmall.service;

import com.liujianhui.gmall.bean.PmsBaseAttrInfo;
import com.liujianhui.gmall.bean.PmsBaseAttrValue;
import com.liujianhui.gmall.bean.PmsBaseSaleAttr;

import java.util.List;

public interface AttrService {
    //平台属性查询
    List<PmsBaseAttrInfo> attrInfoList(Long catalog3Id);
    //保存属性
    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);
    //查询属性值
    List<PmsBaseAttrValue> getAttrValueList(Long attrId);
    //查询销售属性
    List<PmsBaseSaleAttr> baseSaleAttrList();
}
