package com.hamitmizrak.cdi;

//kapsam. objenin yasam suresini belirler

import javax.enterprise.context.*;
import javax.inject.Named;
import java.io.Serializable;

@Named
//@ApplicationScoped //server kapatilana kadar calisir
//@RequestScoped //1 istek boyunca
//@SessionScoped //1 kullanici icin yasar logouta kadar
//@Dependent //cagirilan yere gore olusur
//@ConversationScoped //belli istek boyunca
//@SessionScoped //bean 1 instance olmasını saglamak icin
public class _00_Scoped  {

}
