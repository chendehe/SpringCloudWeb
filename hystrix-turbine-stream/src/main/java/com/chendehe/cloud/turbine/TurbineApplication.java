package com.chendehe.cloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

// 可以结合MQ来使用：Hystrix的监控数据发至MQ，Turbine消费MQ的数据
@EnableHystrixDashboard
@EnableTurbineStream
@SpringBootApplication
public class TurbineApplication {

  public static void main(String[] args) {
    SpringApplication.run(TurbineApplication.class, args);
  }
}