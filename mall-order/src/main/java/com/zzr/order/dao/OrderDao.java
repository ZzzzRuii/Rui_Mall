package com.zzr.order.dao;

import com.zzr.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022-04-28 16:18:04
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
