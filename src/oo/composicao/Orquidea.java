package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Orquidea {
    //1 - Criar variável nome usada na Classe Teste.
    String nome;
    // 2 - Criar objeto Orquídea com parâmetro e referência à variável pré-declarada.
    Orquidea(String nome) {
        this.nome = nome;
    }
    // 3 - Criar Lista com nome e elementos específicos.
    List<Cor> cores = new ArrayList<>();
    // 4 - Criar métoodo de interação que será usado na Classe Teste.
    void adicionarCor (Cor cor) {
        this.cores.add(cor);
        cor.orquideas.add(this);
    }
    // 5 - Criar método que permite a transformação de elementos do Array em String
    public  String toString() {
        return nome;
    }
}
