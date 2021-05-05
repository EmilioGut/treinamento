public class Exercicio06 {
    public static void main(String[] args) {
        int valor;
        String retornoTexto;

        valor = 10;

        /* Solução 1 */

        if (ePar(valor)) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
        
        /* Solução 2 */
        
        retornoTexto = verificaParImpar(valor);
        System.out.println(retornoTexto);
    }
    
    /* Solução 1 */

    static boolean ePar(int numero) { 
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }

    /* Solução 2 */

    static String verificaParImpar(int numero) {
        if (numero % 2 == 0) {
            return "O número é par";
        } else {
            return "O número é impar";
        }
    }
}
