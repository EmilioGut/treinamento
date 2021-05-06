package exercicio02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(4, 12, 33);

        relogio.setHora(-12);
        relogio.setMinuto(34);
        relogio.setSegundo(77);

        relogio.horaAtual();

        System.out.println("Hora: " + relogio.getHora());
        System.out.println("Minuto: " + relogio.getMinuto());
        System.out.println("Segundo: " + relogio.getSegundo());
    }
}
