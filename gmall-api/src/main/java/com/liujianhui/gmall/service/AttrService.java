package com.liujianhui.gmall.service;

import com.liujianhui.gmall.bean.PmsBaseAttrInfo;

import java.util.List;

public interface AttrService {
    //平台属性查询
    List<PmsBaseAttrInfo> attrInfoList(Long catalog3Id);
    //保存属性
    int saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);
}
