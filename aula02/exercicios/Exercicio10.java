package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, cont;

        System.out.println("Digite o valor:");
        numero = teclado.nextInt();
      
        cont = 0;
        while(cont < 11) {
            System.out.printf("%d x %2d = %2d\n", numero, cont, numero * cont);
            cont++;
        }

        teclado.close();
    }
}
