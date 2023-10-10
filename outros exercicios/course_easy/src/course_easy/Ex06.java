package course_easy;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		//Verificador de Números Primos:
		
		Scanner sc = new Scanner (System.in);
		
		int n1, resultado; 
		
		System.out.println("Digite um número");
		n1= sc.nextInt();
		
		if (n1 % 2 == 0) {
			
			System.out.println( + n1 + "  número é primo");
			
		}else
			System.out.println( + n1 + "  número NÃO é primo");

	}

}
