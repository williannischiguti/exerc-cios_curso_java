package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String [] args) {
		
		/*triângulo retângulo que tem A por base e C por altura
		 *círculo de raio C (pi = 3.14159)
		 *trapézio que tem A e B por bases e C por altura
		 *quadrado que tem lado B
		 *retângulo que tem lados A e B*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Calcule a área do triângulo retângulo");
		System.out.println("Calcule a área do círculo");
		System.out.println("Calcule a área do trapézio");
		System.out.println("Calcule a área do quadrado");
		System.out.println("Calcule a área do retângulo");
		System.out.println();
		System.out.println("Informe abaixo os valores de A, B e C: ");
		System.out.println();
		System.out.print("Digite o valor de A: ");
		double A = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		double B = sc.nextDouble();
		System.out.print("Digite o valor de C: ");
		double C = sc.nextDouble();
		System.out.println();
		
		double PI = 3.14159;
		double trianguloRetangulo = (A * C) / 2;
		double circuloRaio = (Math.pow(C, 2)) * PI;
		double areaTrapezio = (A+B) * (C) / 2;
		double areaQuadrado = B * B;
		double areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", trianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", circuloRaio);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
	}
}
