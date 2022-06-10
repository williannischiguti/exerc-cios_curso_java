package poo.rentRoom;
//criar um vetor que vai de 0 a 9
//variável N que representa a quantidade de alunos
//para cada registro de aluguel, informar nome,  e-mail do estudante e o quarto que ele escolheu

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room [] vect = new Room[10];
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Rent #%d:%n", i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			vect [roomNumber] = new Room(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
			
		sc.close();
	}

}