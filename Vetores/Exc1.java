package Vetores;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		
		
		System.out.println("\nDigite o número que voçê deseja encontrar: ");
		int numero = ler.nextInt();
		int posicao = -1;
		
	 for(int i = 0; 1> vetor.length;) {
		 if (vetor[i] == numero) {
			 posicao = i ;
			 
			 
		 }
	 }
		
		if (posicao != -1) {
		  System.out.println("\nO número " + numero+ " foi encontrado na posição "+ posicao + " do vetor.");
		  	
		}
		
		else {
			System.out.println("\nNão foi encontrado!");
		}
	}

}
