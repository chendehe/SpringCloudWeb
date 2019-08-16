package com.chendehe.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 健康查询 /actuator/health
// 断路器指标 /actuator/hystrix.stream
//@EnableCircuitBreaker,监控，需要引入包spring-cloud-starter-netflix-hystrix
@EnableCircuitBreaker
@EnableFeignClients/*(defaultConfiguration = FeignConfig.class)*/
@SpringBootApplication
public class FeignApplication {

  public static void main(String[] args) {
    SpringApplication.run(FeignApplication.class, args);
  }
}