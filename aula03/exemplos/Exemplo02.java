
public class Exemplo02 {

    public static void main(String[] args) {
        int t = 5;

        linha2(25);
        System.out.println("Sistema de cadastro v1.0");
        linha();
        System.out.println("Menu");
        linha2(t);
        linha3(10, '*');
        linha3(15, '_');
    }


    static void linha() { // void == vazio, nada
        System.out.println("---------------------------");
    }

    static void linha2(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void linha3(int tamanho, char tipo) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(tipo);
        }
        System.out.println();
    }

}
