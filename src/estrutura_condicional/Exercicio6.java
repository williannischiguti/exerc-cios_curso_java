package estrutura_condicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		// Ler o intervalo de ([0,25], [25,50], [50,75], [75,100])
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite um número: ");
		double numero = sc.nextDouble();
		System.out.println(numero);
		
		if (numero >= 0.0 && numero <= 25.0) {
			System.out.println("Intervalo (0, 25)");
		}
		else if (numero > 25.0 && numero <= 50.0) {
			System.out.println("Intervalo (25, 50)");
		}
		else if (numero > 50.0 && numero <= 75.0) {
			System.out.println("Intervalo (50, 75)");
		}
		else if (numero > 75.0 && numero <= 100.0) {
			System.out.println("Intervalo (75, 100)");
		}
		else {
			System.out.println("Fora do intervalo");
		}
		
		sc.close();
	}

}
