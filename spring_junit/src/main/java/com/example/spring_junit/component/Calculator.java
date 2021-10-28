package com.example.spring_junit.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Calculator {
    private final ICalculator iCalculator;



    public int sum(int x, int y){
        //계산하기 전에 환율정보 받아와야 하니까 init
        this.iCalculator.init();
        return this.iCalculator.sum(x,y);
    }
    public int minus(int x, int y){
        this.iCalculator.init();
        return this.iCalculator.minus(x,y);
    }
}
