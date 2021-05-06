import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();
        // Pessoa p;

        // p = new Pessoa("Armando", 33);
        lista.add( new Pessoa("Armando", 33) );

        // p = new Pessoa("Carlos", 44);
        lista.add( new Pessoa("Carlos", 44) );

        // p = new Pessoa("Darlene", 55);
        lista.add( new Pessoa("Darlene", 55) );

        for (Pessoa pessoa : lista) {
            pessoa.apresentar();
        }

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).apresentar();
        }
    }
    
}
