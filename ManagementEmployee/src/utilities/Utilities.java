package utilities;

import java.util.Scanner;

public class Utilities {

	private Scanner sc = new Scanner(System.in);
	
	public void cleanConsole() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
	
	public boolean confirma() {
		int cod1;
		boolean cod2 = true;
		
		do {
			System.out.println("\nVocê quer continuar? [S/N]");
			cod1 = sc.next().toLowerCase().charAt(0);
			if (cod1 == 's') {
				cod2 = true;
			} 
			else if (cod1 == 'n') {
				cod2 = false;
			} 
			else {
				cleanConsole();
				System.out.println("Opção não encontrada.");
				cod2 = confirma();
			}
		} while (cod2 == false && cod2 == true);
		
		cleanConsole();
		
		return cod2;
	}
	
	public boolean confirmaImposto() {
		int cod1;
		boolean cod2 = true;
		
		do {
			System.out.println("\n\nDeseja mudar os impostos? [S/N]");
			cod1 = sc.next().toLowerCase().charAt(0);
			if (cod1 == 's') {
				cod2 = true;
			} 
			else if (cod1 == 'n') {
				cod2 = false;
			} 
			else {
				cleanConsole();
				System.out.println("Opção não encontrada.");
				cod2 = confirma();
			}
		} while (cod2 == false && cod2 == true);
		
		return cod2;
	}

}
