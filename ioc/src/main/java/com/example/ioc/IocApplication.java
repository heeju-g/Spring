package com.example.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) {

        SpringApplication.run(IocApplication.class, args);
        ApplicationContext context = ApplicationContextProvider.getContext();

        //클래스 타입 혹은 이름을 통해 빈 찾는다.
        Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
        UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);

        Encoder encoder = new Encoder(base64Encoder);
        String url = "www.naver.com/books/it?page=10&size=20?name=spring-boot";
        //base64
        String result = encoder.encode(url);
        System.out.println(result);
        //url
        encoder.setiEncoder(urlEncoder);
        result = encoder.encode(url);
        System.out.println(result);
    }

}
