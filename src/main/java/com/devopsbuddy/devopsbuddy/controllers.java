package com.devopsbuddy.devopsbuddy;


@org.springframework.stereotype.Controller
public class controllers {

     @org.springframework.web.bind.annotation.RequestMapping("/")
    public String sayhello(){

     return "index";


    }

}

