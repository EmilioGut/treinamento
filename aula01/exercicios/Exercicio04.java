
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, valorKw, valorTotal, valorComDesconto;
        int qtdeKwConsumida;

        //Entrada
        System.out.println("Informe o valor do salário:");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Informa a quantidade de KW consumida:");
        qtdeKwConsumida = entrada.nextInt();

        //Processamento
        valorKw = salarioMinimo / 500;
        valorTotal = valorKw * qtdeKwConsumida;
        valorComDesconto = valorTotal * 0.85;

        //Saída
        System.out.println("Valor por Kw: " + valorKw);
        System.out.println("Valor a ser pago: " + valorTotal);
        System.out.println("Valor com desconto: " + valorComDesconto);

        entrada.close();
    }
}
