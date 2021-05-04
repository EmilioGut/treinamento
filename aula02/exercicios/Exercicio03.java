package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2;

        System.out.println("Digite o primeiro valor:");
        num1 = entrada.nextDouble();
        System.out.println("Digite o segundo valor:");
        num2 = entrada.nextDouble();

        if (num1 > num2) {
            // System.out.println("Resposta: " + num1 + "; " + num2);
            System.out.printf("Resposta: %.1f; %.1f\n" , num1, num2);
        } else {
            // System.out.println("Resposta: " + num2 + "; " + num1);
            System.out.printf("Resposta: %.1f; %.1f\n" , num2, num1);
        }

        entrada.close();
    }
}