package LacoRepeticao;

import java.util.Scanner;

public class Exc3 {
	
	public static void main(String[] args) {
		 
		 Scanner leia = new Scanner(System.in);
		 
		 int idade, Menor21 = 0, Maior50 = 0 ;
		 
		  System.out.println("Digite a idade: ");
		  idade = leia.nextInt();
		  
		  while(idade != -1) {
		  
		  if (idade < 21) {
			  Menor21++;
			 
		  } else  if (idade > 50);
			  Maior50++;
			  
	  }
		  
		  System.out.println("Digite a idade da próxima pessoa (-1 para encerrar):  ");
		  
		  System.out.println("\nTotal de pessoas menores de 21 anos:  "+Menor21);
		  System.out.println("\ntotal de pessoas maiores de 50 anos:  "+Maior50);
	 }


}
