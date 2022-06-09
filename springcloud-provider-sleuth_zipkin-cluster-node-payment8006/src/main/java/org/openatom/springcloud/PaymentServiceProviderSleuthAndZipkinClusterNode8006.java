package org.openatom.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 支付接口提供者
 *  使用Zookeeper作为注册中心
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentServiceProviderSleuthAndZipkinClusterNode8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceProviderSleuthAndZipkinClusterNode8006.class, args);
    }

}
