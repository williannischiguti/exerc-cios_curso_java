package arrays_lists.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program_v2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Employee_v2> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println();
			sc.nextLine();
			
			System.out.printf("Employee #%d:%n", i + 1);
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee_v2 emp = new Employee_v2(id, name, salary);
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee ID that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		Integer pos = position(list, idSalary);
		
		if (pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		System.out.println();
		
		System.out.println("List of employees: ");
		
		for (Employee_v2 emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}

	public static Integer position(List<Employee_v2> list, int id) { // função para ver a posição do ID na lista
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId (List<Employee_v2> list, int id) {
		Employee_v2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
