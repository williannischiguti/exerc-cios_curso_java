package estruturas_repetitivas;

import java.util.Scanner;
import java.util.Locale;


public class Exercicio3_for {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantas vezes quer calcular a MP de 3 valores: ");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			System.out.print("Digite o primeiro valor: ");
			double valor1 = sc.nextDouble();
			System.out.print("Digite o segundo valor: ");
			double valor2 = sc.nextDouble();
			System.out.print("Digite o terceiro valor: ");
			double valor3 = sc.nextDouble();
			
			double mediaPonderada = ((2.0*valor1) + (3.0*valor2) + (5.0*valor3)) / 10;
			System.out.printf("Cálculo da(s) média(s) ponderada(s): %.1f%n", mediaPonderada);	
		}
		sc.close();
	}
}
