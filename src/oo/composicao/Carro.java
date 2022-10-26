package oo.composicao;

public class Carro {
	/*Nessa composi��o temos um relacionamento unidirecional
	 * em que um carro aponta para um motor e 
	 * temos um relacionamento um pra um.*/
	Motor motor = new Motor();
	/*Aqui o objeto Motor foi declarado e inicializado
	 * como objeto de inst�ncia.*/
	
	void acelerar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	void frear() {
		if(motor.fatorInjecao > 0.5) {
		/*Acima, caso os giros n�o estjam acima de
		 * 0.5, n�o ser� feita a frenagem, dessa
		 * forma evitamos "giros negativos".*/
			motor.fatorInjecao -=0.4;
		/*Acima, caso os giro seja superior a 
		 * 0.5 � feita a "frenagem", que � 
		 * o decremento de 0.4 no valor do giro.*/
		}
	}
	void ligar() {
		motor.ligado = true;
	/*Esse m�todo � o primeiro a ser usado, caso
	 * contr�rio outros m�todos resultar�o
	 * em "false" ap�s a execu��o do c�digo.*/
	}
	void desligar() {
		motor.ligado = false;
	}
	boolean estaLigado() {
		return motor.ligado;
	}

}
