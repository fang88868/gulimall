package com.example.gulimall.coupon.mapper;

import com.example.gulimall.coupon.entity.SmsHomeSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 Mapper 接口
 * </p>
 *
 * @author fs
 * @since 2023-06-09
 */
@Mapper
public interface SmsHomeSubjectMapper extends BaseMapper<SmsHomeSubject> {

}
