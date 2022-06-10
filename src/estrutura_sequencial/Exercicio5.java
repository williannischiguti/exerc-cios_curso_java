package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int part1 = sc.nextInt();
		int partnumber1 = sc.nextInt();
		double unitaryValue1 = sc.nextDouble();
		double valuePart1 = partnumber1 * unitaryValue1; 
		int part2 = sc.nextInt();
		int partnumber2 = sc.nextInt();
		double unitaryValue2 = sc.nextDouble();
		double valuePart2 = partnumber2 * unitaryValue2;
		double total = valuePart1 + valuePart2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
