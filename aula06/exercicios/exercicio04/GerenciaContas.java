import java.util.ArrayList;

public class GerenciaContas {
    private ArrayList<Conta> contas;

    public GerenciaContas() {
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
/*         ContaCorrente cc = null;
        cc = new ContaCorrente(numeroConta);
        contas.add(cc); */
        contas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        contas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        contas.add(new ContaPoupanca(numeroConta));
    }

    public boolean fazerDeposito(int numeroConta, double valor) {
        for (Conta objConta : contas) {
            if (objConta.getNumero() == numeroConta) {
                if (objConta.deposito(valor)) {
                    return true;
                } else {
                    return false; // não conseguiu fazer o depósito
                }
            }
        }
        return false; // não achou a conta
    }

    public boolean fazerSaque(int numeroConta, double valor) {
        for (Conta objConta : contas) {
            if (objConta.getNumero() == numeroConta) {
                if (objConta.saque(valor)) {
                    return true;
                } else {
                    return false; // não conseguiu fazer o depósito
                }
            }
        }
        return false; // não achou a conta
    }

    public String exibirSaldo(int numeroConta) {
        for (Conta objConta : contas) {
            if (objConta.getNumero() == numeroConta) {
                return objConta.toString();
            }
        }
        return "Conta não encontrada";
    }


}
