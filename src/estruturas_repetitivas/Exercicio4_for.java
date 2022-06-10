package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio4_for {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número para calcular o fatorial: ");
		int N = sc.nextInt();
		
		int fatorial = 1;
		for (int i=1; i<=N; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}
}
