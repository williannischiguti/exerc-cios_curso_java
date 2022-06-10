package exceptions.exercise.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import exceptions.exercise.entities.Account;
import exceptions.exercise.exceptions.DomainException;

public class Progam {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		Account account = new Account(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			account.withdraw(amount);
			System.out.printf("New balance: %.2f", account.getBalance());
		} 
		catch (InputMismatchException e) {
			System.out.println("Invalid format! Must be a number!");
		}

		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();
	}

}
