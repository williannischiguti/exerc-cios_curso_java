package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o valor de A: ");
		int A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		int B = sc.nextInt();
		
		if (A > B && A % B == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		}
		else if (B > A && B % A == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		}
		else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}
		
		sc.close();	
	}

}
