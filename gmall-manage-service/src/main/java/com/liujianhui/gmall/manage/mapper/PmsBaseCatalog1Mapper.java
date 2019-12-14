package com.liujianhui.gmall.manage.mapper;

import com.liujianhui.gmall.bean.PmsBaseCatalog1;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsBaseCatalog1Mapper extends Mapper<PmsBaseCatalog1> {
    //查询一级类目
    public List<PmsBaseCatalog1> getCatalog1();
}
