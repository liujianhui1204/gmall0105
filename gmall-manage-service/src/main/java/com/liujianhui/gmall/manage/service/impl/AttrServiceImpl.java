package com.liujianhui.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.liujianhui.gmall.bean.PmsBaseAttrInfo;
import com.liujianhui.gmall.bean.PmsBaseAttrValue;
import com.liujianhui.gmall.bean.PmsBaseSaleAttr;
import com.liujianhui.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.liujianhui.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.liujianhui.gmall.manage.mapper.PmsBaseSaleAttrMapper;
import com.liujianhui.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;
    @Autowired
    private PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;
    //为修改属性和属性值查询一个attrValue的集合
    @Override
    public List<PmsBaseAttrValue> getAttrValueList(Long attrId) {
        PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
        //将PmsBaseAttrValue的attrId封装成一个pmsBaseAttrValue的对象，使用通用mapper查询
        pmsBaseAttrValue.setAttrId(attrId);
        List<PmsBaseAttrValue> pmsBaseAttrValues = pmsBaseAttrValueMapper.select(pmsBaseAttrValue);
        return pmsBaseAttrValues;
    }
    //查询销售属性
    @Override
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
       List<PmsBaseSaleAttr> pmsBaseSaleAttrs = this.pmsBaseSaleAttrMapper.selectAll();
        return pmsBaseSaleAttrs;
    }

    //保存属性和修改属性
    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        /*Long id = pmsBaseAttrInfo.getId();
        System.out.println(id);
        String s = Long.toString(id);*/
        //判断id是否为空
        if(pmsBaseAttrInfo.getId() == null){
            //如果为空则保存平台属性(插入平台属性，返回主键ID)
            this.pmsBaseAttrInfoMapper.insertSelective(pmsBaseAttrInfo);
            //通用mapper中的insertSelective只将有值的非空的部分插入数据库，insert全插
                //保存平台属性值
                //先获取属性值的集合
                List<PmsBaseAttrValue> attrValuesList = pmsBaseAttrInfo.getAttrValueList();
                //属性id为属性值的外键。保存属性值的时候，循环保存属性值的外键，获取属性的id;pmsBaseAttrInfo.getId()
                //循环获取属性值集合中的属性值对象
                for (PmsBaseAttrValue pmsBaseAttrValue : attrValuesList) {
                    //添加属性值，并设置属性值外键id
                    pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                    pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
                }
        }else{
            //如果不为空，则修改属性
            Example example = new Example(PmsBaseAttrInfo.class);
            example.createCriteria().andEqualTo("id",pmsBaseAttrInfo.getId());
            //根据id修改属性
            pmsBaseAttrInfoMapper.updateByExampleSelective(pmsBaseAttrInfo,example);
            //修改属性值
            //根据ID删除所有属性
            PmsBaseAttrValue pmsBaseAttrValueDel = new PmsBaseAttrValue();
            pmsBaseAttrValueDel.setAttrId(pmsBaseAttrInfo.getId());
            pmsBaseAttrValueMapper.delete(pmsBaseAttrValueDel);
            //获取属性值，重新插入属性值
            List<PmsBaseAttrValue> attrValueList = pmsBaseAttrInfo.getAttrValueList();
            for (PmsBaseAttrValue pmsBaseAttrValue : attrValueList) {
                pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
                pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
            }
        }
        return "success";
    }
    //平台属性查询
    @Override
    public List<PmsBaseAttrInfo> attrInfoList(Long catalog3Id) {
        Example e = new Example(PmsBaseAttrInfo.class);
        e.createCriteria().andEqualTo("catalog3Id",catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = this.pmsBaseAttrInfoMapper.selectByExample(e);
        return pmsBaseAttrInfos;
    }


}
