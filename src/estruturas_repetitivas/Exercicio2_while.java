package estruturas_repetitivas;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio2_while {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int codigo = 0;
		
		System.out.println("Código      Descrição");
		System.out.println("  1           Alcool");
		System.out.println("  2           Gasolina");
		System.out.println("  3           Diesel");
		System.out.println("  4           Sair");
		
		while (codigo != 4) {
			System.out.print("Digite o código: ");
			codigo = sc.nextInt();
			if (codigo <= 0 || codigo > 4) {
				System.out.println("Código inválido");
				continue;
			}
			if (codigo == 1) {
				alcool += 1;
			}
			else if (codigo == 2) {
				gasolina += 1;
			}
			else if (codigo == 3) {
				diesel += 1;
			}
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
