package com.zzr.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * 合并采购需求VO
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/5/15 15:06
 */
@Data
public class MergeVo {

    private Long purchaseId;
    private List<Long> items;
}
