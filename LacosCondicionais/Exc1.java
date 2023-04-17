package LacosCondicionais;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a1= 2,a2 =2,a3=2;
		int b1= 4,b2 =2,b3=2;
		int c1= 5,c2 =5,c3=4;
	
		
		int soma1 = a1 + b1;
		int soma2 = a2 + b2;
		int soma3 = a3 + b3;
		
	if (soma1 > c1) {
		System.out.println("\nA soma de A + B é maior que c");
		soma1 = leia.nextInt();
		
	  }
		
	else if (soma2 < c2) {
	   System.out.println("\nA soma de A + B é menor que c");
	   soma2 = leia.nextInt();
		

	  }

	else {
		System.out.println("\nA soma de A + B é igual a c");
	    soma3 = leia.nextInt();
	    
	}
	
 }
 }

