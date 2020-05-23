package cursojava.executavel;

import cursojava.classes.Aluno;

public class ClasseEqualsHashCode {

	public static void main(String[] args) {
	
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Elton");
		aluno1.setNumeroCpf("111.999.888-44");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Elton");
		aluno2.setNumeroCpf("111.909.888-44");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos iguais");
		}else {
			System.out.println("Alunos não são iguais");
		}
			
		
		

	}

}
