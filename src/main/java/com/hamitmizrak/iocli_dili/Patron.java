package com.hamitmizrak.iocli_dili;
//yonetimi patrondan almak için interfaceoluştur
public class Patron implements PatronInterface{
@Override
    public String surum(String data){

    return "sürüm"+ data;
    }
}
