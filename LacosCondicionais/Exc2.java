package LacosCondicionais;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		
	
		 Scanner  ler = new Scanner(System.in);
		
	   int num;
		
		 System.out.println("\nInforme um numero: ");
		 num = ler.nextInt();
		 
	   if (num % 2 == 0) {	 
		  System.out.println("O número é par"); 
	   }
	   else {
           System.out.println("O número é impar");
       }
 
	   if (num >= 0) {
           System.out.println("O número é positivo");
       } else {
           System.out.println("O número é negativo");
       }
		
		
		
		
		
	}

}
