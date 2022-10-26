package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Selecao {
    String nome;

    Selecao(String nome) {
        this.nome = nome;
    }

    List<Torcedor> torcedor = new ArrayList<>();

    void adicionarTorcedor(Torcedor torcedor) {
        this.torcedor.add(torcedor);
        torcedor.selecao.add(this);

    }

    public String toString() {
        return nome;
    }


}
