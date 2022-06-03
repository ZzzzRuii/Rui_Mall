package com.zzr.product.feign;

import com.zzr.common.to.SkuReductionTo;
import com.zzr.common.to.SpuBoundTo;
import com.zzr.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 声明远程调用Coupon服务的接口
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/4/29 13:05
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {

    /**
     * 1、CouponFeignService.saveSpuBounds(spuBoundTo)
     * <p>
     * 1)、@RequestBody将这个对象转为JSON。
     * <p>
     * 2)、找到mall-coupon服务，给/coupon/spubounds/save发送请求。
     * 将上一步转的JSON放在请求体位置，发送请求。
     * <p>
     * 3)、对方服务收到请求。请求体里有JSON数据
     * (@RequestBody SpuBoundTo spuBoundTo);将请求体的JSON转为SpuBoundsEntity;
     * <p>
     * 只要JSON数据模型是兼容的，双方服务无需使用同一个TO。
     *
     * @param spuBoundTo
     * @return
     */
    @PostMapping("/coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

    @PostMapping("/coupon/skufullreduction/saveinfo")
    R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);
}
