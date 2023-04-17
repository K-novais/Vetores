package VariaveisOperadores;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
	
    float n1,n2,n3,n4,media;
		
		Scanner  leia = new Scanner(System.in);

		n1 = 10.0f;
		n2 = 8.0f;
		n3 = 7.0f;
		n4 = 7.5f;
		
				
		
		media= (n1+n2+n3+n4)/4;
		
		System.out.println("\nMedia aritmetica: "+media);
		System.out.printf("\nMedia aritmetica: %.1f",media);
		

	}

}
