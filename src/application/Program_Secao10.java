package application;

import java.util.Scanner;

public class Program_Secao10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num_linhas = sc.nextInt();
		int num_colunas = sc.nextInt();
		
		int[][] mat = new int[num_linhas][num_colunas];
		
		for (int i=0; i<num_linhas; i++) {
			for (int j=0; j<num_colunas; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();

		for (int i=0; i<num_linhas; i++) {
			for (int j=0; j<num_colunas; j++) {
				if (mat[i][j]==number) {
					System.out.println("Position " + i + "," + j + ":");
					
					if (j>0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i>0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j<(num_colunas-1)) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i<(num_linhas-1)) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					
						
				}
			}
		}
		
		
		sc.close();
	}
}



/* package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		
		sc.close();
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class Program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
	
		Rent[] vect = new Rent[10];
		
		for (int i = 1; i <=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			System.out.println("Room");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i]!=null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}
}

*/



/*package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		sc.close();
	}
}
*/