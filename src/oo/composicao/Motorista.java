package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    String nome;

    Motorista(String nome) {

        this.nome = nome;
    }
    List<Posto> postos = new ArrayList<>();

    void adicionarPosto(Posto posto) {
        this.postos.add(posto);
        posto.motoristas.add(this);
    }

    public String toString() {

        return nome;
    }

}
