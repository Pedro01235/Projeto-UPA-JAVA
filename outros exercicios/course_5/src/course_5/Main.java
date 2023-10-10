package course_5;

import java.util.Scanner;

import applications.Investimento;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		//valor do investimento
		System.out.print("Digite o valor inicial do investimento: ");
        double valorInicial = sc.nextDouble();

        //Taxa de Juros
        System.out.print("Digite a taxa de juros (em porcentagem): ");
        double taxaDeJuros = sc.nextDouble() / 100;

        // Solicita o número de anos
        System.out.print("Digite o número de anos: ");
        int anos = sc.nextInt();

        // Cria um objeto da classe Investimento
        Investimento investimento = new Investimento(valorInicial, taxaDeJuros, anos);

        // Calcula o valor futuro do investimento
        double valorFuturo = investimento.calcularValorFuturo();

        // Exibe o resultado
        System.out.println("O valor futuro do investimento é: " + valorFuturo);
		
		
		
	}

}
