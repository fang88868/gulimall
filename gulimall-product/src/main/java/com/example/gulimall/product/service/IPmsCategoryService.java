package com.example.gulimall.product.service;

import com.example.gulimall.product.entity.PmsCategory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品三级分类 服务类
 * </p>
 *
 * @author fs
 * @since 2023-06-09
 */
public interface IPmsCategoryService extends IService<PmsCategory> {

    List<PmsCategory> listWithTree();
}
