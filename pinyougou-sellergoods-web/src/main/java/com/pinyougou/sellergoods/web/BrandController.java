package com.pinyougou.sellergoods.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.po.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author asus
 * @version 1.0
 * @description com.pinyougou.sellergoods.web
 * @create 2018/6/15
 */
@Controller
public class BrandController {

    @Reference
    private BrandService brandService;

    @RequestMapping("/brand/findAll")
    @ResponseBody
    public List<TbBrand> getAll(){
        List<TbBrand> list = brandService.getList();
        return list;
    }
}
