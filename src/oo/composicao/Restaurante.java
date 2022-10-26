package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    String nome;

    Restaurante(String nome) {

        this.nome = nome;
    }

    List<Shopping> shoppings = new ArrayList<>();

    void adicionarShopping(Shopping shopping) {
        this.shoppings.add(shopping);
        shopping.restaurantes.add(this);
    }

    public String toString() {
        return nome;
    }


}
