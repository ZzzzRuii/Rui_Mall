package com.zzr.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzr.common.utils.PageUtils;
import com.zzr.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022-04-28 16:18:04
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

