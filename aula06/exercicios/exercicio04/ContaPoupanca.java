package exercicios.exercicio04;

public class ContaPoupanca extends Conta{
    private static double taxa; // atributo de classe

    public ContaPoupanca(int numero) {
        super(numero);
    }

    public static void setTaxa(double taxa) {
        if(taxa > 0) {
            ContaPoupanca.taxa = taxa;
        }
    }

    @Override
    public boolean saque(double valor) {
        if(getSaldo() >= valor + taxa) {
            return super.saque(valor + taxa);
        }
        return false;
    }

    @Override
    public String toString() {
        return "CP: " + super.toString() + " - " + taxa;
    }
}
