package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {

    String nome;
    Aeroporto(String nome) {

        this.nome = nome;
    }
    List<Operadora> operadoras = new ArrayList<>();

    void adicionarOperadora(Operadora operadora) {
        this.operadoras.add(operadora);
        operadora.aeroportos.add(this);
    }
    public String toString(){
        return nome;
    }
}
