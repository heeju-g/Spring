package com.company.ioc;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20?name=spring-boot";
        //base 64 encoding
        Encoder encoder = new Encoder();
        String result = encoder.encode(url);
        //url encoding
        UrlEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);
        System.out.println(urlResult);
    }
}
