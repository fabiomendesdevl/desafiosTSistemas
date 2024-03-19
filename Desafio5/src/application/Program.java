package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os caracteres 'String': ");
        String caracter = scanner.nextLine();

        String reservada = inverterString(caracter);

        System.out.println("String invertida: " + reservada);
    }

    public static String inverterString(String str) {
        StringBuilder reservada = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reservada.append(str.charAt(i));
        }
        return reservada.toString();
    }
}