package oo.composicao;

public class OrquideaTeste {

    public static void main(String[] args) {

        Cor cor1 = new Cor("Branca");
        Cor cor2 = new Cor ("Lilás");
        Cor cor3 = new Cor ("Amarela");
        Cor cor4 = new Cor("Magenta");
        Cor cor5 = new Cor("Pintalgada");
        Cor cor6 = new Cor("Vinho");

        Orquidea orquidea1 = new Orquidea("Phalaenopsis");
        Orquidea orquidea2 = new Orquidea("Cynbidium");
        Orquidea orquidea3 = new Orquidea("Oncidiun");

        orquidea1.adicionarCor(cor1);
        orquidea1.adicionarCor(cor2);
        orquidea2.adicionarCor(cor3);
        orquidea2.adicionarCor(cor4);
        orquidea3.adicionarCor(cor5);
        orquidea3.adicionarCor(cor6);

        for (Cor cor : orquidea1.cores) {
            System.out.println();
            System.out.println("Para o gênero " + orquidea1.nome + " temos as cor : " + cor.nome + ".");
        }
        for (Cor cor : orquidea2.cores) {
            System.out.println();
            System.out.println("Para o gênero  " + orquidea2.nome +" temos a cor " + cor.nome +".");
        }
        for (Cor cor : orquidea3.cores) {
            System.out.println();
            System.out.println("Para o gênero " + orquidea3.nome + " temos a cor : " + cor.nome + ".");
        }
        System.out.println();
        System.out.println("Portanto temos a seguinte correlação entre gêneros e cores:");
        System.out.println();
        System.out.println(orquidea1.cores.get(0).orquideas + "--->" + cor1.orquideas.get(0).cores);
        System.out.println(orquidea2.cores.get(0).orquideas + "--->" + cor3.orquideas.get(0).cores);
        System.out.println(orquidea3.cores.get(0).orquideas + "--->" + cor5.orquideas.get(0).cores);


    }
}
