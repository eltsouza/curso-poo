package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class ClasseJavaToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Nome do aluno.");
		String idade = JOptionPane.showInputDialog("Idade do aluno.");
    	String dataNascimento = JOptionPane.showInputDialog("Data nascimento do aluno.");
        String nota1 = JOptionPane.showInputDialog("Nota 1.");
        String nota2 = JOptionPane.showInputDialog("Nota 2.");
        String nota3 = JOptionPane.showInputDialog("Nota 3.");
        String nota4 = JOptionPane.showInputDialog("Nota 4.");
    	
		aluno.setNome(nome);
		aluno.setDataNascimento(dataNascimento);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setDataNascimento(dataNascimento);
		aluno.setIdade(Integer.valueOf(idade));    	
	  //aluno.getDisciplina().setNota1(Double.parseDouble(nota1));
	  //aluno.getDisciplina().setNota2(Double.parseDouble(nota2));
	  //aluno.getDisciplina().setNota3(Double.parseDouble(nota3));
	  //aluno.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		System.out.println(aluno.toString()); // toString descrição do objeto na memoria.
		System.out.println("Média do aluno.:" + aluno.getMediaNota()); 
		System.out.println("Resultado..:" + aluno.getAlunoAprovado2()); 
		
		
		//aluno = new Aluno();
		//System.out.println(aluno.toString()); // toString descrição do objeto na memoria.
		

	}

}
