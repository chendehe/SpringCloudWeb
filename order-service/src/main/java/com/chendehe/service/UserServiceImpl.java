package com.chendehe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserServiceImpl {

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private HttpHeaders headers;

  // 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，熔断方法直接返回了一个字符串
  @HystrixCommand(fallbackMethod = "getError")
  public void get(String id) {

    System.out.println("===:" + id);

//    restTemplate.exchange("http://MINI-WEB/" + id, HttpMethod.GET, new HttpEntity<>(headers), String.class).getBody();

  }

  public void getError(String id) {
    System.out.println("delete " + id + " error!");
  }

}