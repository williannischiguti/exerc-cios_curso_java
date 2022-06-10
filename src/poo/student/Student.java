package poo.student;

public class Student {
	
	String name;
	double note1;
	double note2;
	double note3;
	
	public double sumNotes() {
		return this.note1 + this.note2 + this.note3;
	}
	
	public void approved() {
		System.out.printf("FINAL GRADE = %.2f", sumNotes());
		System.out.println();
		System.out.println("PASS");
		
	}
	
	public void disapproved() {
		System.out.printf("FINAL GRADE = %.2f", sumNotes());
		System.out.println();
		System.out.println("FAILED");
		double finalGrade = 60 - sumNotes();
		System.out.printf("Missing %.2f POINTS", finalGrade);
	}

}
