package ColecaoSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exc2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite um numero: ");
		int n =  leia.nextInt();
		
		Boolean ver;
		ver = numeros.contains(n);
		
		if(ver == true) {
			System.out.println("\nNumero Encontrado! ");
			
		}
		else {
			System.out.println("\nNumero  não Encontrado! ");
		}
         
	}

}
