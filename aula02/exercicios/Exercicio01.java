package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite o numero:");
        numero = teclado.nextInt();

        if (numero > 20) {
            System.out.println("Metade: " + ((double) numero / 2)); // casting
        }

        teclado.close();
    }
}
