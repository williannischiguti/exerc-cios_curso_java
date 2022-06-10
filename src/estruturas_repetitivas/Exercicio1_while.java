package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio1_while {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int senha = 0;
		
		while (senha != 2002) {
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();
			if (senha != 2002) {
				System.out.println("Senha inválida!");
			}
		}
		System.out.println("Senha correta!");
		
		sc.close();
	}
}
