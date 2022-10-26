package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Campus {


        String nome;

        Campus(String nome) {
            this.nome = nome;
        }

        List<Universidade> universidades = new ArrayList<>();

        void adicionarUniversidade(Universidade universidade) {
            this.universidades.add(universidade);
            universidade.unidades.add(this);
        }

        public String toString() {
            return nome;
        }
    }


