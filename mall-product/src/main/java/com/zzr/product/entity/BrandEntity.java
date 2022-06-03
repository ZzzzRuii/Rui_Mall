package com.zzr.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zzr.common.valid.ListValue;
import com.zzr.common.valid.group.AddGroup;
import com.zzr.common.valid.group.UpdateGroup;
import com.zzr.common.valid.group.UpdateStatusGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * 品牌
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022-04-28 12:40:53
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    @Null(message = "新增不能指定ID", groups = {AddGroup.class})
    @NotNull(message = "修改必须指定品牌ID", groups = {UpdateGroup.class})
    @TableId
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank(message = "品牌名不能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String name;
    /**
     * 品牌logo地址
     */
    @NotEmpty(message = "品牌logo地址不能为空", groups = {AddGroup.class})
    @URL(message = "品牌logo地址不合法", groups = {AddGroup.class, UpdateGroup.class})
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    @NotNull(message = "显示状态不能为空", groups = {UpdateStatusGroup.class})
    @ListValue(vals = {0, 1}, groups = {AddGroup.class, UpdateStatusGroup.class})
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotEmpty(message = "检索首字母不能为空", groups = {AddGroup.class})
    @Pattern(regexp = "^[a-zA-Z]$", message = "检索首字母必须是a-z或A-Z之间的一个字母", groups = {AddGroup.class, UpdateGroup.class})
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull(message = "排序不能为空", groups = {AddGroup.class})
    @Min(value = 0, message = "排序必须是大于等于0的整数", groups = {AddGroup.class, UpdateGroup.class})
    private Integer sort;

}
