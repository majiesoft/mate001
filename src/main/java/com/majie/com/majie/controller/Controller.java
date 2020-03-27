package com.majie.com.majie.controller;


/*
  created by 19147
  date by 2020/3/17
  
*/

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/hello")
public class Controller {


    @GetMapping("/world")
    public String testMethod(HttpRequest httpRequest, Model model){
        HttpMethod method = httpRequest.getMethod();
        final URI uri = httpRequest.getURI();


        return "hello world";

    }
}
