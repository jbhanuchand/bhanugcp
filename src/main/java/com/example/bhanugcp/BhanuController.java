package com.example.bhanugcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class BhanuController{

    @GetMapping("/page")
    @ResponseBody
    public String homePage(){
        return "This is home page";
    }
}