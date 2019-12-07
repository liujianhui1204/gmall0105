package com.liujianhui.gmall.user.controller;

import com.liujianhui.gmall.user.bean.UmsMember;
import com.liujianhui.gmall.user.bean.UmsMemberReceiveAddress;
import com.liujianhui.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    //添加
    @RequestMapping("/getReceiveAddressByMemberId")
    @ResponseBody                                               //@RequestBody接收前端的json数据@RequestBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = this.userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }


    //查询所有
    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = this.userService.getAllUser();
        return umsMembers;
    }


    //测试方法
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "测试hello user";
    }
}
