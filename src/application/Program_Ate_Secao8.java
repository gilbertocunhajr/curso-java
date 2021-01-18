// Classes est�ticas - exerc�cio de convers�o dolar em reais
/*
 * Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda
que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma classe CurrencyConverter
para ser respons�vel pelos c�lculos
 * 
 */

package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program_Ate_Secao8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cota��o do d�lar: ");
		double cotacaoDolar = sc.nextDouble();
		System.out.print("Quantos d�lares quer comprar? ");
		double quantDolar = sc.nextDouble();
		double valorPagar = CurrencyConverter.valorPagar(cotacaoDolar, quantDolar);
		System.out.printf("Valor a pagar em reais: %.2f%n",valorPagar);
		
	}
}


// Classes est�ticas - c�culo de circunfer�ncia e volume

/* package aplication;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

	}
}

 * Exerc�cio 3 - Avalia��o do aluno
 * 
 * package aplication;
 * 
 * import java.util.Locale; import java.util.Scanner; import entities.Student;
 * 
 * public class Program {
 * 
 * public static void main(String[] args) {
 * 
 * Locale.setDefault(Locale.US); 
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * Student student = new Student();
 * 
 * System.out.println("Enter student data: "); 
 * System.out.print("Name: ");
 * student.name = sc.nextLine();
 * 
 * System.out.print("Grade 1: "); 
 * student.grade1 = sc.nextDouble();
 * 
 * System.out.print("Grade 2: "); 
 * student.grade2 = sc.nextDouble();
 * 
 * System.out.print("Grade 3: "); 
 * student.grade3 = sc.nextDouble();
 * 
 * System.out.println();
 * 
 * 
 * System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
 * 
 * if (student.finalGrade() < 60.0) { System.out.println("FAILED");
 * System.out.printf("MISSING %.2f POINTS%n", student.missingPoints()); } else {
 * System.out.println("PASS"); }
 * 
 * sc.close();
 * 
 * } }
 * 
 */

// Exerc�cio 2 - sal�rio do empregado

/*
 * package aplication;
 * 
 * import java.util.Locale; import java.util.Scanner; import entities.Employee;
 * 
 * 
 * public class Program {
 * 
 * public static void main(String[] args) {
 * 
 * Locale.setDefault(Locale.US); 
 * Scanner sc = new Scanner(System.in); 
 * Employee emp = new Employee();
 * 
 * System.out.println("Enter employee data: "); 
 * System.out.print("Name: ");
 * emp.name = sc.nextLine();
 * 
 * System.out.print("Gross salary: "); 
 * emp.grossSalary = sc.nextDouble();
 * 
 * System.out.print("Tax: "); 
 * emp.tax = sc.nextDouble();
 * 
 * System.out.println(); 
 * System.out.println("Employee: " + emp);
 * System.out.println();
 * 
 * System.out.print("Which percentage to increase salary?"); double percentage =
 * sc.nextInt(); emp.increaseSalary(percentage); System.out.println();
 * 
 * System.out.println("Updated data: " + emp);
 * 
 * sc.close(); } }
 */