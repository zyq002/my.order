package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
 
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.order.dao")
@EnableAspectJAutoProxy
/*
 * @EnableFeignClients(basePackages = { "com.remote.feignclient" })
 */
public class OrderApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.sources(this.getClass());
		return super.configure(builder);
	}
}
