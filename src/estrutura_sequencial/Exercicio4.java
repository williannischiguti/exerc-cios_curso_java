package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int workedHours = sc.nextInt();
		double valueHour = sc.nextDouble();
		double salary = workedHours * valueHour;
		
		System.out.printf("NUMBER = %d%n", number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
	}

}
