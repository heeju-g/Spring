package com.example.spring_junit.controller;

import com.example.spring_junit.component.Calculator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CalculatorApiController {

    private final Calculator calculator;

    @GetMapping("/sum")
    public int sum(@RequestParam int x, @RequestParam int y) {
        return calculator.sum(x, y);
    }
    @PostMapping ("/minus")
    public int minus(@RequestParam int x, @RequestParam int y){
        return calculator.minus(x,y);
    }
}
