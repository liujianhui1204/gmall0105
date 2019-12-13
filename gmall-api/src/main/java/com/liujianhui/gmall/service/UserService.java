package com.liujianhui.gmall.service;

import com.liujianhui.gmall.bean.UmsMember;
import com.liujianhui.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    //获取所有用户
    List<UmsMember> getAllUser();
    //根据id查询收货地址
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);


}
