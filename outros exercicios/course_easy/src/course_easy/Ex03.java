package course_easy;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	 3) Faça um programa para pagamento de comissão de vendedores de peças,
		//	 *	levando-se em consideração que sua comissão será de 5% do total da venda 
		// *	e que você tem os seguintes dados:
		// * 	- Identificação do vendedor
		// * 	- Código da peça
		//	 * 	- Preço unitário da peça
		// * 	- Quantidade vendida

		
				Scanner sc = new Scanner (System.in);
				
				int id, codigo, qtdeVendida;
				double preco, valorComissao, porcentagemComissao;
				
				porcentagemComissao = 0.05;
				
				System.out.println("Digite seu ID 'Vendedor'");
				id = sc.nextInt();
				
				System.out.println("Digite o 'codigo' da peça!");
				codigo = sc.nextInt();
				
				System.out.print("Digite o preço da peça: ");
				preco = sc.nextFloat();
				
				System.out.println("Digite a quantidade de peça vendida! ");
				qtdeVendida = sc.nextInt();
				
				valorComissao = (preco * qtdeVendida) * porcentagemComissao;
				
				System.out.println("Sua comissão foi de " + valorComissao);
				
				
		
	}

}
