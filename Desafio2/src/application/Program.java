package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Insira um numero para verificar se esta na sequencia: ");
		int n = sc.nextInt();

		boolean fibonacciSequencia = fibonacci(n);

		if (fibonacciSequencia) {
			System.out.println("O numero [" + n + "] pertence a sequencia da Fibonacci");
		} else {
			System.out.println("O numero [" + n + "] não pertence a sequencia da Fibonacci");
		}
		sc.close();
	}
	//funcao fibonacci
	public static boolean fibonacci(int n) {
		int a = 0;
		int b = 1;

		if (n == a || n == b) {
			return true;
		}

		int soma = a + b;

		// enquanto soma for menor igual a numero
		while (soma <= n) {
			if (soma == n) {
				return true;
			}
			a = b;
			b = soma;
			soma = a + b;
		}
		return false;
	}

}
