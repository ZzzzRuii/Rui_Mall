package com.zzr.member.feign;

import com.zzr.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 声明远程调用Coupon服务的接口
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/4/29 13:05
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
