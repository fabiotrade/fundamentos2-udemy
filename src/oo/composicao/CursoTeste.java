package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		Aluno aluno4 = new Aluno("Paulo");
		Aluno aluno5 = new Aluno("José");
		Aluno aluno6 = new Aluno("César");
		
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Rust 2022");
		Curso curso3 = new Curso("React Native");
		/*Agora que já temos os objetos instanciados
		 * podemos determinar o relacionamento 
		 * entre os objetos.*/
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno4);
		curso3.adicionarAluno(aluno5);
		curso3.adicionarAluno(aluno6);
		
		
		for (Aluno aluno : curso1.alunos) {
			System.out.println();
			System.out.println("Estou matriculado no curso  "
		+ curso1.nome + "..." );
			System.out.println(" e o meu nome é " + aluno.nome + ".");
			
		}
		for (Aluno aluno : curso2.alunos) {
			System.out.println();
			System.out.println("Estou matriculado no curso  "
		+ curso2.nome + "..." );
			System.out.println(" e o meu nome é " + aluno.nome + ".");
			
		}
		for (Aluno aluno : curso3.alunos) {
			System.out.println();
			System.out.println("Estou matriculado no curso  "
		+ curso3.nome + "..." );
			System.out.println(" e o meu nome é " + aluno.nome +".");
			
		}
		System.out.println();
		System.out.println("Portanto, temos a seguinte correlação entre cursos e alunos:");
		System.out.println(aluno1.cursos.get(0).alunos + "--->" + curso1.alunos.get(0).cursos);
		System.out.println(aluno3.cursos.get(0).alunos + "--->" + curso2.alunos.get(0).cursos);
		System.out.println(aluno5.cursos.get(0).alunos + "--->" + curso3.alunos.get(0).cursos);
		/*Para que o método acima funcione
		 * precisamos implementar o método
		 * "public String toString" na Classe Aluno.
		 * Esse método retorna uma String que representa
		 * o Objeto solicitado. Sem esse método recebemos
		 * códigos "não legíveis" que representam
		 * os Objetos solicitados. */
		@SuppressWarnings("unused")
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		System.out.println();
		
	}

}
