package com.example.deom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
/*@ComponentScan(basePackages = { "com.order.controller", "com.order.model", "com.soa.service", "my.com.base.impl" })
@MapperScan("com.order.dao")*/
@ComponentScan(basePackages = { "com.order.controller"})
public class OrderApplication extends SpringBootServletInitializer {

	
	
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}
	 

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		builder.sources(this.getClass());
		return super.configure(builder);
	}
}
