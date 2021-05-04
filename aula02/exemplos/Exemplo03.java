package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        String palavra1 = "Emerson";
        String palavra2 = "emerson";
        boolean iguais;

        iguais = palavra1.equals(palavra2);

        if(iguais) { // exatamente iguais
            System.out.println("Iguais");
        } else {
            System.out.println("Diferente");
        }

        if(palavra1.equalsIgnoreCase(palavra2)) { // ignora diferenças entre maiúsculas/minúsculas
            System.out.println("Iguais");
        } else {
            System.out.println("Diferente");
        }
        
    }
}
