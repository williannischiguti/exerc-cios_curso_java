package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio1_for {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		
		for (int i=0; i<x; ++i) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			
		}
		sc.close();
	}
}
