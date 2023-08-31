package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import util.Utilities;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int code, code1, code2 = 0, n = 0;
		Product[] product = new Product[100];
		
		for (int i = 0; i < 100; i++) {
			product[i] = new Product();
		}
		
		do {
			System.out.println("========== Management Stock ==========");
			System.out.println("[1] - Add a product");
			System.out.println("[2] - Remove a product");
			System.out.println("[3] - List products");
			System.out.println("[4] - Total value in Stock");
			System.out.println("[5] - Exit");
			System.out.printf("%nChoose a option: ");
			code = Integer.parseInt(sc.nextLine());
			Utilities.clearConsole();
			
			if (code == 1) {
				n += 1;
			}
			
			if (n == 0 && code == 5) {
				n += 1;
			}
			
			if (n != 0) { 
				switch (code) {
				case 1:
					do {
						product[n-1].addProduct();
						code2 = Utilities.verify();
						if (code2 == 1) {
							n += 1;
						}
					} while (code2 != 2);
					break;
				case 2:
					do { 
						System.out.println("- Remove Products -");
						Product.listProducts(product, n);
						System.out.printf("%nChoose a product to remove: ");
						code1 = Integer.parseInt(sc.nextLine());
						int n1 = n;
						n = Product.removeProduct(product, n, code1);
						if (n1 == n) {
							System.out.println("You choose a wrong number.");
						}
						code2 = Utilities.verify();
						if (n == 0) {
							code2 = 2;
						}
					} while (code2 != 2);
					break;
				case 3:
					System.out.println("- List of Products -");
					Product.listProducts(product, n);
					System.out.printf("%nPress enter to continue%n");
					sc.nextLine();
					break;
				case 4:
					do {
						int code3 = product[n-1].totalValueInStock();
						if (code3 == 1) {
							Product.valueAllProducts(product, n);
							code2 = Utilities.verify();
						}
						else if (code3 == 2) {
							code2 = Product.valueIndividualProduct(product, n);
						}
						else {
							code2 = 2;
						}
					} while (code2 != 2);
					break;
				case 5:
					break;
				default:
					System.out.println("Option not founded");
					code2 = Utilities.verify();
					if (code2 == 2) {
						code = 5;
					}
					// make a function which ask the client if he wants or not to try again and continue the program
					break;
				}
			}
			else {
				System.out.println("There is no products on the stock.");
				code2 = Utilities.verify();
				if (code2 == 2) {
					code = 5;
				}
				// make a function witch ask the client with it wants or not to try again and continue the program
			}
			Utilities.clearConsole();
		} while (code != 5);
		Utilities.clearConsole();
		System.out.println("Goodbye!");
		sc.close();
	}
	
}
