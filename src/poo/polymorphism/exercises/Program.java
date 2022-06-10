package poo.polymorphism.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();
		String name = null;
		int hours = 0;
		double valuePerHour = 0.0;
		double additionalCharge = 0.0;
		
		System.out.print("Enter the number of employees: ");
		int N = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 1; i<=N; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			if (outsourced == 'n') {
				System.out.print("Name: ");
				name = sc.next();
				System.out.print("Hours: ");
				hours = sc.nextInt();
				System.out.print("Value per hour: ");
				valuePerHour = sc.nextDouble();
				emp.add(new Employee (name, hours, valuePerHour)); 
			}
			if (outsourced == 'y') {
				System.out.print("Name: ");
				name = sc.next();
				System.out.print("Hours: ");
				hours = sc.nextInt();
				System.out.print("Value per hour: ");
				valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();			
				emp.add(new OutsourcedEmployee (name, hours, valuePerHour, additionalCharge));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee employee : emp) {
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
		}
		
		sc.close();
	}
}
