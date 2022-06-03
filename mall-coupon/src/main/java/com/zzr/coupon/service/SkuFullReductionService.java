package com.zzr.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzr.common.to.SkuReductionTo;
import com.zzr.common.utils.PageUtils;
import com.zzr.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022-04-28 15:17:54
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

