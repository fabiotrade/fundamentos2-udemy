package oo.composicao;

public class SelecaoTeste {

    public static void main(String[] args) {

        Torcedor torcedor1 = new Torcedor("Pedro");
        Torcedor torcedor2 = new Torcedor("Jo�o");
        Torcedor torcedor3 = new Torcedor("S�lvio");

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

            System.out.println("Meu nome � " + torcedor1.nome + " e tor�o para a sele��o da " +selecao1.nome + ".");
            System.out.println();
            System.out.println("Meu nome � " + torcedor2.nome + " e tor�o para a sele��o da " +selecao2.nome + ".");
            System.out.println();
            System.out.println("Meu nome � " + torcedor3.nome + " e tor�o para a sele��o da " +selecao3.nome + ".");

        }
        System.out.println("Tetra campe� mundial --> " + selecao1.torcedor.get(0).selecao);
        System.out.println("Bi-campe� mundial --> " + selecao2.torcedor.get(0).selecao);
        System.out.println("Penta campe� mundial --> " + selecao3.torcedor.get(0).selecao);



    }

}
