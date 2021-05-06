public class Robo {
    // atributos = características
    private int x, y;
    private final int MAX; // assume plano quadrado
    private final int MAX_PLANO = 100; // tamanho máximo do plano
    private final int MAX_DEFAULT = 10; // tamanho padrão se for passado valor inválido

    public Robo(int x, int y, int MAX) {
        if (MAX > 0 && MAX < MAX_PLANO) {
            this.MAX = MAX;
        } else {
            this.MAX = MAX_DEFAULT;
        }

        if (x > -MAX && x < MAX) {
            this.x = x;
        }

        if (y > -MAX && y < MAX) {
            this.y = y;
        }
    }

    // métodos = ações
    
    public String exibirPosicao() {
        return x + ":" + y;
    }    

    public void moverNorte() {
        if (y < MAX) {
            y++;
        }
    }

    public void moverSul() {
        if (y > -MAX) {
            y--;
        }
    }

    public void moverLeste() {
        if (x < MAX) {
            x++;
        }
    }

    public void moverOeste() {
        if (x > -MAX) {
            x--;
        }
    }

    public void mover(char direcao) {
/*         if (direcao == 'N' || direcao == 'n') {
            moverNorte();
        } else {
            if (direcao == 'S' || direcao == 'S') {
                moverSul();
            }
        } */

        switch (direcao) {
            case 'N':
            case 'n':
                moverNorte();
                break;
            case 'S':
            case 's':
                moverSul();
                break;
            case 'L':
            case 'l':
                moverSul();
                break;
            case 'O':
            case 'o':
                moverSul();
                break;
        }
    }

}
