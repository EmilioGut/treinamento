public class Exemplo05 {
    public static void main(String[] args) {
        double valor;

        valor = 12.5648;

        System.out.println(valor);
        
        // System.out.printf( FORMATO , VALORES OU VARIÁVEIS );
        // %d = numeros inteiros, %f - numeros com decimal, %s - String
        // %x.yf =  x casas inteira, y número de casas decimais

        System.out.printf("O valor inteiro é %d\n", 13);
        System.out.printf("O valor decimal é %.2f\n", valor);
        System.out.printf("O valor inteiro é %d e o valor decimal é %.2f\n\n", 13, valor);

        System.out.printf("%03d\n", 1);
        System.out.printf("%03d\n", 10);
        System.out.printf("%03d\n", 100);
    }
}
