package com.zzr.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * product <--> coupon 积分 TO
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/5/14 15:01
 */
@Data
public class SpuBoundTo {

    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
}
