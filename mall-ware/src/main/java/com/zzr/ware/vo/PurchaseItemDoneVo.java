package com.zzr.ware.vo;

import lombok.Data;

/**
 * 完成采购的项目VO
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/5/15 16:11
 */
@Data
public class PurchaseItemDoneVo {

    private Long itemId;
    private Integer status;
    private String reason;
}
