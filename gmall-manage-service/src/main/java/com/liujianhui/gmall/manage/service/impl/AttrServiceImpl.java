package com.liujianhui.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.liujianhui.gmall.bean.PmsBaseAttrInfo;
import com.liujianhui.gmall.bean.PmsBaseAttrValue;
import com.liujianhui.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.liujianhui.gmall.manage.mapper.PmsBaseAttrValueMapper;
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
    //保存属性
    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        //保存平台属性(插入平台属性，返回主键ID)
        int i = this.pmsBaseAttrInfoMapper.insertSelective(pmsBaseAttrInfo);
        //通用mapper中的insertSelective只将有值的非空的部分插入数据库，insert全插
        if(i != 0) {
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
            return "success";
        }
        return null;
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
