package LacoRepeticao;

import java.util.Scanner;

public class Exc4 {

    public static void main(String[] args) {
    	
    	int idade,genero,cat,npb=0,nmf=0,nhm40=0,nmdf30=0;
    	String  escolha = "S";
    	
    	Scanner ler = new Scanner(System.in);
    	
    	while(escolha.equalsIgnoreCase("S")) {
    		System.out.println("\nDigite sua idade: ");
    		idade = ler.nextInt();
    		System.out.println("\nDigite o seu genero: ");
    		System.out.println("\n1--Masculino\n2--Feminino\n3--não se aplica: ");
    		genero = ler.nextInt();
    		System.out.println("\nDigite a categoria: ");
    		System.out.println("\n1--BackEnd\n2--FrontEnd\n3--Mobile\n4--FullSteck: ");
    		cat = ler.nextInt();
    		
    		System.out.println("\nDeseja continuar? (S-Sim/ N-Não)");
    		escolha = ler.next();
    		
    	if(cat==1) {
    		npb++;
    	    }
    	
    		if(genero==2 && cat == 2) {
    		 nmf++;
    		
    	     }
    	
    	     if(idade > 40 && genero ==1 && cat==3) {
    	     nhm40++;
    	    	 
    	     }
    	     
             if(idade > 30 && genero ==2 && cat==4) {      
    	     nmdf30++;  
    	
            }
             
             System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+npb);
             System.out.println("\nTotal de mulheres desenvolvedoras Frontend: "+nmf);
             System.out.println("\nTotal de homensdesenvolvedores Mobile maiores de 40 anos: "+nhm40);
             System.out.println("\nTotal de mulheres desenvolvedoras menores de 30 anos Fullsteck: "+nmdf30);
             
             
             
     }
    	
    }
}
	
	
	
	
	

