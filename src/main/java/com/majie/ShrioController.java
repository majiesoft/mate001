package com.majie;


/*
  created by 19147
  date by 2020/3/17
  
*/

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShrioController {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ShrioController.class, args);

    }
}
