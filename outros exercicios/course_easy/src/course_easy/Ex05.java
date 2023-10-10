package course_easy;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		
		// CALCULADORA SIMPLES. 
		
		
		
		Scanner sc = new Scanner(System.in);

		double n1, n2, soma, subtracao, div, multiplicao;
		int escolha;

		System.out.println("Escolha qual operação deseja realizar!");
		System.out.println("Adição");
		System.out.println("Subtração");
		System.out.println("Divisão");
		System.out.println("Multiplicação");
		escolha = sc.nextInt();

		System.out.println("Digite o primeiro número");
		n1 = sc.nextInt();

		System.out.println("Digite o segundo  número");
		n2 = sc.nextInt();

		switch (escolha) {

		case 1:
			soma = n1 + n2;
			System.out.println("Resultado da soma =" + soma);
			break;

		case 2:
			subtracao = n1 - n2;
			System.out.println("Resultado da subtração =" + subtracao);
			break;

		case 3:
			div = n1 / n2;
			System.out.println("Resultado da divisão =" + div);
			break;

		case 4:
			multiplicao = n1 * n2;
			System.out.println("Resultado da multiplicação" + multiplicao);
			break;
		default:
			System.out.println("Escolha a operação novamente entre 1 e 4!");
		}
	}

}
