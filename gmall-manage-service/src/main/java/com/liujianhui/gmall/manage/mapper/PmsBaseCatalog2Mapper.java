package com.liujianhui.gmall.manage.mapper;

import com.liujianhui.gmall.bean.PmsBaseCatalog2;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsBaseCatalog2Mapper extends Mapper<PmsBaseCatalog2> {
    //查询二级类目
    List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id);
}
