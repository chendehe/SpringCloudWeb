package com.chendehe;

import java.nio.charset.Charset;
import java.util.Base64;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker
//@EnableFeignClients
//@EnableOAuth2Client
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }


  @Bean
  public HttpHeaders getHeaders() {
    HttpHeaders headers = new HttpHeaders();
    String auth = "miniweb:miniweb";
    headers.set("Authorization", "Basic " +
        new String(Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")))));
    return headers;
  }

  @Bean
  @LoadBalanced RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
