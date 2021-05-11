package exercicios.exercicio03;

public class AppPessoa {
    public static void main(String[] args) {
        // Pessoa p = new Pessoa("Ana", "112345678"); // Pessoa é abstrata
        // Estudante e = new Estudante("Ricardo", "15987654", "Administração");
        // Professor prof = new Professor("Renata", "987654", 2000);

        Pessoa p1 = new Estudante("Ricardo", "15987654", "Administração");
        Pessoa p2 = new Professor("Renata", "987654", 2000);

        // Estudante e = (Estudante) p1;

        // System.out.println(p);
        System.out.println(p1.getTipo());
        System.out.println(p1);
        System.out.println(p2.getTipo());
        System.out.println(p2);
    }
}
