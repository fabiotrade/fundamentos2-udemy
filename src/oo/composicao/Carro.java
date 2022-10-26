package oo.composicao;

public class Carro {
	/*Nessa composição temos um relacionamento unidirecional
	 * em que um carro aponta para um motor e 
	 * temos um relacionamento um pra um.*/
	Motor motor = new Motor();
	/*Aqui o objeto Motor foi declarado e inicializado
	 * como objeto de instância.*/
	
	void acelerar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	void frear() {
		if(motor.fatorInjecao > 0.5) {
		/*Acima, caso os giros não estjam acima de
		 * 0.5, não será feita a frenagem, dessa
		 * forma evitamos "giros negativos".*/
			motor.fatorInjecao -=0.4;
		/*Acima, caso os giro seja superior a 
		 * 0.5 é feita a "frenagem", que é 
		 * o decremento de 0.4 no valor do giro.*/
		}
	}
	void ligar() {
		motor.ligado = true;
	/*Esse método é o primeiro a ser usado, caso
	 * contrário outros métodos resultarão
	 * em "false" após a execução do código.*/
	}
	void desligar() {
		motor.ligado = false;
	}
	boolean estaLigado() {
		return motor.ligado;
	}

}
