package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	/*significa que cada "Curso" (Objeto Curso logo abaixo)
	 * criado ter� sua pr�pria Lista de alunos, pois,
	 * essa vari�vel ArrayList que � uma vari�vel de
	 * inst�ncia, � do tipo "final", dessa forma, 
	 * "Curso" sempre apontar� para esse "List<Aluno>*/
	final String nome;
	
	Curso(String nome){/*Construtor impl�cito da Classe.*/
		this.nome = nome;
	}
	final List<Aluno> alunos = new ArrayList<>();
	/*Acima criamos um ArrayList de nome Aluno
	 * contendo alunos. Quando determinamos que 
	 * um ArrayList � do tipo "final" quer dizer
	 * que seu conte�do pode mudar, o que n�o 
	 * pode mudar � seu endere�o de mem�ria*/
	
	/*Objetivo do m�todo abaixo � permitir que "aluno"
	"chame" o "curso" e vice versa(rela��o bidirecional)*/
	void adicionarAluno (Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
		/*Acima criamos um m�todo com retorno void
		 * como nome adicionarAluno e par�metros
		 * "Aluno aluno". Usamos a palavrka reservada
		 * this e a nota��o "." para chamar o conte�do
		 * do ArrayList chamado Aluno e contendo
		 * alunos, e novamente a nota��o "." para 
		 * chamar o m�todo add. para adicionar 
		 * "aluno". Depois o par�metro aluno chama
		 * cursos, que chama adicionar this, ou seja
		 * � uma rela��o bidirecional*/
		
	}
	public String toString() {
		return nome;
	}

}
