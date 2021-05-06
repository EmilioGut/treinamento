public class AppRobo {
    public static void main(String[] args) {
        Robo r1 = new Robo(10, 10, 12);

        System.out.println(r1.exibirPosicao());
        // r1.moverNorte();
        // r1.moverNorte();
        // r1.moverNorte();
        // r1.moverNorte();
        r1.mover('N');
        r1.mover('N');
        r1.mover('N');
        r1.mover('N');
        System.out.println(r1.exibirPosicao());
    }
}
