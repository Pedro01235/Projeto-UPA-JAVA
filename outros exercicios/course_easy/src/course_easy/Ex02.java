package course_easy;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2) Faça um programa que:
		// * - Leia a cotação do dólar
		// * - Leia um valor em dólares
		// * - Converta esse valor para Real
		// * - Mostre o resultado

		Scanner sc = new Scanner(System.in);

		double dolar, real, cotacaoDolar, resultado;

		System.out.println("Cotação do dolar ");
		cotacaoDolar = sc.nextDouble();

		System.out.println("Digite um valor em DOLAR");
		dolar = sc.nextDouble();

		real = cotacaoDolar * dolar;
		resultado = real;

		System.out.println("Resultado da conversão " + resultado);

	}

}
