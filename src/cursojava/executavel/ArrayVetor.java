package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	/*executa o codigo*/
	public static void main(String[] args) {
		
		/*Array pode ser de todos os tipos de dados e objetos*/
		
		
		/*Primeiro Exemplo de array*/
		
		/*Array sempre deve ter a quantidade de posicoes definidas*/
		double[] notas = new double[4];
		
		notas[0] = 9.8;
		notas[1] = 8.8;
		notas[2] = 7.8;
		notas[3] = 6.8;
		
		System.out.println("Imprimindo Notas do Array em um loop");
		System.out.println("  ");

		for (int posicao = 0; posicao < notas.length; posicao++) {
	
			System.out.println("Nota "+ (posicao + 1) + " é = "+ notas[posicao]);
			
		}
		
		System.out.println("  ");
		System.out.println("Imprimindo Notas 1 a 1 do Array");
		System.out.println("  ");
		System.out.println("Nota 1 = "+notas[0]);
		System.out.println("Nota 2 = "+notas[1]);
		System.out.println("Nota 3 = "+notas[2]);
		System.out.println("Nota 4 = "+notas[3]);
				
		System.out.println("--------------------------------------------------------------------------- ");

		/*Segundo Exemplo de array*/

		String posicoes = JOptionPane.showInputDialog("Qauntas posições o Array deve ter ? ");
		
		double[] notas1 = new double[Integer.parseInt(posicoes)];
		
		for(int pos = 0; pos < notas1.length ; pos++) {
			
		  String valor = JOptionPane.showInputDialog("Qual o valor da posicao "+ pos);
		  notas1[pos] = Double.valueOf(valor);
			
		}

		for (int pos1 = 0; pos1 < notas1.length; pos1++) {
			
			System.out.println("Nota "+ (pos1 + 1) + " é = "+ notas1[pos1]);
			
		}		
		System.out.println("-------------------------------------------------------------------------- ");

		/*Terceiro Exemplo de array*/

		double[] valores = {9.5, 8.9,7.9};
		
		/*Quarto Exemplo de array*/
		
		String[] valores1 = new String[4];
		valores1[0] = "Elton";
		valores1[1] = "90";
		valores1[2] = "Curso de Java";
		valores1[3] = "Ja sou programador PLSQL";
		
        for (int pos2 = 0; pos2 < valores1.length; pos2++) {
			
			System.out.println("O valor na posicao "+ (pos2 + 1) + " é = "+ valores1[pos2]);
			
		}	
		
	}

}
