package Javatech;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
	
	String nome = "Charles";
	int idade = 25, x=10;
	double altura = 1.72; 
	float n1,n2,n3,media;
	
	Scanner  leia = new Scanner(System.in);
	

	System.out.println("nome participante: "+nome);
	System.out.println("idade particiapnte: "+idade +" anos");
	System.out.println("altura participante: "+altura);
	
	System.out.println("entre com a primeira nota: ");
	n1 = leia.nextFloat();
	System.out.println("entre com a segunda nota: ");
	n2 = leia.nextFloat();
	System.out.println("entre com a terceira nota: ");
	n3 = leia.nextFloat();
	
	media= (n1+n2+n3)/3;
	
	System.out.println("\nMedia aritmetica: "+media);
	System.out.printf("\nMedia aritmetica: %.2f",media);
	
	n1 = (float) Math.sqrt(n2);
	// calcula a raiz quadrada//
	n2 = (float) Math.pow(n3,3);
	// calcula a potencia //
	
	x= x % 2;
	
	/* x= 10
	 * estou pegando o valor 10 e jogando pra dentro da variavel X(atribuindo o valor)
	 * x== 10
	 * estou perguntando, comparando.
	 */
	
	
	
	
	
	
	
	
	}

}
