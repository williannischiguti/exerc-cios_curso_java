package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("NÚMERO PAR");
		}
		else {
			System.out.println("NÚMERO IMPAR");
		}
		
		sc.close();
	}

}
