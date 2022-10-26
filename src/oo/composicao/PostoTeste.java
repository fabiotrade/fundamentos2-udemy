package oo.composicao;

public class PostoTeste {
    public static void main(String[] args) {

        Posto posto1 = new Posto("Adulteradinho");
        Posto posto2 = new Posto("Gasolina Batizada");
        Posto posto3 = new Posto("Zika Diesel");

        Motorista motorista1 = new Motorista("Fernando");
        Motorista motorista2 = new Motorista("Ciro");
        Motorista motorista3 = new Motorista("Felipe");
        Motorista motorista4 = new Motorista("Lúcio");
        Motorista motorista5 = new Motorista("Paulo");
        Motorista motorista6 = new Motorista("Renato");


        posto1.adicionarMotorista(motorista1);
        posto1.adicionarMotorista(motorista2);

        posto2.adicionarMotorista(motorista3);
        posto2.adicionarMotorista(motorista4);

        posto3.adicionarMotorista(motorista5);
        posto3.adicionarMotorista(motorista6);
        /*>>>----------> OU <----------<<<*/
        /*motorista1.adicionarPosto(posto1);
        motorista2.adicionarPosto(posto1);

        motorista3.adicionarPosto(posto2);
        motorista4.adicionarPosto(posto2);

        motorista5.adicionarPosto(posto3);
        motorista6.adicionarPosto(posto3);*/


        for (Motorista motorista : posto1.motoristas) {
            System.out.println("Este é o posto " + posto1.nome + "...utilizado pelo " + motorista.nome + ".");
            System.out.println();
        }
        for (Motorista motorista : posto2.motoristas) {
            System.out.println("Este é o posto " + posto2.nome + "...utilizado pelo " + motorista.nome + ".");
            System.out.println();

        }
        for (Motorista motorista : posto3.motoristas) {
            System.out.println("Este é o posto " + posto3.nome + "...utilizado pelo " + motorista.nome + ".");
            System.out.println();

        }

        System.out.println(posto1.motoristas.get(0).postos + "--->" + motorista1.postos.get(0).motoristas);
        System.out.println(posto2.motoristas.get(0).postos + "--->" + motorista3.postos.get(0).motoristas);
        System.out.println(posto3.motoristas.get(0).postos + "--->" + motorista5.postos.get(0).motoristas);


    }

}
