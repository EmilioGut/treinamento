package exercicio01;

public class Veiculo {
    private String modelo, marca;
    private double consumo;

    public Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        setConsumo(consumo);
    }

    public void exibir() {
        System.out.println("Carro: " + modelo + ", " + marca);
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double novoConsumo) {
        if(novoConsumo > 0 && novoConsumo < 80) {
            consumo = novoConsumo;
        }
    }

}
