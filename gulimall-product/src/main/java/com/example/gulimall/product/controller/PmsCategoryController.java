package com.example.gulimall.product.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.common.utils.R;
import com.example.gulimall.product.entity.PmsCategory;
import com.example.gulimall.product.service.IPmsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * <p>
 * 商品三级分类 前端控制器
 * </p>
 *
 * @author fs
 * @since 2023-06-09
 */
@RestController
@RequestMapping("/pms-category")
public class PmsCategoryController {
    @Autowired
    private IPmsCategoryService iPmsCategoryService;

    @RequestMapping("/list/tree")
    public R list() {
        List<PmsCategory> categoryEntities = iPmsCategoryService.listWithTree();
        return R.ok(categoryEntities);
    }

    @RequestMapping("/update/sort")
    public R update(@RequestBody PmsCategory pmsCategory){
        LambdaQueryWrapper<PmsCategory> queryWrapper = new LambdaQueryWrapper<>();
        iPmsCategoryService.update(pmsCategory,queryWrapper);
        return R.ok();
    }


}
