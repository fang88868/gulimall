package com.example.gulimall.order.service.impl;

import com.example.gulimall.order.entity.OmsOrder;
import com.example.gulimall.order.mapper.OmsOrderMapper;
import com.example.gulimall.order.service.IOmsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author fs
 * @since 2023-06-09
 */
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements IOmsOrderService {

}
