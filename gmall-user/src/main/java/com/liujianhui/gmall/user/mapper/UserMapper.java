package com.liujianhui.gmall.user.mapper;


//通用mapper,将来关于UmsMember表的所有增删改查操作，通用mapper都会帮忙做了
import com.liujianhui.gmall.bean.UmsMember;
        import tk.mybatis.mapper.common.Mapper;


import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();
    //获取所有用户

}
