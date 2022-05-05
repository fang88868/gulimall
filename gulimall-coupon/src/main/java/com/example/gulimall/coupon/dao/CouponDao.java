package com.example.gulimall.coupon.dao;

import com.example.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fangshuai
 * @email fangshuai@163.com
 * @date 2022-04-11 18:22:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
