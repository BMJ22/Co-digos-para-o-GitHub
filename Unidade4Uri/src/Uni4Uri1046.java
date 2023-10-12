import java.util.Scanner;

public class Uni4Uri1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int horaInicial = input.nextInt();
        int horaFinal = input.nextInt();
        int duracao;
        
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        input.close();
    }
} //Revisar (observar resposta para saber todas as fórmulas necessárias)
