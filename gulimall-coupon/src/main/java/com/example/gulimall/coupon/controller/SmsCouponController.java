package com.example.gulimall.coupon.controller;


import com.example.common.utils.R;
import com.example.gulimall.coupon.entity.SmsCoupon;
import com.example.gulimall.coupon.service.ISmsCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.cloud.context.config.annotation.RefreshScope;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


/**
 * <p>
 * 优惠券信息 前端控制器
 * </p>
 *
 * @author fs
 * @since 2023-06-09
 */
@RestController
@RequestMapping("/sms-coupon")
@RefreshScope
public class SmsCouponController {
    @Autowired
    private ISmsCouponService iSmsCouponService;


    @Value("${spring.cloud.nacos.config.namespace}")
    private String namespace;

    @RequestMapping("/get")
    public String test() {
        return namespace;
    }


    @RequestMapping("/member")
    public R memberCoupon() {
        SmsCoupon smsCoupon = new SmsCoupon();
        smsCoupon.setCouponName("满100减10");
        return R.ok(Arrays.asList(smsCoupon));
    }



}
