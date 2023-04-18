package LacoRepeticao;

import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, qtdNum = 0;
		float  media = 0, soma = 0;
		
		do {
			System.out.println("\nDigite um numero: ");
			num = leia.nextInt();
			
			if(num % 3 == 0 && num != 0) {
				soma += num;
				qtdNum++;
				media = soma / qtdNum;
			}
		}while ( num != 0 );
		
		System.out.println("A média de todos os números que são múltiplos de 3 é: "+media);
		
		}
		
		
	}


