package com.chendehe.cloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

//聚合 HystrixDashboard 数据
//此外，可以结合MQ来使用：Hystrix的监控数据发至MQ，Turbine消费MQ的数据
@EnableHystrixDashboard
@EnableTurbine
@SpringBootApplication
public class TurbineApplication {

  public static void main(String[] args) {
    SpringApplication.run(TurbineApplication.class, args);
  }
}