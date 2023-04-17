package Javatech;

import java.util.Scanner;

public class LacoCondicional {
	/*
	 * Operadores Logico (E)
	 * 
	 * Entrada1  Entrada2  Saida
	 * v            v        v
	 * f            f        f 
	 * v            v        f 
	 * f            f        f  
	
	 * 
	 *  * Operadores Logico (OU)
	 * 
	 * Entrada1  Entrada2  Saida
	 * v            v        v
	 * V            f        v 
	 * f            v        v 
	 * f            f        f  
	 */
	

	public static void main(String[] args) {
		
     float n1,n2,n3,media;
     int op;
     
     Scanner  ler = new Scanner(System.in);
     
     System.out.println("\nEntre com a primeira nota: ");
     n1 = ler.nextFloat();
     System.out.println("\nEntre com a segunda  nota: ");
     n2 = ler.nextFloat();
     System.out.println("\nEntre com a terceira nota: ");
     n3 = ler.nextFloat();
     
		
		media = (n1+n2+n3)/3;
		System.out.println("\nA media aritmetica: ");
		System.out.printf("\nA media aritmetica: %.2f",media);
		
// Agora que vem os laços condicionais ou laço de condição//
	
		if(media>=7 && media<=10) {
			System.out.println("\nAlune Aprovde!!!");
	    }

		else if(media>=5 && media<7) {
		    System.out.println("\nAlune Exame!!!");

		}     
		else if(media>=0 && media<5) {
			System.out.println("\nAlune Reprovade");
			
		}
		else {
			System.out.println("\nMedia fora do intervalo!!!");
		
		}
		
// Switch case
		
		System.out.println("\nMenu de elogio!!!");
		System.out.println("\nOpçoes de elogios!!!");
		System.out.println("\n1Todos são muito legais!!!");
		System.out.println("\n2Éssa galera é fera!!!");
		System.out.println("\n3Todos são atores/atrizes!!!");
		System.out.println("\n4Todos estão se ajudando!!!");
		System.out.println("\nEscolha qual elogio quer fazer!!!");
		op = ler.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\nTodos são muito legais!!!");
		    break;
		case 2:
			System.out.println("\nÉssa galera é fera!!!");
		    break;
		case 3:
			System.out.println("\nTodos são atores/atrizes!!!");
		    break;
		case 4:
			System.out.println("\nTodos estão se ajudando!!!");
		    break;
		default:
			System.out.println("\nOpção inválida");
			
		
			
		}
		
		
		
		
	 }


	}		
	
	

		