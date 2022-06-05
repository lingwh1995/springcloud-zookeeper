package org.openatom.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用Ribbon实现负载均衡:Java编码方式:
 *      缺点:不能在配置文件中动态修改服务提供方名称
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderServiceConsumerLoadBalanceDefault80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceConsumerLoadBalanceDefault80.class, args);
    }
}
