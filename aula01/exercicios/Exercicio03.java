
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        System.out.println("Informe o valor do salário:");
        salario = entrada.nextDouble();

        novoSalario =  salario * 1.25;

        System.out.println("Novo salário: " + novoSalario);

        entrada.close();
    }
}
