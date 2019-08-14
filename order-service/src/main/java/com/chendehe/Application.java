package com.chendehe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableCircuitBreaker
//@EnableFeignClients
//@EnableOAuth2Client
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
