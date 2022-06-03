package com.zzr.product.vo;

import lombok.Data;

/**
 * 响应数据VO
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/5/10 18:55
 */
@Data
public class AttrRespVo extends AttrVo {
    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}
