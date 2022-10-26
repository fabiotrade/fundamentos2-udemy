package oo.composicao;

import java.util.ArrayList;
import java.util.List;


public class Universidade {

    String nome;

    Universidade(String nome) {
        this.nome = nome;
    }

    List<Campus> unidades = new ArrayList<>();

    void adicionarCampus(Campus campus) {
        this.unidades.add(campus);
        campus.universidades.add(this);
    }

    public String toString() {
        return nome;
    }

}
