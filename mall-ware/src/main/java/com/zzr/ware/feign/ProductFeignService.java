package com.zzr.ware.feign;

import com.zzr.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 声明远程调用Product服务的接口
 *
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022/4/29 13:05
 */
@FeignClient("mall-product")
public interface ProductFeignService {

    /**
     * 1、让所有请求过网关
     * 1)、@FeignClient("mall-gateway")：给网关所在的服务发请求
     * 2)、api/product/skuinfo/info/{skuId}
     * 2、直接让后台指定服务处理
     * 1)、@FeignClient("mall-product")
     * 2)、/product/skuinfo/info/{skuId}
     *
     * @param
     * @return
     */
    @RequestMapping("/product/skuinfo/info/{skuId}")
    R info(@PathVariable("skuId") Long skuId);
}
