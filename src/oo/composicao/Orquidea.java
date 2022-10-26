package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Orquidea {
    //1 - Criar vari�vel nome usada na Classe Teste.
    String nome;
    // 2 - Criar objeto Orqu�dea com par�metro e refer�ncia � vari�vel pr�-declarada.
    Orquidea(String nome) {
        this.nome = nome;
    }
    // 3 - Criar Lista com nome e elementos espec�ficos.
    List<Cor> cores = new ArrayList<>();
    // 4 - Criar m�toodo de intera��o que ser� usado na Classe Teste.
    void adicionarCor (Cor cor) {
        this.cores.add(cor);
        cor.orquideas.add(this);
    }
    // 5 - Criar m�todo que permite a transforma��o de elementos do Array em String
    public  String toString() {
        return nome;
    }
}
