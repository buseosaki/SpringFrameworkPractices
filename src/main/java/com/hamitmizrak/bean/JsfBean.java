package com.hamitmizrak.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdiBean")
@ApplicationScoped
@Getter
@Setter

public class JsfBean {

    public JsfBean(String patika) {
        this.patika = "String Boot Eğitimine Hoşgeldiniz";
    }

    private String patika;
}
