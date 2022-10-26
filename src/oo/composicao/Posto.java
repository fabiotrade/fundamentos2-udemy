package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Posto {
    String nome;
    Posto (String nome){

        this.nome = nome;
    }
    List<Motorista> motoristas = new ArrayList<>();

    void adicionarMotorista(Motorista motorista) {
        this.motoristas.add(motorista);
        motorista.postos.add(this);
    }
    public String toString() {
        return nome;
    }


}
