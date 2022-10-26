package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 10;
		/*Acima vemos o método construtor do objeto AreaCirc a1
		 * que possui o mesmo nome da CLASSE AreaCirc*/
		
		
		AreaCirc a2 = new AreaCirc(5);
		/*Acima vemos o método construtor do objeto AreaCirc a2
		 * que possui o mesmo nome da CLASSE AreaCirc*/
		//a2.pi = 5;
		
		
		
		System.out.println(a1.area());
		System.out.println(a2.area());
	}

}
