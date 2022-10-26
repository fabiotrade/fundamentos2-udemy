package oo.composicao;

public class SelecaoTeste {

    public static void main(String[] args) {

        Torcedor torcedor1 = new Torcedor("Pedro");
        Torcedor torcedor2 = new Torcedor("João");
        Torcedor torcedor3 = new Torcedor("Sílvio");

        Selecao selecao1 = new Selecao("Alemanha");
        Selecao selecao2 = new Selecao("Argentina");
        Selecao selecao3 = new Selecao("Brasil");

        selecao1.adicionarTorcedor(torcedor1);
        selecao2.adicionarTorcedor(torcedor2);
        selecao3.adicionarTorcedor(torcedor3);

        /*torcedor1.adicionarSelecao(selecao1)
         *
         *torcedor2.adicionarSelecao(selecao2)
         *
         *torcedor3.adicionarSelecao(selecao3)*/

        for (Torcedor torcedor : selecao1.torcedor) {

            System.out.println("Meu nome é " + torcedor1.nome + " e torço para a seleção da " +selecao1.nome + ".");
            System.out.println();
            System.out.println("Meu nome é " + torcedor2.nome + " e torço para a seleção da " +selecao2.nome + ".");
            System.out.println();
            System.out.println("Meu nome é " + torcedor3.nome + " e torço para a seleção da " +selecao3.nome + ".");

        }
        System.out.println("Tetra campeã mundial --> " + selecao1.torcedor.get(0).selecao);
        System.out.println("Bi-campeã mundial --> " + selecao2.torcedor.get(0).selecao);
        System.out.println("Penta campeã mundial --> " + selecao3.torcedor.get(0).selecao);



    }

}
