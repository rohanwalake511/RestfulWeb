package com.example.RestfulWeb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @GetMapping
    String sayHello(){
        return "hello and welcome";
    }
    @GetMapping(path="/weather/{cityName}")
    String getWeather(@PathVariable String cityName){
        return cityName +" "+"weather is good";
    }
}