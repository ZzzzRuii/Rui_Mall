package com.zzr.product.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.zzr.product.entity.AttrEntity;
import lombok.Data;

import java.util.List;

/**
 * 当前分类下的所有属性分组Vo
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/5/12 19:03
 */
@Data
public class AttrGroupWithAttrsVo {

    /**
     * 分组id
     */
    @TableId
    private Long attrGroupId;
    /**
     * 组名
     */
    private String attrGroupName;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 描述
     */
    private String descript;
    /**
     * 组图标
     */
    private String icon;
    /**
     * 所属分类id
     */
    private Long catelogId;

    private List<AttrEntity> attrs;
}
