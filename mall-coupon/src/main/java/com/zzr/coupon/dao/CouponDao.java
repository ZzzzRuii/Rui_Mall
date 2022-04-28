package com.zzr.coupon.dao;

import com.zzr.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022-04-28 15:17:54
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
