package exercicios.exercicio03;

public abstract class Pessoa { // classe modelo, não pode instanciar objetos
    private String nome, telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + ", " + telefone;
    }

    // um método abstract é obrigatório
    public abstract String getTipo();
    
}
