package com.example.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) {

        SpringApplication.run(IocApplication.class, args);
        ApplicationContext context = ApplicationContextProvider.getContext();

        //클래스 타입 혹은 이름을 통해 빈 찾는다.
       // Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
       // UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);


       //타입으로 찾기  Encoder encoder = context.getBean(Encoder.class);
        //아래는 이름으로 찾기
        Encoder encoder = context.getBean("base64Encode",Encoder.class);
        String url = "www.naver.com/books/it?page=10&size=20?name=spring-boot";
        String result = encoder.encode(url);
        System.out.println(result);
        /*base64
        String result = encoder.encode(url);
        System.out.println(result);

         */
        /*url
        encoder.setiEncoder(urlEncoder);
        result = encoder.encode(url);
        System.out.println(result);

         */
    }
@Configuration
//하나의 클래스에 여러 빈을 등록.
class AppConfig{
        //같은 게 두개니까 @Bean으로 이름 설정하는데,base64Encoder로 하면 이미 사용중이라 충돌이 생기니까 변경.
        @Bean("base64Encode")
        public Encoder encoder(Base64Encoder base64Encoder){
            return new Encoder(base64Encoder);
        }
        @Bean("urlEncode")
        public Encoder encoder(UrlEncoder urlEncoder){
            return new Encoder(urlEncoder);
        }

}
}
