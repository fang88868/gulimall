package com.example.gulimall.member.controller;


import com.example.common.utils.R;
import com.example.gulimall.member.entity.UmsMember;
import com.example.gulimall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;

/**
 * <p>
 * 会员 前端控制器
 * </p>
 *
 * @author fs
 * @since 2023-06-09
 */
@RestController
@RequestMapping("/ums-member")
public class UmsMemberController {
    @Autowired
    CouponFeignService couponFeignService;
    @RequestMapping("/coupon")
    public R test(){
        UmsMember umsMember = new UmsMember();
        umsMember.setNickname("张三");
        R memberCoupon = couponFeignService.memberCoupon();
        System.out.println("coupons:"+memberCoupon.getData());
        System.out.println(umsMember.toString());
        return R.ok(new HashMap<>().put("member", Arrays.asList(umsMember)));
    }

}
