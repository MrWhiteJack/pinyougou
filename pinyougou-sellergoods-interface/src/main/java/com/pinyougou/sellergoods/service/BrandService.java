package com.pinyougou.sellergoods.service;

import com.pinyougou.po.TbBrand;

import java.util.List;

/**
 * @author asus
 * @version 1.0
 * @description com.pinyougou.sellergoods.service
 * @create 2018/6/15
 */
public interface BrandService {
    /**
     * 查询所有的商品类别
     * @return
     */
    public List<TbBrand> getList();
}
