package entities;

import java.util.Scanner;
import util.Utilities;

public class Product {
	public String name;
	public double value;
	public int quantity;
	
	public void addProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" - Add Product -");
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Value ");
		value = Double.parseDouble(sc.nextLine());
		System.out.print("QUantity: ");
		quantity = Integer.parseInt(sc.nextLine());
		Utilities.clearConsole();
	}
	
	public static int removeProduct(Product[] matriz, int n, int code) {
		
		if (code >= 1 && code <= n) {
			for (int i = (code-1); i <= (n-1); i++) {
				if (i != n) {
					matriz[i].name = matriz[i+1].name;
					matriz[i].quantity = matriz[i+1].quantity;
					matriz[i].value = matriz[i+1].value;
				}
				else {
					matriz[i].name = "---";
					matriz[i].quantity = 0;
					matriz[i].value = 0.00;
				}
			}
			n -= 1;
			return n;
		}
		return n;
	}
	
	public static void listProducts(Product[] matriz, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.printf("[%d] - Name: %s - Value: %.2f - Quantity: %d%n", i, matriz[i-1].name, matriz[i-1].value, matriz[i-1].quantity);
		}
	}
	
	public int totalValueInStock() {
		Scanner sc = new Scanner(System.in);
		int code, code1 = 0;
		do {
			System.out.println("- Total value in stock - ");
			System.out.println("What would you like to do? ");
			System.out.println("[1] - All products");
			System.out.println("[2] - Individuals products");
			System.out.println("[3] - Exit");
			code = Integer.parseInt(sc.nextLine());
			Utilities.clearConsole();
			
			switch (code) {
			case 1:
				code1 = 3;
				break;
			case 2:
				code1 = 3;
				break;
			case 3:
				code1 = 3;
				break;
			default:
				System.out.println("Option not found");
				code1 = Utilities.verify();
				if (code1 == 2) {
					code1 = 3;
					code = 3;
				}
				Utilities.clearConsole();
			}
		} while (code1 != 3);
		return code;
	}
	
	public static void valueAllProducts(Product[] mat, int n) {
		double amount = 0;
		System.out.println("- Value of all products -\n");
		for (int i = 0; i < n; i++) {
			amount += mat[i].value * mat[i].quantity;
		}
		System.out.printf("The total value in stock is $%,.2f", amount);
	}
	
	public static int valueIndividualProduct(Product[] mat, int n) {
		Scanner sc = new Scanner(System.in);
		int code, code1 = 0;
		double amount;
		do {
			System.out.println("- Individual total value of each product - ");
			listProducts(mat, n);
			System.out.print("Choose a product: ");
			code = Integer.parseInt(sc.nextLine());
			if (code >= 1 && code <= n) {
				code--;
				amount = mat[code].value * mat[code].quantity;
				System.out.printf("%nProduct: %s%nUnity value: %,.2f%nQuantity: %d%nTotal value: %,.2f%n", mat[code].name, mat[code].value, mat[code].quantity, amount);
			} 
			else {
				System.out.println("Option not found.");
			}
			code1 = Utilities.verify();
		} while (code1 != 2);
		
		return code1;
	}
}
