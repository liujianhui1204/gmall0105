package com.liujianhui.gmall.user.service;

import com.liujianhui.gmall.user.bean.UmsMember;
import com.liujianhui.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    //获取所有用户
    List<UmsMember> getAllUser();
    //根据id查询收货地址
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);


}
