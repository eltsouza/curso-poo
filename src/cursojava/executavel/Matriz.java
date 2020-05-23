package cursojava.executavel;

public class Matriz {

	public static void main(String[] args) {
		
		int notas[][] = new int[3][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;

		notas[1][0] = 60;
		notas[1][1] = 50;
		notas[1][2] = 40;
		
		notas[2][0] = 30;
		notas[2][1] = 20;
		notas[2][2] = 10;		

	    //System.out.println(notas);	
	    
	    //percorrer as linhas da matriz
	    for(int poslinha = 0; poslinha < notas.length ; poslinha++) {	    	
          
	    	System.out.println("==========================");
	    	
	    	//para cada linha percorre as colunas da matriz	    	
	    	for(int poscoluna = 0 ; poscoluna < notas[poslinha].length ; poscoluna++) {
	    	
	    	   System.out.println("Valor da Matriz.:" + notas[poslinha][poscoluna]);
	    		
	    	}
	    	
	    }

	}

}
