package com.hamitmizrak.iocli_dili;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "ioclicdiliCalisan")
@ApplicationScoped

public class Calisan {
@Inject
    private PatronInterface patronInterface;
    //constructor olunca return yaisi olmaz
    //parametresiz contructor
    public Calisan(){

        //Injectiondan sonra newe gerek yok
        // patronInterface=new Patron();
    }

    public String getData(String data){

        return patronInterface.surum(data);
    }
}
