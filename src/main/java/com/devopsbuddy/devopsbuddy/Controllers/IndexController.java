package com.devopsbuddy.devopsbuddy.Controllers;



@org.springframework.stereotype.Controller
public class IndexController {

    @org.springframework.web.bind.annotation.RequestMapping("/")

    public String home(){

        return "index";
    }
}
