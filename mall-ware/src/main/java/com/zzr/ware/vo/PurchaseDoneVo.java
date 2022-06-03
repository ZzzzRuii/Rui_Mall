package com.zzr.ware.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 完成采购VO
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/5/15 16:09
 */
@Data
public class PurchaseDoneVo {

    @NotNull
    private Long id;

    private List<PurchaseItemDoneVo> items;
}
