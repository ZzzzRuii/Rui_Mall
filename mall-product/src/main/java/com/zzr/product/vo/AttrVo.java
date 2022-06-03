package com.zzr.product.vo;

import lombok.Data;

/**
 * VO(Values Object): 值对象(View Object: 视图对象)<br>
 * 接受页面传递来的数据，封装对象<br>
 * 将业务处理完成的对象，封装成页面要用的数据<br>
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/5/10 16:54
 */
@Data
public class AttrVo {

    /**
     * 属性id
     */
    private Long attrId;
    /**
     * 属性名
     */
    private String attrName;
    /**
     * 是否需要检索[0-不需要，1-需要]
     */
    private Integer searchType;
    /**
     * 值类型[0-为单个值，1-可以选择多个值]
     */
    private Integer valueType;
    /**
     * 属性图标
     */
    private String icon;
    /**
     * 可选值列表[用逗号分隔]
     */
    private String valueSelect;
    /**
     * 属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
     */
    private Integer attrType;
    /**
     * 启用状态[0 - 禁用，1 - 启用]
     */
    private Long enable;
    /**
     * 所属分类
     */
    private Long catelogId;
    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
     */
    private Integer showDesc;
    /**
     * 分组Id
     */
    private Long attrGroupId;
}
