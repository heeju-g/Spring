package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Encoder {
    private IEncoder iEncoder;
    //(@Qualifier("urlEncoder") IEncoder iEncoder) : base64,url 두 개라서 매칭을 어떤 걸 해줄지 정해주는 것.
    public Encoder(IEncoder iEncoder){
        //this.iEncoder = new Base64Encoder();
        //this.iEncoder = new UrlEncoder();
        this.iEncoder = iEncoder;
    }

    //스프링에서 주입할 때 set
    public void setiEncoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){

        return iEncoder.encode(message);
    }
}
