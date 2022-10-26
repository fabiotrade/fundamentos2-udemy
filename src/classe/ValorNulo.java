package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!!"));
		
		Data d1 = Math.random()> 0.5 ? new Data():null ;
		/*Math,random gera um número aleatório entre 0 e 1
		 * nesse caso, se o número for maior do que 0.5
		 * a função Math.random cria um valor, caso contrário não.*/
		d1.mes = 3;
		
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		String s2 = Math.random() > 0.5? "Opa" : null;
		
		if(s2 != null) {
		    System.out.println(s2.concat("????"));
		    /*Observação: quando uma variável é inicializada
		     * como nula, não podemos acessar seus atributos
		     * ou métodos, se fizermos isso teremos um erro
		     *  em Run Time execution, ou seja, o programa
		     *  nem compila.*/
		}
		
	}

}
