package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.print("Enter with the number of people");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite a altura");
			vect[i] = sc.nextDouble();

		}

		double sum=0.0;

		for (int i = 0; i < n; i++) {
			sum += vect[i];

		}
		
		System.out.println("the sum is "+ sum);
		
		double average = sum/n;
		
		System.out.println("The average is "+ average);
		
		sc.close();
	}
}
