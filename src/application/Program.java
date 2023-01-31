package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*
	 * A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações
	 * sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o
	 * valor das prestações
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double ValorDeCompra, TotalPrestações;

		System.out.println("Valor de Compra: ");
		ValorDeCompra = sc.nextDouble();
		System.out.println("Total de prestações (Máximo 5)");
		TotalPrestações = sc.nextDouble();

		System.out.println("O valor de cada prestação é R$" + ValorDeCompra / TotalPrestações);

		sc.close();
	}

}
