package poo.employee;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine() ;
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();

		System.out.printf("Employee: %s, $ %.2f ", emp.name, emp.grossSalary);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double incSalary = sc.nextDouble();
		emp.increaseSalary(incSalary);
				
		System.out.println();
		System.out.println("Updated data: " + emp);
	
		sc.close();
	}

}
