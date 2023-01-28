package com.business.verce.vercia.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Verce {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    final boolean gay=true;
    private String nomeDaBattona;

    public Verce() {

    }


    public boolean isGay() {
        return gay;
    }


    public String getNomeDaBattona() {
        return nomeDaBattona;
    }

    public void setNomeDaBattona(String nomeDaBattona) {
        this.nomeDaBattona = nomeDaBattona;
    }

    public Verce(String nomeDaBattona) {
        this.nomeDaBattona = nomeDaBattona;
    }

    @OneToMany(mappedBy = "Verce",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Batacchi> batacchis;















}
