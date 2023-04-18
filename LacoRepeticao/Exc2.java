package LacoRepeticao;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		
		 
		Scanner ler = new Scanner(System.in);
		
		
		int num = 0, quantPar =0, quantImpar= 0,i;
		
		for (i = 1; i <=10; i++) {
		
		System.out.printf("Digite %d numero: ",i);
		num = ler.nextInt();
		}
		
		if(num % 2 == 0 ) {
			quantPar++;
			
		}	else {
				quantImpar++;
				
			}
			
		
		System.out.println("Quantidades de números pares;"+quantPar);
		System.out.println("Quantidades de números impares;"+quantImpar);
		
		}
		
	  
	}	
		


		




