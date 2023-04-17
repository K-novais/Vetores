package LacosCondicionais;

import java.util.Scanner;

public class Exc3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner  leia = new Scanner(System.in);
		
		String nome = "João da Silva";
		int idade = 62;
		String nome2 = "Maria dos Anjos";
		int idade2 = 50;
		String nome3 = "Fábio Camões";
		int idade3 = 14;
		String nome4 = "Pedro Souza";
		int idade4 = 68;
		boolean PrimeiraDoacao;
		
		System.out.println("Digite seu nome: ");
		leia.nextLong();
		System.out.println("Digite sua idade: ");
	    leia.nextInt();
		System.out.println("Primeira doação de sangue? (SIM ou NÃO): ");
		PrimeiraDoacao = leia.nextBoolean();
		
		if (idade >= 18 && idade <= 59) {
            System.out.println(" está Apto para doar sangue.");
        } else if (idade >= 60 && idade <= 69 && !PrimeiraDoacao) {
            System.out.println(" está Apto para doar sangue.");
        } else {
            System.out.println(" Não está Apto para doar sangue.");
        }
		
		
		
	
		
		
		
		
		
		
		
		

	}

}