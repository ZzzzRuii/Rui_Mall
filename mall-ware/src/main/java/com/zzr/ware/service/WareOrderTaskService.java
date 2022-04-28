package com.zzr.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzr.common.utils.PageUtils;
import com.zzr.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022-04-28 16:35:17
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

