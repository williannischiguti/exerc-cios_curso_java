package estrutura_condicional;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio5 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("CÓDIGO    ESPECIFICAÇÃO    PREÇO");
		System.out.println("   1      Cachorro Quente  R$ 4.00");
		System.out.println("   2      X-Salada         R$ 4.50");
		System.out.println("   3      X-Bacon          R$ 5.00");
		System.out.println("   4      Torrada simples  R$ 2.00");
		System.out.println("   5      Refrigerante     R$ 1.50");
		
		System.out.println("");
		System.out.print("Digite o código do item: ");
		int codigo = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		System.out.println("");
		
		String produto1 = "Cachorro Quente";
		String produto2 = "X-Salada";
		String produto3 = "X-Bacon";
		String produto4 = "Torrada simples";
		String produto5 = "Refrigerante";
		
		double precoCodigo1 = 4.0;
		double precoCodigo2 = 4.50;
		double precoCodigo3 = 5.0;
		double precoCodigo4 = 2.0;
		double precoCodigo5 = 1.50;
		double total = 0;
		
		switch (codigo) {
		case 1:
			total = quantidade * precoCodigo1;
			System.out.printf("%d %s, total: R$ %.2f%n",quantidade, produto1, total);
			break;		
		case 2:
			total = quantidade * precoCodigo2;
			System.out.printf("%d %s, total: R$ %.2f%n",quantidade, produto2, total);
			break;
		case 3:
			total = quantidade * precoCodigo3;
			System.out.printf("%d %s, total: R$ %.2f%n",quantidade, produto3, total);
			break;
		case 4:
			total = quantidade * precoCodigo4;
			System.out.printf("%d %s, total: R$ %.2f%n",quantidade, produto4, total);
			break;
		case 5:
			total = quantidade * precoCodigo5;
			System.out.printf("%d %s, total: R$ %.2f%n",quantidade, produto5, total);
			break;
		default:
			System.out.println("Valor inválido!");
			break;
		}
		System.out.println("Fim da compra!");
		sc.close();
	}

}
