/* Modelo */
public class Pessoa {
    // atributos = características
    String nome;
    int idade;
    
    // método construtor =  inicializar os objetos
    Pessoa(String nome, int idade) {
        this.nome = nome; // this = próprio objeto
        this.idade = idade;
    }

    //métodos = ações
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome + " e tenho " + idade + " anos.");
    }
    
}