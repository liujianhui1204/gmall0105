package com.liujianhui.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liujianhui.gmall.bean.PmsBaseAttrInfo;
import com.liujianhui.gmall.bean.PmsBaseAttrValue;
import com.liujianhui.gmall.bean.PmsBaseSaleAttr;
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
    //为修改属性查询一个attrValueList集合
    @RequestMapping("/getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(Long attrId){
        List<PmsBaseAttrValue> pmsBaseAttrValues = this.attrService.getAttrValueList(attrId);
        return pmsBaseAttrValues;
    }
    //查询销售属性名称baseSaleAttrList
    @RequestMapping("/baseSaleAttrList")
    @ResponseBody
    public List<PmsBaseSaleAttr> baseSaleAttrList (){
        List<PmsBaseSaleAttr> pmsBaseSaleAttrs = this.attrService.baseSaleAttrList();

        return pmsBaseSaleAttrs;
    }
    //添加属性//和修改属性、属性值
    @RequestMapping("/saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo (@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        //前台向后台传的json参数，必须要和实体类中的变量名称一致
        if(pmsBaseAttrInfo != null){
            List<PmsBaseAttrValue> attrValuesList = pmsBaseAttrInfo.getAttrValueList();
            String success = this.attrService.saveAttrInfo(pmsBaseAttrInfo);
            if(success != null){
                return "success";
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
