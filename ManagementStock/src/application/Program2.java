package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product1;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product1 product = new Product1();
		
		System.out.println("- Enter a product -");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Value: ");
		product.value = Double.parseDouble(sc.nextLine());
		System.out.print("Quantity: ");
		product.quantity = Integer.parseInt(sc.nextLine());
		
		System.out.println(product);
		product.addProduct();
		System.out.println(product);
		product.removeProduct();
		System.out.println(product);
		
		
		sc.close();
	}

}
