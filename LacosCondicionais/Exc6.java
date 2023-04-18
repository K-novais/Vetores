package LacosCondicionais;

import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		 
		Scanner ler = new Scanner(System.in);
		
		int quant = 0,codigo = 0;
		double valorTotal;
		float salarioLiquido;
		
		
		System.out.println("\nCargos");
		System.out.println("\n1 - Gerente - 10%");
		System.out.println("\n2 - Vendedor - 7% ");
		System.out.println("\n3 - Supervisor - 9%");
		System.out.println("\n4 - Motorista - 6%");
		System.out.println("\n5 - Estoquista - 5%");
		System.out.println("\n6 - Técnico de TI - 8%");
		
		switch(codigo) {
		case 1:
			valorTotal = quant 10000,00;
			System.out.println("\nJoão da Silva "+valorTotal);
			break;
	//	case 2:
		//	valorTotal = quant * 15;
		//	System.out.println("\nX-Salada - Valor Total: R$ "+valorTotal);
		//	break;
	//	case 3:
		//	valorTotal = quant * 18.30f;
		//	System.out.println("\nX-Bacon - Valor Total: R$ "+valorTotal);
		//	break;
	//	case 4:
		//	valorTotal = quant * 12;
		//	System.out.println("\nBauru - Valor Total: R$ "+valorTotal);
		//	break;
	//	case 5:
	//		valorTotal = quant * 8;
		//	System.out.println("\nRefrigerante - Valor Total: R$ "+valorTotal);
	//		break;
	//	case 6:
	//		valorTotal = quant * 13;
		//	System.out.println("\nSuco de Laranja - Valor Total: R$ "+valorTotal);
		//	break;
		//default:
			System.out.println("\nCódigo Inválido!!!");
		}

	}

	private static double quant(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
