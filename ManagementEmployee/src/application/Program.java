package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import utilities.Utilities;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Utilities util = new Utilities();
		
		int escolha, codigo = 0, quant_emp = 0;
		boolean cod1 = true;
		Employee[] emp = new Employee[100];
		
		for (int i = 0; i < 100; i++) {
			emp[i] = new Employee();
		}
		
		do {
			System.out.println("=========== Management Employee ==========");
			System.out.println("[1] - Contratar");
			System.out.println("[2] - Demitir");
			System.out.println("[3] - Listar funcionários");
			System.out.println("[4] - Mudar salário");
			System.out.println("[5] - Mudar impostos");
			System.out.println("[6] - Sair");
			System.out.print("\nEscolha uma opção: ");
			escolha = sc.nextInt();
			
			if (escolha >= 1 && escolha <= 6) {
				if ((escolha == 2 || escolha == 3 || escolha == 4) && quant_emp == 0) {
					escolha = 0;
				}
				else if (escolha == 1 && quant_emp >= 0) {
					quant_emp += 1;
				}
			}
			else {
				escolha = -1;
			}
			
			util.cleanConsole();
			
			switch (escolha) {
			case -1:
				System.out.println("Opção não encontrada.");
				cod1 = util.confirma();
				if (cod1 == false) {
					codigo = 6;
				}
				break;
			case 0:
				System.out.println("Não há funcionários para executar essa ação.");
				cod1 = util.confirma();
				if (cod1 == false) {
					codigo = 6;
				}
				break;
			case 1:
				do {
					System.out.println("======= Contratar funcionários =======");
					emp[quant_emp-1].contratarFuncionario();
					cod1 = util.confirma();
					if (cod1 == true) {
						quant_emp += 1;
					}
				} while (cod1 != false);
				
				break;
			case 2:
				do {
					System.out.println("======= Demitir funcionários =======");
					Employee.listarEmpregado(emp, quant_emp);
					System.out.print("\nEscolha uma opção: ");
					char sair = sc.next().toLowerCase().charAt(0);
					if (sair == 'x') {
						cod1 = false;
						util.cleanConsole();
					}
					else if (sair != 'x') {
						if (Character.digit(sair, 10) >= 1 && Character.digit(sair, 10) <= quant_emp) {
							int demitir = Character.digit(sair, 10);
							Employee.demitirFuncionario(emp, quant_emp, demitir);
							quant_emp -= 1;
							System.out.println("\nEmpregado demitido.");
						}
						else {
							System.out.println("\nOpção não encontrada.");
						}
						cod1 = util.confirma();
					}
				} while (cod1 != false);
				
				break;
			case 3:
				System.out.println("===== Lista de Funconários ======");
				Employee.listarEmpregado(emp, quant_emp);
				System.out.print("\nAperte X para sair: ");
				char sair = sc.next().toLowerCase().charAt(0);
				if (sair != 'x') {
					System.out.println("\nOpção não encontrada.");
					cod1 = util.confirma();
					if (cod1 == false) {
						codigo = 6;
					}
				}
				util.cleanConsole();
				break;
			case 4:
				do {
					System.out.println("======= Mudar salários =======");
					Employee.listarEmpregado(emp, quant_emp);
					System.out.print("\nEscolha uma opção: ");
					sair = sc.next().toLowerCase().charAt(0);
					if (sair == 'x') {
						cod1 = false;
						util.cleanConsole();
					}
					else if (sair != 'x') {
						if (Character.digit(sair, 10) >= 1 && Character.digit(sair, 10) <= quant_emp) {
							int mudarSal = Character.digit(sair, 10);
							Employee.mudarSalario(emp, (mudarSal-1));
							System.out.println("\nSalário do empregado " + emp[mudarSal-1].nome + " mudado");
						}
						else {
							System.out.println("\nOpção não encontrada.");
						}
						cod1 = util.confirma();
					}
				} while (cod1 != false);
				
				break;
			case 5:
				do {
					System.out.println("======= Mudar imposto =======");
					System.out.printf("Impostos: R$ %,.2f", Employee.imposto );
					cod1 = util.confirmaImposto();
					if (cod1 == true) {
						Employee.mudarImposto();
						System.out.println("\nImposto mudado.");
						cod1 = util.confirma();
					}
					else {
						util.cleanConsole();
					}
				} while (cod1 != false);
				break;
			case 6:
				codigo = 6;
				break;
			default:
				
				break;
			}
			
		} while (codigo != 6);
		
		util.cleanConsole();
		System.out.println("Tudo bem. Obrigado!");
		
		sc.close();
	}

}
