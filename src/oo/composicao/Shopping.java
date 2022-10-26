package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
    String nome;

    Shopping(String nome) {
        this.nome = nome;
    }

    List<Restaurante> restaurantes = new ArrayList<>();

    void adicionarRestaurante(Restaurante restaurante) {
        this.restaurantes.add(restaurante);
        restaurante.shoppings.add(this);
    }

    public String toString() {
        return nome;
    }


}
