package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor de X: ");
		int x = sc.nextInt();
		System.out.print("Informe o valor de y: ");
		int y = sc.nextInt();
		System.out.printf("SOMA = %d%n", x + y);

		sc.close();
	}

}
