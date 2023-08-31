package entities;

import java.util.Scanner;

public class Employee {
	private static Scanner sc = new Scanner(System.in);
	public String nome;
	public double salarioBruto, salarioLiquido; 
	public static double imposto;
	
	public void contratarFuncionario() {
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		salarioBruto = Double.parseDouble(sc.nextLine());
	}
	
	public static void demitirFuncionario(Employee[] emp, int quant_emp, int demitir) {
		for (int i = demitir-1; i < quant_emp; i++) {
			if (i != quant_emp - 1) {
				emp[i].nome = emp[i+1].nome;
				emp[i].salarioBruto = emp[i+1].salarioBruto;
				emp[i].salarioLiquido = emp[i+1].salarioLiquido;
			}
		}
	}
	
	public static void mudarSalario(Employee[] emp, int mudarSal ) {
		System.out.print("\nDigite o novo salário do funcionário " + emp[mudarSal].nome + ": R$");
		emp[mudarSal].salarioBruto = Double.parseDouble(sc.nextLine());
	}
	
	public static void mudarImposto() {
		System.out.print("\nDigite o novo imposto: R$ ");
		imposto = Double.parseDouble(sc.nextLine());
	}
	
	public static void listarEmpregado(Employee[] emp, int quant_emp) {
		for (int i = 0; i <= quant_emp; i++) {
			if (i != quant_emp) {
				System.out.println(toString(emp, i));
			}
			else {
				System.out.println("[X] - Sair");
			}
		}
	}
	
	public static String toString(Employee[] emp, int i) {
		emp[i].salarioLiquido = emp[i].salarioBruto - imposto;
		return "["+(i+1)+"] - Empregado: " + emp[i].nome + " - Salário Bruto: R$" + String.format("%,.2f", emp[i].salarioBruto) + " - Salário Líquido: R$" + String.format("%,.2f", emp[i].salarioLiquido) ;
	}
}
