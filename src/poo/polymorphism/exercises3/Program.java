package poo.polymorphism.exercises3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List <TaxPayer> listTaxPayer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			sc.nextLine();
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char taxType = sc.nextLine().charAt(0);
			
			if (taxType == 'i') {
				
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("Did the individual have health expenses (s/n)? ");
				char charIndividual = sc.next().charAt(0);
				double healthExpenditures = 0.0;
				
				if (charIndividual == 'n') {
					healthExpenditures = 0.0;
				}
				if (charIndividual == 's') {
					System.out.print("Health expenditures: ");
					healthExpenditures = sc.nextDouble();
				}
				
				listTaxPayer.add(new Individual (name, anualIncome, healthExpenditures));
			}
			
			else if (taxType == 'c') {
				
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				listTaxPayer.add(new Company (name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		double sum = 0.0;
		
		for (TaxPayer taxPayer : listTaxPayer) {
			sum += taxPayer.tax();
			System.out.printf(taxPayer.getName() + ": $ " + 
			String.format("%.2f%n", taxPayer.tax()));
		}
		
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		sc.close();
	}
}
