package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class ClasseDisciplina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Nome do aluno.");
		String idade = JOptionPane.showInputDialog("Idade do aluno.");
    	String dataNascimento = JOptionPane.showInputDialog("Data nascimento do aluno.");
    	
    	String disciplina1 = JOptionPane.showInputDialog("Disciplina 1.");
        String nota1 = JOptionPane.showInputDialog("Nota 1.");

        String disciplina2 = JOptionPane.showInputDialog("Disciplina 2.");
        String nota2 = JOptionPane.showInputDialog("Nota 2.");
        
    	String disciplina3 = JOptionPane.showInputDialog("Disciplina 3.");
        String nota3 = JOptionPane.showInputDialog("Nota 3.");
        
    	String disciplina4 = JOptionPane.showInputDialog("Disciplina 4.");
        String nota4 = JOptionPane.showInputDialog("Nota 4.");
    	
		aluno.setNome(nome);
		aluno.setDataNascimento(dataNascimento);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setDataNascimento(dataNascimento);
		aluno.setIdade(Integer.valueOf(idade));    	
	//	aluno.getDisciplina().setNota1(Double.parseDouble(nota1));
	//	aluno.getDisciplina().setNota2(Double.parseDouble(nota2));
	//	aluno.getDisciplina().setNota3(Double.parseDouble(nota3));
	//	aluno.getDisciplina().setNota4(Double.parseDouble(nota4));
		
	//	aluno.getDisciplina().setDisciplina1(disciplina1);
	//	aluno.getDisciplina().setDisciplina2(disciplina2);
    // aluno.getDisciplina().setDisciplina3(disciplina3);
    // aluno.getDisciplina().setDisciplina4(disciplina4);		
		
		System.out.println(aluno.toString()); // toString descrição do objeto na memoria.
		System.out.println("Média do aluno.:" + aluno.getMediaNota()); 
		System.out.println("Resultado..:" + aluno.getAlunoAprovado2()); 
		
		
		//aluno = new Aluno();
		//System.out.println(aluno.toString()); // toString descrição do objeto na memoria.
		

	}

}
