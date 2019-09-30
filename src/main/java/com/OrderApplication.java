package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.baomidou.mybatisplus.dts.EnableDtsRabbit;

  

//@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@EnableDtsRabbit
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
 
	
	/*
	 * @Bean public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
	 * return new RabbitAdmin(connectionFactory); }
	 */
}
