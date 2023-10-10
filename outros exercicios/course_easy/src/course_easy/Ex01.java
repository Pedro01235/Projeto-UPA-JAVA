package course_easy;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CALCULO MÉDIO DE ESTOQUE
		
		
		Scanner sc = new Scanner (System.in);
		
		String nome;
		double qtdeMinima, qtdeMaxima, estoqueMedio;
		
		System.out.println("Digite o nome produto");
		nome = sc.next();
		
		System.out.println("Digite quantidade minima");
		qtdeMinima = sc.nextDouble();
		
		System.out.println("Digite quantidade maxima");
		qtdeMaxima = sc.nextDouble();
		
		
		estoqueMedio = (qtdeMinima + qtdeMaxima) / 2;
		
		
		System.out.println("Total de estoque  de(a) "+ nome +  estoqueMedio);
		
		
	}

}
