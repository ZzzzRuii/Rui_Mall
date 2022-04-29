package com.zzr.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1、如何使用Nacos作为配置中心统一管理配置
 *
 * 1)、引入依赖。
 * <xmp>
 *         <!--        配置中心/配置管理依赖-->
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *         <!--        由于springboot的版本问题不会自动读取bootstrap.properties文件中的配置，引入spring-cloud-starter-bootstrap依赖进行读取-->
 *         <dependency>
 *             <groupId>org.springframework.cloud</groupId>
 *             <artifactId>spring-cloud-starter-bootstrap</artifactId>
 *             <version>3.1.1</version>
 *         </dependency>
 * </xmp>
 * 2)、创建一个bootstrap.properties文件。
 *         spring.application.name=mall-coupon
 *         spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3)、需要给配置中心默认添加一个 数据集（Data Id）mall-coupon.properties。默认规则，应用名.properties。
 * 4)、给应用名.properties 添加任何配置
 * 5)、动态获取配置。
 *         @RefreshScope：动态获取并刷新配置。
 *         @Value("${配置项的名字})：获取到配置。
 *         如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置。
 *
 * 2、细节
 * 1)、命名空间：配置隔离：
 *         默认：public(保留空间)：默认新增的所有配置都在public空间。
 *         1、开发，测试，生产：利用命名空间来做环境隔离。
 *            注意：在bootstrap.properties 配置上，需要使用哪个命名空间下的配置，
 *            spring.cloud.nacos.config.namespace=43ec8946-9f77-4c2e-aa19-d962ba51b4f9
 *         2、基于每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 *
 * 2)、配置集：所有配置的集合。
 *
 * 3)、配置集ID：类似文件名。
 *         Data Id：类似文件名。
 *
 * 4)、配置分组：spring.cloud.nacos.config.group=自定义组名
 *         默认所有的配置集都属于：DEFAULT_GROUP;
 *
 * 每个微服务创建自己的命名空间，使用配置分组区分环境，dev，test，prod
 *
 * 3、同时加载多个配置集
 * 1)、微服务任何配置信息，任何配置文件都可以放在配置中心中。
 * 2)、只需要在bootstrap.properties说明加载配置中心中哪些配置文件即可。
 * 3)、自己想要获取可以使用 @Value，@ConfigurationProperties....
 * 以前SpringBoot任何方法从配置文件中获取值，都能使用。
 * 配置中心有的优先使用配置中心中的值。
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
