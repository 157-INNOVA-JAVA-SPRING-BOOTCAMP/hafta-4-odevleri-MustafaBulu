package com.mustafabulu.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@Log4j2
public class RestController {

      // List methodumuzu burada tüketeceğiz.
      // http://localhost:8080/rest/controller/string
      @GetMapping("/rest/controller/string")
      @ResponseBody
      public String getServicesListUser(){
            String URL="http://localhost:8080/rest/list";
            RestTemplate restTemplate=new RestTemplate();
            String jsonData=restTemplate.getForObject(URL,String.class);
            log.info(jsonData.toUpperCase());
            return jsonData;
      }





}













