package com.example.gulimall.coupon;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 如何使用Nacos作为配置中心统一管理配置
 * 1.引入依赖
 *  <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *             <version>2021.0.4.0</version>
 *         </dependency>
 *
 * 2.创建bootstrap.yaml
 * 3.需要给配置中心添加一个数据集
 * 4.给应用名.properties添加配置
 * 5.动态获取配置
 * @RefreshScope:动态刷新配置
 * @Value("${配置项}"):获取配置
 *
 *
 * 细节
 * 1.命名空间：配置隔离
 *  默认：public（保留空间）：默认新增的所有配置都在public空间
 *  利用命名空间做环境隔离，在配置上需要哪个命名空间下的配置  spring.cloud.nacos.config.namespace
 *  每一个微服务之间相互隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 * 2.配置集：所有配置的集合
 *
 * 3.配置集ID：类似文件名
 *
 * 4.配置分组
 *  默认所有配置都属于DEFAULT_GROUP
 *  每个微服务创建自己的命名空间，使用配置分组区分环境，dev,test,pro
 *
 *
 * 同时加载多个配置集
 * 1.微服务任何配置信息，任何配置文件都可以放在配置中心
 * 2.只需要在bootstrap中说明加载配置中心中哪些配置文件即可
 * 3.@Value、@ConfigurationProperties,以前Springboot任何方法从配置文件中获取值都能使用
 * 4.配置中心有的优先使用配置中心的
 */


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class GulimallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}

