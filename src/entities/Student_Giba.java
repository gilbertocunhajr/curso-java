package entities;

public class Student_Giba {
	public String name;
	public double test1;
	public double test2;
	public double test3;

	public void result() {
		
		double total = test1+test2+test3;
		
		System.out.print("FINAL GRADE = ");
		System.out.printf("%.2f", total);
		System.out.println();

		if (total>=60.0) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.print("MISSING " + String.format("%.2f", (60.0-total)) + " POINTS" );
		}
	}
}
