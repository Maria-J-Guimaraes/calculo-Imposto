package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class calculoImposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario para calulo do imposto: ");
		
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario == 0.0 || salario <= 2000.0) {
			System.out.println("Isento");
		}
		else if (salario > 2000.01 && salario <= 3000.0) {
			imposto = 1000.00 * 0.08;
			System.out.printf("O valor á pagar é R$ %.2f%n", imposto);
		}
		else if (salario > 3000.01 && salario <= 4500.0) {
			imposto = ( 1000 * 0.08) + ((salario - 3000.0) * 0.18);  
			System.out.printf("O valor á pagar é R$ %.2f%n", imposto);
		}
		else if (salario >= 4500.01){
			imposto = (1000.0 * 0.08) + (1500.0 * 0.18) + ((salario - 4500.0) * 0.28);
			System.out.printf("O valor á pagar é R$ %.2f%n", imposto);
		}		
		
		sc.close();
	}

}
