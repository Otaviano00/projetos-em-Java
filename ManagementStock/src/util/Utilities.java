package util;

import java.util.Scanner;

public class Utilities {

	public static void clearConsole() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
	
	public static int verify() {
		Scanner sc = new Scanner(System.in);
		int code, code1 = 1;
		do {
			System.out.println();
			System.out.println("Would you like to continue? ");
			System.out.println("[1] - YES");
			System.out.println("[2] - NO");
			code = Integer.parseInt(sc.nextLine());
			clearConsole();
			
			switch (code) {
			case 1:
				code = 2;
				code1 = 1;
				break;
			case 2:
				code1 = 2;
				break;
			default:
				System.out.println("Option not found.");
				code1 = 2;
				break;
			}
		} while (code != 2);
		
		return code1;
	}

}
