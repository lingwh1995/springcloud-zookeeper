package org.openatom.springcloud;

import org.openatom.springcloud.loadbalance.MyRoundRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 使用Ribbon实现负载均衡:Java编码方式:
 *      缺点:不能在配置文件中动态修改服务提供方名称
 */
@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-PAYMENT-SERVICE-CLUSTER",configuration= MyRoundRobinRule.class)
public class OrderServiceConsumerLoadBalanceRibbonCustomerStrategyHardcode80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceConsumerLoadBalanceRibbonCustomerStrategyHardcode80.class, args);
    }
}
