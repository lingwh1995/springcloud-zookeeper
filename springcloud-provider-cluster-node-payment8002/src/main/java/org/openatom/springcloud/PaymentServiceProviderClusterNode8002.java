package org.openatom.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 支付接口提供者
 *  使用Zookeeper作为注册中心
 *  查看是否将服务注册进了Zookeeper:
 *      输入命令:ls /services
 *      结果为:[spring-cloud-payment-service]
 *  注意:在zookeeper中创建的是临时节点
 */
//@EnableDiscoveryClient当注册中心不是Eureka时使用这个注解来暴露服务
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentServiceProviderClusterNode8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceProviderClusterNode8002.class, args);
    }
}
