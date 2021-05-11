package exercicios.exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int numeroConta;
        double limite, valor;
        ArrayList<Conta> contas = new ArrayList<>();

        ContaCorrente cc = null;
        ContaPoupanca cp = null;
        ContaEspecial ce = null;

        do {
            System.out.println("1-Nova conta corrente");
            System.out.println("2-Nova conta especial");
            System.out.println("3-Nova conta poupança");
            System.out.println("4-Realizar depósito");
            System.out.println("5-Realizar saque");
            System.out.println("6-Exibir saldo");
            System.out.println("7-Sair");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    contas.add(cc);
                    break;

                case 2:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite:");
                    limite = teclado.nextDouble();
                    ce = new ContaEspecial(numeroConta, limite);
                    contas.add(ce);
                    break;

                case 3:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    cp = new ContaPoupanca(numeroConta);
                    contas.add(cp);
                    break;

                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor:");
                    valor = teclado.nextDouble();

                    for (Conta objConta : contas) {
                        if (objConta.getNumero() == numeroConta) {
                            if (objConta.deposito(valor)) {
                                System.out.println("Depósito realizado.");
                            } else {
                                System.out.println("Falha na operação.");
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor:");
                    valor = teclado.nextDouble();

                    for (Conta objConta : contas) {
                        if (objConta.getNumero() == numeroConta) {
                            if (objConta.saque(valor)) {
                                System.out.println("Saque realizado.");
                            } else {
                                System.out.println("Falha na operação.");
                            }
                        }
                    }
                    break;

                case 6:
                    System.out.println("Informe o número da conta:");
                    numeroConta = teclado.nextInt();

                    for (Conta objConta : contas) {
                        if (objConta.getNumero() == numeroConta) {
                            System.out.println(objConta);
                        }
                    }

                    break;

                case 7:
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }

        } while (opcao != 7);

        teclado.close();
    }
}
