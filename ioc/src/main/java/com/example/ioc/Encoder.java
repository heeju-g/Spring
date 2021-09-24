package com.example.ioc;

public class Encoder {
    private IEncoder iEncoder;

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
