package oo.composicao;

public class UniversidadeTeste {
    public static void main(String[] args) {

        Universidade universidade1 = new Universidade("USP");
        Universidade universidade2 = new Universidade("UFMG");
        Universidade universidade3 = new Universidade("UFMT");

        Campus campus1 = new Campus("Higienópolis");
        Campus campus2 = new Campus("Zona Leste");
        Campus campus3 = new Campus("Boa Esperança");
        Campus campus4 = new Campus("Bosque da Saúde");
        Campus campus5 = new Campus("Coxipó do Ouro");
        Campus campus6 = new Campus("Jardim Aeroporto");

        universidade1.adicionarCampus(campus1);
        universidade1.adicionarCampus(campus2);
        universidade2.adicionarCampus(campus3);
        universidade2.adicionarCampus(campus4);
        universidade3.adicionarCampus(campus5);
        universidade3.adicionarCampus(campus6);

        for (Campus campus : universidade1.unidades) {
            System.out.println();
            System.out.println("A " + universidade1.nome + " conta com o Campus " + campus.nome + ".");
        }
        for (Campus campus : universidade2.unidades) {
            System.out.println();
            System.out.println("A " + universidade2.nome + " conta com o Campus " + campus.nome + ".");
        }
        for (Campus campus : universidade3.unidades) {
            System.out.println();
            System.out.println("A " + universidade3.nome + " conta com o Campus " + campus.nome + ".");
        }
        System.out.println();
        System.out.println("Portanto :");
        System.out.println(universidade1.unidades.get(0).universidades + "--->" + campus1.universidades.get(0).unidades);
        System.out.println(universidade2.unidades.get(0).universidades + "--->" + campus3.universidades.get(0).unidades);
        System.out.println(universidade3.unidades.get(0).universidades + "--->" + campus5.universidades.get(0).unidades);

    }

}
