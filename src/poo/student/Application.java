package poo.student;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name of the student: ");
		student.name = sc.nextLine();
		
		System.out.print("Note 1: ");
		student.note1 = sc.nextDouble();
		System.out.print("Note 2: ");
		student.note2 = sc.nextDouble();
		System.out.print("Note 3: ");
		student.note3 = sc.nextDouble();
		
		if (student.sumNotes() >= 60) {
			student.approved();
		}
		else
			student.disapproved();
		
		
		
		sc.close();
	}

}
