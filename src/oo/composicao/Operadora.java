package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Operadora {

    String nome;

    Operadora(String nome) {

        this.nome = nome;
    }
    List<Aeroporto> aeroportos = new ArrayList<>();

    void adicionarAeroporto (Aeroporto aeroporto) {
        this.aeroportos.add(aeroporto);
        aeroporto.operadoras.add(this);
    }
    public String toString(){
        return nome;
    }
}
