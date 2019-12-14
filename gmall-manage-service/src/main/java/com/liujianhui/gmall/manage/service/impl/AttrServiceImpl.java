package com.liujianhui.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.liujianhui.gmall.bean.PmsBaseAttrInfo;
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
    public int saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        int saveAttrInfo = this.pmsBaseAttrInfoMapper.insert(pmsBaseAttrInfo);
        return saveAttrInfo;
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
