package com.zzr.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzr.common.utils.PageUtils;
import com.zzr.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022-04-28 16:00:08
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

