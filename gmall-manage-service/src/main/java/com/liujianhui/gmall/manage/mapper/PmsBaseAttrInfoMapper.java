package com.liujianhui.gmall.manage.mapper;

import com.liujianhui.gmall.bean.PmsBaseAttrInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsBaseAttrInfoMapper extends Mapper<PmsBaseAttrInfo> {
    //平台属性查询
    List<PmsBaseAttrInfo> attrInfoList(Long catalog3Id);
    //保存属性
    int saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);



}
