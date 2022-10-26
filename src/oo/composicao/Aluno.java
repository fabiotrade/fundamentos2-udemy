package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	/*Abaixo temos o construtor ímplicito da Classe "Aluno"
	 * gerando o objeto "Aluno"*/

	Aluno(String nome) {
		this.nome = nome;
	}/*Abaixo temos uma lista instanciada com o
	tipificadpr "final", isso significa que não podemos
	modificar seu endereço de memória.*/
	final List<Curso> cursos = new ArrayList<>();
	
	/*Abaixo criamos um método para termos um relacionamento
	bidirecional, da mesmo forma em que na classe curso,
	 nesse método	aluno adiciona curso e curso
	 adiciona aluno, o objetivo é, na Classe Teste
	 podermos imprimir através de chamadas
	através de notação"." e dessa forma facilitar o trabalho
	final*/
	void adicionarCurso (Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}/*Abaixo temos outro método para obter o curso a 
	partir do nome e que mostra o curso
	a que "pertence" ao Aluno */
	Curso obterCursoPorNome(String nome) {
		for(Curso curso : this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome))
				return curso;
		}
		return null;
	}
	/*A função "toString" é usada para transformar
	 * um objeto em formato não primitivo string
	 * dessa forma a impressão fica melhor*/
	public String toString() {
		return nome;
		
	}

}
