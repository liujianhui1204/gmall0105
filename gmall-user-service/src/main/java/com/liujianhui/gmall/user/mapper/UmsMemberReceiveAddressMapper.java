package com.liujianhui.gmall.user.mapper;

import com.liujianhui.gmall.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.common.Mapper;

//继承通用mapper,必须使用泛型
public interface UmsMemberReceiveAddressMapper extends Mapper<UmsMemberReceiveAddress> {
    //继承通用mapper后再service层中直接使用
    //程序入口处使用import tk.mybatis.spring.annotation.MapperScan;的
    //@MapperScan(basePackages = "com.liujianhui.gmall.user.mapper")注解


}
