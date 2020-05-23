package cursojava.executavel;

import cursojava.classes.AlunoList;
import cursojava.classes.DisciplinaList;

public class ArrayVetorObjetos {
	 
	public static void main(String[] args) {
	
        double[] notas = {8.8,8.7,9.9,10.0};	   
		double[] notas2 = {7.0,5.0,4.0,3.0};

		
       //criacao do aluno	
		AlunoList alunolist = new AlunoList();
	   
	   alunolist.setNome("Elton Jose de Souza");
	   alunolist.setNomeEscola("UNIFG");
	   
	  //criacao da disciplina1	
	   DisciplinaList disciplinaList  = new DisciplinaList();
	   
	   disciplinaList.setDisciplina("Java");	   
	   disciplinaList.setNota(notas);
	   
	   //Adicionando a disciplina1 ao aluno
	   alunolist.getDisciplinas().add(disciplinaList);
	   
	   //criacao da disciplina2	
	   DisciplinaList disciplinaList2  = new DisciplinaList();
	   disciplinaList2.setDisciplina("PLSQL");
	   disciplinaList2.setNota(notas2);
	   
	   //Adicionando a disciplina2 ao aluno
	   alunolist.getDisciplinas().add(disciplinaList2);
	   
	   //--------------------------------------------------------------------------//
	   
	   AlunoList[] arrayAlunos = new AlunoList[1];
	   
	   arrayAlunos[0] = alunolist;
	   
	   for (int pos = 0 ; pos < arrayAlunos.length ; pos ++) {
		   
		  System.out.println("Nome do Aluno.:" + arrayAlunos[pos].getNome());  
		  
		  for (DisciplinaList d : arrayAlunos[pos].getDisciplinas() ) {
			  
			  System.out.println("A disciplina é :" + d.getDisciplina());
			  
			  for(int posnota = 0 ; posnota < d.getNota().length ; posnota ++) {
				  
				  System.out.println("A nota numero :" + posnota + " é igual a :" + d.getNota()[posnota] );
				  
			  }
			  
		  }
		   
		   
	   }
	   
	   
	   
	}
	
	
	

}
