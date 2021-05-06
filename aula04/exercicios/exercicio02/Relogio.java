package exercicio02;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora(){
        return hora;
    }

    public void setHora(int novaHora){
        if (novaHora > -1 && novaHora < 24) {
            hora = novaHora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int novoMinuto){
        if (novoMinuto > -1 && novoMinuto < 60) {
            minuto = novoMinuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int novoSegundo){
        if (novoSegundo > -1 && novoSegundo < 60) {
            segundo = novoSegundo;
        }
    }

    public void horaAtual() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }
}
