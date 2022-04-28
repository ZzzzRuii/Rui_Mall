package com.zzr.product.dao;

import com.zzr.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022-04-28 12:40:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
