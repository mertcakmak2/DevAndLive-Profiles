package com.spring.profile.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String main(){
        return "main method";
    }
}
