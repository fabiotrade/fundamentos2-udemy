package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Cor {
    String nome;
    Cor(String nome) {
        this.nome = nome;
    }
    List<Orquidea> orquideas = new ArrayList<>();
    void adicionarOrquidea (Orquidea orquidea) {
        this.orquideas.add(orquidea);
        orquidea.cores.add(this);
    }
    public String toString() {
        return nome;
    }
}
