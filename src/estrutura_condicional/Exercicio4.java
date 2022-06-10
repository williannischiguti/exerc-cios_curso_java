package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Digite a hora inicial: ");
		int horaInicial = sc.nextInt();
		System.out.print("Digite a hora final: ");
		int horaFinal = sc.nextInt();
		int duracaoMaxima = 24;

		if (horaInicial == 0 && horaFinal == 0) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} 
		else if(horaInicial > 23 || horaFinal > 23) {
			System.out.println("O JOGO EXCEDEU O LIMITE DE 24 HORA(S)");
		}
		else if(horaInicial <0 || horaFinal <0) {
			System.out.println("FOI INFORMADO NÚMERO NEGATIVO");
		}
		else if (horaInicial < horaFinal) {
			int duracao = horaFinal - horaInicial;
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		} 
		else if (horaInicial > horaFinal) {
			int duracao = (duracaoMaxima - horaInicial) + horaFinal;
			System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		} 
		else if (horaInicial == horaFinal) {
			System.out.println("O JOGO NÃO TEVE DURAÇÃO MÍNIMA DE 1 HORA");
		}
		
		sc.close();
	}
}
