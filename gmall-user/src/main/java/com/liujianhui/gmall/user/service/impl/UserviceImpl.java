package com.liujianhui.gmall.user.service.impl;

import com.liujianhui.gmall.user.bean.UmsMember;
import com.liujianhui.gmall.user.bean.UmsMemberReceiveAddress;
import com.liujianhui.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.liujianhui.gmall.user.mapper.UserMapper;
import com.liujianhui.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserviceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    //查询所有会员
    @Override
    public List<UmsMember> getAllUser() {
        //使用通用mapper查询所有
        List<UmsMember> umsMemberList = this.userMapper.selectAll();//this.userMapper.selectAllUser();
        return umsMemberList;
    }

    //根据id查询地址
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        //使用反射创建UmsMemberReceiveAddress外键实例
        Example e = new Example(UmsMemberReceiveAddress.class);
        //createCriteria()设置外键参数,andEqualTo()添加条件
        //此处参数类型可能不匹配
        e.createCriteria().andEqualTo("memberId",memberId);
        //根据外键查询，使用umsMemberReceiveAddressMapper
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = this.umsMemberReceiveAddressMapper.selectByExample(e);
       /*
        //简单方法
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        long l = Long.parseLong(memberId);
        umsMemberReceiveAddress.setMemberId(l);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = this.umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);
        */

        return umsMemberReceiveAddresses;
    }
}
