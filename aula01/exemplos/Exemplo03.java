import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //warning
        String nome;

        System.out.println("Digite o seu nome:");
        nome = entrada.nextLine(); // entrada.nextDouble();
        System.out.println("Olá " + nome);

        entrada.close();
    }
}
