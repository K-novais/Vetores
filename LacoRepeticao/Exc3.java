package LacoRepeticao;

public class Exc3 {
	
	 public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		 
		 int idade, contPessoasMenor = 0, contPessoasMaior = 0 ;
		 
		  System.out.println("Digite a idade: ");
		  idade = leia.nextInt();
		  
		  while(idade >= 0){
		
		  System.out.println("Digite a idade: ");
		  idade = leia.nextInt();
		  
		  if (idade >= 1 && idade < 21);
			  contPessoasMenor++;
			 
			  
			  else  if (idade > 50);
			  contPessoasMaior++;
			  
		
	 }
	 }

	  System.out.println("Total de pessoas menores de 21 anos: "+contPessoasMenor);
	  System.out.println("Total de pessoas menores de 21 anos: "+contPessoasMaior);
	
}
