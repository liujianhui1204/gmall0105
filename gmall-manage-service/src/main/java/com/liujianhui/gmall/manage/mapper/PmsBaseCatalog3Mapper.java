package com.liujianhui.gmall.manage.mapper;

import com.liujianhui.gmall.bean.PmsBaseCatalog3;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsBaseCatalog3Mapper extends Mapper<PmsBaseCatalog3> {
    //查询三级类目
    List<PmsBaseCatalog3> getCatalog3(Integer catalog2Id);
}
