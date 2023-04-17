package LacoRepeticao;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, quantPar =0, quantImpar= 0,i;
		
		for (i = 0; i <=10; i++) {
		
		System.out.printf("Digite o %d numero: ",i);
		num = leia.nextInt();
		}
		
		if(num % 2 == 0 ) {
			quantPar++;
			else {
				quantImpar++;
				
			}
			
		}
		
		System.out.println("Total de numeros pares: "+quantPar);
		System.out.println("Total de numeros impares: "+quantImpar);
		
		
		
	}	
		
		
		

	}

}
