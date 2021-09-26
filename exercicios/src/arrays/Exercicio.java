package arrays;

import java.util.Arrays;



public class Exercicio {

	
	public static void main(String[] args) {
		
		
		
		double [] notasAlunoA = new double [4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
				
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		} 
		
	   System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 8.8;
		double [] notasAlunoB = {6.9, notaArmazenada, 7.7, 10};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB = notasAlunoB[i];
			
		}
	
	  System.out.println(totalAlunoB / notasAlunoB.length); // pegar o tamanho total do array
	  System.out.println(notasAlunoA[0]); // pegar elemento do indice 0 do array
	  System.out.println(notasAlunoA[10]); // pegar elemento do indice que não existe VAI DAR ERRO
	  System.out.println(notasAlunoA[notasAlunoA.length - 1]);  // pegar ultimo elemento do array
	  
	}
	
	
	
	}
	
	
	

	
	
