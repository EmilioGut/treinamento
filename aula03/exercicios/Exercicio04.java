
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, pares, somaPares;
        final int QTDE_NUMEROS = 5;

        pares = 0;
        somaPares = 0;

        for (int i = 1; i <= QTDE_NUMEROS; i++) {
            System.out.println("Digite o " + i + "º número: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                pares++;
                somaPares = somaPares + numero;
            }
        }

        if (pares != 0) {
            System.out.println("A média dos pares: " + ((double) somaPares / pares));
        }
        System.out.println("Porcentagem de ímpares: " + ((double) (QTDE_NUMEROS - pares) / QTDE_NUMEROS) * 100 + " %");

        entrada.close();
    }
}
