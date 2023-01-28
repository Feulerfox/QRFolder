package com.business.verce.vercia.model;

import javax.persistence.*;

@Entity
public class Batacchi {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private int lunghezza;
    private int diametro;
    private String etnia;
    private boolean elettrificato;

    public Batacchi() {

    }


    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public boolean isElettrificato() {
        return elettrificato;
    }

    public void setElettrificato(boolean elettrificato) {
        this.elettrificato = elettrificato;
    }


    public Batacchi(int lunghezza, int diametro, String etnia, boolean elettrificato) {
        this.lunghezza = lunghezza;
        this.diametro = diametro;
        this.etnia = etnia;
        this.elettrificato = elettrificato;
    }


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Verce")
    private Verce Verce;

    public com.business.verce.vercia.model.Verce getVerce() {
        return Verce;
    }

    public void setVerce(com.business.verce.vercia.model.Verce verce) {
        Verce = verce;
    }
}
