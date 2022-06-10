package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String [] args) {
		
		// Fórmula da área: PI* raio ²
		// Considere o valor de PI = 3.14159
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.printf("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double resultado = pi * (Math.pow(raio, 2));
		
		System.out.printf("Resultado = %.4f%n", resultado);
		
		sc.close();
	}
}
