import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, pares = 0;
        final int TOTAL_NUMEROS = 10;

        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            System.out.printf("Digite o %dº número: ", i);
            numero = entrada.nextInt();
            if(numero % 2 == 0) {
                pares++;
            }
        }

        System.out.println("O total de pares é " + pares);
        System.out.println("O total de impares é " + (TOTAL_NUMEROS - pares));

        entrada.close();
    }
}
