package cursojava.executavel;

import cursojava.classes.AlunoList;
import cursojava.classes.DisciplinaList;

public class ArrayVetorList {
	
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
	   
	   System.out.println("Aluno.:" + alunolist.getNome() + " está matriculado na faculdade :" + alunolist.getNomeEscola());
	   System.out.println(" ");
	   //percorrendo a lista de disciplinas
	   for(DisciplinaList disciplina : alunolist.getDisciplinas()) {
		  
		  System.out.println(" ");
		  System.out.println("---------Disciplina do Aluno---------");
		  System.out.println(" ");
		  System.out.println("Disciplina..:"+disciplina.getDisciplina());
		  System.out.println(" ");
		  System.out.println("Nota da disciplina.:");
		  System.out.println(" ");
		  
		  //descobrindo a maior Nota dentro do Array
		  double notaMax = 0.0;
		  double notaMin = 0.0;
		  
		  for(int pos = 0 ; pos < disciplina.getNota().length ; pos++ ){
			  System.out.println("Nota :" + pos +  " = " + disciplina.getNota()[pos]);
			  
			  if ( pos == 0 ) {
				  notaMax = disciplina.getNota()[pos];
			  }else{
				  if (disciplina.getNota()[pos] > notaMax) {
					 notaMax = disciplina.getNota()[pos]; 					  
				  }
			  }
			  
			  //descobrindo a menor nota dentro do array
			  if ( pos == 0 ) {
				  notaMin = disciplina.getNota()[pos];
			  }else{
				  if (disciplina.getNota()[pos] < notaMin) {
					 notaMin = disciplina.getNota()[pos]; 					  
				  }
			  }			  
		  }
		  System.out.println(" ");
		  System.out.println("A maior nota da disciplina "+ disciplina.getDisciplina() + " é =" + notaMax);	   
		  System.out.println("A menor nota da disciplina "+ disciplina.getDisciplina() + " é =" + notaMin);
	     
		  
	   
	   
	   
	   }
	   
	}
	
	
	

}
