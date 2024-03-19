package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int indice = 13;
		int soma = 0;
		int k = 0;

		while (k < indice) {
			k = k + 1;
			soma = soma + k;
			System.out.print(k + " - ");
		}
		System.out.println();
		System.out.println("Soma dos valores: " + soma);

		sc.close();

	}

}
