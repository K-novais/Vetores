package LacoRepeticao;

import java.util.Scanner;

public class Exc5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num = 0, soma = 0;
		
		do {
			
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			
			if (num > 0) {
			soma = soma + num;
				
			}
		}   while (num != 0);
		
		System.out.println("A soma dos numeros positivos é: "+ soma);
		
	}
}	
		
		
		

	
		
     
		
		
		