package com.liujianhui.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liujianhui.gmall.bean.PmsBaseAttrInfo;
import com.liujianhui.gmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class AttrContrller {
    @Reference
    private AttrService attrService;
    //添加属性
    @RequestMapping("/saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo (@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        if(pmsBaseAttrInfo != null){
            int saveAttrInfo = this.attrService.saveAttrInfo(pmsBaseAttrInfo);
            if(saveAttrInfo != 0){
                return "saveAttrInfo";
            }
        }
        return null;
    }
    //平台属性查询
    @RequestMapping("/attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList (Long catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = this.attrService.attrInfoList(catalog3Id);
        return pmsBaseAttrInfos;
    }
}
