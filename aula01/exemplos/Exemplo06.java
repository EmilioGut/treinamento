public class Exemplo06 {
    public static void main(String[] args) {
        int valor = 10;
        final int TAXA_DE_VENDA = 10; // constante

        valor = 12;
        // TAXA_DE_VENDA = 9; // isso não pode ser feito

        System.out.println(valor);
        System.out.println(valor + TAXA_DE_VENDA);
    }
}
