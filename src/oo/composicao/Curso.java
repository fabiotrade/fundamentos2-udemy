package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	/*significa que cada "Curso" (Objeto Curso logo abaixo)
	 * criado terá sua própria Lista de alunos, pois,
	 * essa variável ArrayList que é uma variável de
	 * instância, é do tipo "final", dessa forma, 
	 * "Curso" sempre apontará para esse "List<Aluno>*/
	final String nome;
	
	Curso(String nome){/*Construtor implícito da Classe.*/
		this.nome = nome;
	}
	final List<Aluno> alunos = new ArrayList<>();
	/*Acima criamos um ArrayList de nome Aluno
	 * contendo alunos. Quando determinamos que 
	 * um ArrayList é do tipo "final" quer dizer
	 * que seu conteúdo pode mudar, o que não 
	 * pode mudar é seu endereço de memória*/
	
	/*Objetivo do método abaixo é permitir que "aluno"
	"chame" o "curso" e vice versa(relação bidirecional)*/
	void adicionarAluno (Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
		/*Acima criamos um método com retorno void
		 * como nome adicionarAluno e parâmetros
		 * "Aluno aluno". Usamos a palavrka reservada
		 * this e a notação "." para chamar o conteúdo
		 * do ArrayList chamado Aluno e contendo
		 * alunos, e novamente a notação "." para 
		 * chamar o método add. para adicionar 
		 * "aluno". Depois o parâmetro aluno chama
		 * cursos, que chama adicionar this, ou seja
		 * é uma relação bidirecional*/
		
	}
	public String toString() {
		return nome;
	}

}
