package com.gyjian.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @EnableDiscoveryClient 可省略。
 * SpringCloud 从 Edgware 版本（对应 SpringBoot 1.5.x）开始,可以不加`@EnableDiscoveryClient`注解,
 * 只要配置好注册中心的相关配置即可自动开启服务注册功能
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudAlibabaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAlibabaProviderApplication.class, args);
	}

}
