package com.example.spring_junit.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;

//통합테스트
@SpringBootTest
public class DollarCalculatorTest {
    //스프링에선 빈으로 처리하니까 mockbean
    @MockBean
    private MarketApi marketApi;
    @Autowired
    private DollarCalculator dollarCalculator;

    @Test
    public void dollarCalculatorTest(){

        Mockito.when(marketApi.connect()).thenReturn(3000);
        dollarCalculator.init();
        int sum = dollarCalculator.sum(10,10);
        int minus = dollarCalculator.minus(10,10);

        Assertions.assertEquals(60000,sum);
        Assertions.assertEquals(0,minus);
    }
}
