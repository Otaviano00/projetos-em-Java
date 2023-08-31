package entities;

import java.util.Scanner;

public class Product1 {
	private Scanner sc = new Scanner(System.in);
	public String name;
	public int quantity;
	public double value;

	public double totalValueInStock() {
		return quantity * value;

	}

	public void addProduct() {
		int quantity;
		System.out.printf("%nEnter the number of products to be added in stock: ");
		quantity = Integer.parseInt(sc.nextLine());
		this.quantity += quantity;
	}

	public void removeProduct() {
		int quantity;
		System.out.printf("%nEnter the number of products to be removed int stock: ");
		quantity = Integer.parseInt(sc.nextLine());
		this.quantity -= quantity;
	}

	public String toString() {
		return "\nProduct data: " + name + ", $ " + String.format("%,.2f", value) + ", " + quantity
				+ " units, Total value: $ " + String.format("%,.2f", totalValueInStock());
	}
}
