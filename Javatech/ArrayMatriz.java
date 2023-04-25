package Javatech;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[][] numeros = new int[3][3];
		int linha,coluna = 0,somaNumeros= 0;
		
		for(linha=0;linha<3;linha++) {
			System.out.println("\nEntre com o numero:");
			numeros[linha][coluna] = ler.nextInt();
			somaNumeros += numeros[linha][coluna];
			
			
		}
		System.out.println("\nValor da linha 1 e coluna 2: "+numeros[1][2]);		
	}
    
}
