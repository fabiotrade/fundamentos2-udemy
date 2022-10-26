package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	/*Abaixo temos o construtor �mplicito da Classe "Aluno"
	 * gerando o objeto "Aluno"*/

	Aluno(String nome) {
		this.nome = nome;
	}/*Abaixo temos uma lista instanciada com o
	tipificadpr "final", isso significa que n�o podemos
	modificar seu endere�o de mem�ria.*/
	final List<Curso> cursos = new ArrayList<>();
	
	/*Abaixo criamos um m�todo para termos um relacionamento
	bidirecional, da mesmo forma em que na classe curso,
	 nesse m�todo	aluno adiciona curso e curso
	 adiciona aluno, o objetivo �, na Classe Teste
	 podermos imprimir atrav�s de chamadas
	atrav�s de nota��o"." e dessa forma facilitar o trabalho
	final*/
	void adicionarCurso (Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}/*Abaixo temos outro m�todo para obter o curso a 
	partir do nome e que mostra o curso
	a que "pertence" ao Aluno */
	Curso obterCursoPorNome(String nome) {
		for(Curso curso : this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome))
				return curso;
		}
		return null;
	}
	/*A fun��o "toString" � usada para transformar
	 * um objeto em formato n�o primitivo string
	 * dessa forma a impress�o fica melhor*/
	public String toString() {
		return nome;
		
	}

}
