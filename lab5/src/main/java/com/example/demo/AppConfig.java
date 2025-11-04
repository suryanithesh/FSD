package com.example.demo;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.ComponentScan; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.Scope; 
 
@Configuration 
@ComponentScan("com.example.demo") 
public class AppConfig { 
 @Bean(initMethod = "init", destroyMethod = "destroy") 
 @Scope("singleton") 
 public MyBean myBean() { 
 return new MyBean(); 
 } 
 
 
} 