package exercicio01;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Cruze", "Chevrolet", -7.5);

        // v.consumo = -8.5;
        // v.marca = "sadfas";

        v.setConsumo(80000);

        v.exibir();
        System.out.println("Consumo: " + v.getConsumo());
    }
}
