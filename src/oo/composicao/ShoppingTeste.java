package oo.composicao;

public class ShoppingTeste {

    public static void main(String[] args) {

        Shopping shopping1 = new Shopping("Goiabeiras");
        Shopping shopping2 = new Shopping("Três Américas");
        Shopping shopping3 = new Shopping("Pantanal");

        Restaurante restaurante1 = new Restaurante("Serra");
        Restaurante restaurante2 = new Restaurante("Pizza na Pedra");
        Restaurante restaurante3 = new Restaurante("Habib's");
        Restaurante restaurante4 = new Restaurante("Subway");
        Restaurante restaurante5 = new Restaurante("Spolleto");
        Restaurante restaurante6 = new Restaurante("Jin Jin");

        shopping1.adicionarRestaurante(restaurante1);
        shopping1.adicionarRestaurante(restaurante2);
        shopping2.adicionarRestaurante(restaurante3);
        shopping2.adicionarRestaurante(restaurante4);
        shopping3.adicionarRestaurante(restaurante5);
        shopping3.adicionarRestaurante(restaurante6);

        for (Restaurante restaurante : shopping1.restaurantes) {
            System.out.println();
            System.out.println("No Shopping " + shopping1.nome + " temos o restaurante " + restaurante.nome);
        }
        for (Restaurante restaurante : shopping2.restaurantes) {
            System.out.println();
            System.out.println("No Shopping " + shopping2.nome + " temos o restaurante " + restaurante.nome);
        }
        for (Restaurante restaurante : shopping3.restaurantes) {
            System.out.println();
            System.out.println(" No Shopping " + shopping3.nome + " temos o restaurante " + restaurante.nome);
        }
        System.out.println();
        System.out.println("Portanto, temos a seguinte correlação entre Shoppings e Restaurantes:");
        System.out.println();
        System.out.println(shopping1.restaurantes.get(0).shoppings + "--->" + restaurante1.shoppings.get(0).restaurantes);
        System.out.println();
        System.out.println(shopping2.restaurantes.get(0).shoppings + "--->" + restaurante3.shoppings.get(0).restaurantes);
        System.out.println();
        System.out.println(shopping3.restaurantes.get(0).shoppings + "--->" + restaurante5.shoppings.get(0).restaurantes);

    }


}
