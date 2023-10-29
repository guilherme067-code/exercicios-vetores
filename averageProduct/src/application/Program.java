package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos produtos deseja adicionar?");

		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do produto: ");
			String name = sc.nextLine();
			System.out.println("Digite o preço ");
			double price = sc.nextDouble();

			vect[i] = new Product(name, price);

		}

		double sum = 0.0;

		for (int i = 0; i < vect.length; i++) {

			sum += vect[i].getPrice();

		}

		double average = sum / n;

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);

		}

		System.out.println("A média dos preço é " + average);

	}

}
