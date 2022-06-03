package com.zzr.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzr.common.utils.PageUtils;
import com.zzr.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022-04-28 12:40:53
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfoDesc(SpuInfoDescEntity descEntity);
}

