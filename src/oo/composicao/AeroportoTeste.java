package oo.composicao;

public class AeroportoTeste {

    public static void main(String[] args) {

         Aeroporto aeroporto1 = new Aeroporto("Viracopos");
         Aeroporto aeroporto2 = new Aeroporto("Congonhas");
         Aeroporto aeroporto3 = new Aeroporto("Internacional de Guarulhos");

         Operadora operadora1 = new Operadora("Azul Linhas Aéreas");
         Operadora operadora2 = new Operadora("Gol Linhas Aéreas");
         Operadora operadora3 = new Operadora("Latam Linhas Aéreas");
         Operadora operadora4 = new Operadora("Avianca Linhas Aéreas");
         Operadora operadora5 = new Operadora("Lufthansa Linhas Aéreas");
         Operadora operadora6 = new Operadora("Italian Air Lines Linhas Aéreas");
         Operadora operadora7 = new Operadora("Emirates Linhas Aéreas");
         Operadora operadora8 = new Operadora("KLM Linhas Aéreas");
         Operadora operadora9 = new Operadora("Air France Linhas Aéreas");

         aeroporto1.adicionarOperadora(operadora1);
         aeroporto1.adicionarOperadora(operadora2);
         aeroporto1.adicionarOperadora(operadora3);
         aeroporto2.adicionarOperadora(operadora4);
         aeroporto2.adicionarOperadora(operadora5);
         aeroporto2.adicionarOperadora(operadora6);
         aeroporto3.adicionarOperadora(operadora7);
         aeroporto3.adicionarOperadora(operadora8);
         aeroporto3.adicionarOperadora(operadora9);

         for (Operadora operadora : aeroporto1.operadoras) {

             System.out.println();
             System.out.println("No Aeroporto " + aeroporto1 + " temos a operadora " + operadora + ".");
         }
        for (Operadora operadora : aeroporto2.operadoras) {

            System.out.println();
            System.out.println("No Aeroporto " + aeroporto2 + " temos a operadora " + operadora + ".");
        }
        for (Operadora operadora : aeroporto3.operadoras) {

            System.out.println();
            System.out.println("No Aeroporto " + aeroporto3 + " temos a operadora " + operadora +".");
        }
        System.out.println();
        System.out.println("Portanto, temos a seguinte correlação entre Aeroportos e Operadoras: ");
        System.out.println();
        System.out.println(aeroporto1.operadoras.get(0).aeroportos + "--->" + operadora1.aeroportos.get(0).operadoras);
        System.out.println(aeroporto2.operadoras.get(0).aeroportos + "--->" + operadora4.aeroportos.get(0).operadoras);
        System.out.println(aeroporto3.operadoras.get(0).aeroportos + "--->" + operadora7.aeroportos.get(0).operadoras);

    }
}
