import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        new Uni6Exe05();
    }

    public Uni6Exe05() {
        Scanner input = new Scanner(System.in);
        String[] resopostasH = new String[5];
        String[] resopostasM = new String[5];
        String[] perguntas = { "Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?", "Gosta de redes sociais?", "Gosta da Oktoberfest?" };
        ler(input, resopostasH, perguntas, resopostasM);
        calcularEimprimir(resopostasH, resopostasM);
        input.close();
    }

    private void ler(Scanner input, String[] resopostasH, String[] perguntas, String[] resopostasM) {
        System.out.println("PERGUNTAS PARA O RAPAZ (SIM, NÃO OU IND): ");
        for (int i = 0; i < resopostasH.length; i++) {
            System.out.println(perguntas[i]);
            resopostasH[i] = input.next().toUpperCase().trim();
        }

        System.out.println("");

        System.out.println("PERGUNTAS PARA A MOÇA (SIM, NÃO OU IND): ");
        for (int j = 0; j < resopostasM.length; j++) {
            System.out.println(perguntas[j]);
            resopostasM[j] = input.next().toUpperCase().trim();
        }
    }

    private void calcularEimprimir(String[] resopostasH, String[] resopostasM) {
        int afinidade = 0;
        for (int i = 0; i < resopostasH.length; i++) {
            if (resopostasH[i].equals("SIM") && resopostasM[i].equals("SIM")) {
                afinidade = afinidade + 3;
            } else if (resopostasH[i].equals("IND") || resopostasM[i].equals("IND")) {
                afinidade = afinidade + 1;
            } else if ((resopostasH[i].equals("SIM") && resopostasM[i].equals("NÃO")) || (resopostasH[i].equals("NÃO") && resopostasM[i].equals("SIM"))) {
                afinidade = afinidade - 2;
            }
        }

        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade  >= 5 && afinidade  <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade  >= 0 && afinidade  <= 4) {
            System.out.println("Vale um encontro.");
        } else if (afinidade  >= (-1) && afinidade  <= (-9)) {
            System.out.println("Melhor não perder tempo");
        } else if (afinidade  == (-10)) {
            System.out.println("Vocês se odeiam!");
        }
    }
}
/*
 * Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça
 * cada um respondeu um questionário
 * com 5 perguntas, como por exemplo:
 * 
 * Gosta de música sertaneja?
 * Gosta de futebol?
 * Gosta de seriados?
 * Gosta de redes sociais?
 * Gosta da Oktoberfest?
 * A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice
 * de afinidade é medido da seguinte maneira:
 * 
 * se ambos deram a mesma resposta soma-se 3 pontos ao índice;
 * se um respondeu IND e o outro SIM ou NÃO soma-se 1;
 * se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
 * 
 * Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as
 * respostas da moça. Crie um método que possa
 * ler tanto as respostas do rapaz como da moça, e outro para calcular e
 * retornar a afinidade. Por fim, escreva a afinidade
 * considerando os seguintes intervalos:
 * 
 * Afinidade Mensagem
 * 15 “Casem!"
 * 10 a 14 “Vocês têm muita coisa em comum!”
 * 5 a 9 “Talvez não dê certo :(”
 * 0 a 4 “Vale um encontro.”
 * -1 a -9 “Melhor não perder tempo”
 * -10 “Vocês se odeiam!”
 */