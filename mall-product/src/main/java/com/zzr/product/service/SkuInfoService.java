package com.zzr.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzr.common.utils.PageUtils;
import com.zzr.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022-04-28 12:40:53
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuInfo(SkuInfoEntity skuInfoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);
}

