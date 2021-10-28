package com.example.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"api 정보를 제공하는 controller"})
@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/plus/{x}")
    public int sum(
                    @ApiParam(value = "x값")
                    @PathVariable int x,

                   @ApiParam(value = "y값")
                   @RequestParam int y){
        return x+y;
    }
}
