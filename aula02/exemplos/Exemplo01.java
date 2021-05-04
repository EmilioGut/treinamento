package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        int valor;

        valor = 7;

        if (valor > 0) {
            System.out.println(valor + " é positivo.");
        } else {
            System.out.println(valor + " é negativo.");
        }

        if (valor % 2 == 0) {
            System.out.println(valor + " é par");
        }else {
            System.out.println(valor + " é impar");
        }

        /*
         * Operador ternário:
         * 
         * int r = (valor > 0)? 1 : 2;
         * 
         * if( valor > 0){ r = 1; }else{ r = 2; }
         */

        System.out.println("Final do programa.");
    }
}