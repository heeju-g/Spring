package com.company.ioc;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20?name=spring-boot";
        //base 64 encoding
        //IEncoder encoder = new Base64Encoder();
        //Encoder encoder = new Encoder();
        //DI : 외부에서 사용할 객체를 주입받는 것. Encoder라는 본질객체는 건드리지 않고 주입 객체만 바꿔서 사용할 수 있다.
        Encoder encoder = new Encoder(new Base64Encoder());
        String result = encoder.encode(url);
        //url encoding
        IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);
        System.out.println(urlResult);
    }
}
