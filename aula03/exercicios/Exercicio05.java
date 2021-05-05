import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAluno, mediaTurma, mediaGeral;
        final int NUMERO_ALUNOS = 2;
        final int NUMERO_TURMAS = 2;

        mediaGeral = 0;

        for (int turma = 1; turma <= NUMERO_TURMAS; turma++) {
            System.out.println("\nTurma: " + turma);
            mediaTurma = 0;
            for (int aluno = 1; aluno <= NUMERO_ALUNOS; aluno++) {
                System.out.println("Digite a média do " + aluno + "º aluno:");
                mediaAluno = teclado.nextDouble();
                mediaTurma = mediaTurma + mediaAluno;
            }
            mediaTurma = mediaTurma / NUMERO_ALUNOS;
            mediaGeral = mediaGeral + mediaTurma;
            System.out.println("Média da turma " + turma + ": " + mediaTurma);
        }
        mediaGeral = mediaGeral / NUMERO_TURMAS;
        System.out.println("\nMédia Geral: " + mediaGeral);

        teclado.close();
    }
}