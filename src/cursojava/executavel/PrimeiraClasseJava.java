package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
	
		//objeto ainda não existe na memória. 
		//Aluno aluno1;
		
		String nome = JOptionPane.showInputDialog("Nome do aluno.");
		String idade = JOptionPane.showInputDialog("Idade do aluno.");
    	String dataNascimento = JOptionPane.showInputDialog("Data nascimento do aluno.");
		
		//Agora temo um objeto real na memória;
		Aluno aluno2 = new Aluno(); /* Aqui é o Elton */
		
		//aluno2.nome = "Elton José de Souza";
		aluno2.setNome(nome);
		aluno2.setDataNascimento(dataNascimento);
		aluno2.setIdade(Integer.valueOf(idade));
		
		aluno2.setNomeMae("Amelia Aparecida de Souza");
		aluno2.setNomePai("Jose Reinaldo de Souza");
		
		//aluno2.getDisciplina().setNota1((90));
		//aluno2.getDisciplina().setNota2((80.8));
		//aluno2.getDisciplina().setNota3((70.9));
		//aluno2.getDisciplina().setNota4((90.7));		
		
		System.out.println("Nome do aluno..:" + aluno2.getNome());
		System.out.println("Data Nascimento:" + aluno2.getDataNascimento());
		System.out.println("Idade do Aluno.:" + aluno2.getIdade());
		System.out.println("Nome da Mãe....:" + aluno2.getNomeMae());
		System.out.println("Nome do Pai....:" + aluno2.getNomePai());
		System.out.println("===================================================");
		System.out.println("A média do aluno é.:" + aluno2.getMediaNota());
		System.out.println(aluno2.getAlunoAprovado2());
		System.out.println(aluno2.getAlunoAprovado());
		System.out.println("Resultado.:" + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

		
		//Aluno aluno3 = new Aluno(); /* Aqui é o Helen */
		
		//Aluno aluno4 = new Aluno("Alex"); /* Aqui é o Alex com construtor padrao */
		
		//Aluno aluno5 = new Aluno("Aninha", 8);
		
		

	}

}
