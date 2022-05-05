package com.example.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author fangshuai
 * @email nyydzzbb@163.com
 * @date 2022-04-21 19:45:22
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

