package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
				
		
		var d2 = new Data(31, 12, 2020);
			
		
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		/*O formato acima permite o uso desse código em
		 * aplicações web.*/
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		/*O formato acima permite um uso mais restrito
		 * do código, apenas no console ou desktop applications*/
		
	}

}
