package com.example.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) {

        SpringApplication.run(IocApplication.class, args);
        ApplicationContext context = AppicationContextProvider.getContext();
    }

}
