package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Torcedor {
    String nome;

    Torcedor(String nome) {
        this.nome = nome;
    }

    List<Selecao> selecao = new ArrayList<>();

    void adicionarSelecao(Selecao selecao) {
        this.selecao.add(selecao);
        selecao.torcedor.add(this);

    }

    public String toString() {
        return nome;
    }


}
