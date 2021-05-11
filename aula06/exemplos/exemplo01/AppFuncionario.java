package exemplos.exemplo01;


public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Arnaldo", 1000);
        Gerente g = new Gerente("Marcelo", 1000, 10);

        f.aumentaSalario(10);
        g.aumentaSalario(10);
        System.out.println(f.exibir());
        System.out.println(g.exibir());

        System.out.println("----");
        System.out.println(f.toString());
        System.out.println(g);
    }
}
