package exercicios.exercicio04;

public class AppConta {
    public static void main(String[] args) {
        ContaPoupanca c = new ContaPoupanca(12345);

        ContaPoupanca.setTaxa(0.1);

        if(c.deposito(100)){
            System.out.println("Depósito realizado");
        }else{
            System.out.println("Falha na operação");
        }
        System.out.println(c);

        if(c.saque(50)){
            System.out.println("Saque realizado");
        }else{
            System.out.println("Falha na operação");
        }
        System.out.println(c);
        
    }
}
