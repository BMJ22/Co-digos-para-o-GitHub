import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int contadorD = 0;
     int contadorE = 0;
     int diferenca = 0;

     while ((contadorE < 5 && contadorD < 5 || (diferenca < 2)) || (contadorE > 5 && contadorD > 5 && diferenca < 2)) {
         System.out.println("Digite o código do ponto de cada jogada D (direito) ou E (esquerdo)");
         char codigo = input.next().toUpperCase().charAt(0);

         diferenca = Math.abs(contadorD - contadorE);
         switch (codigo) {
             case 'D':
                 contadorD++;
                break;

             case 'E':
                 contadorE++;
                break;

             default : 
                 System.out.println("Erro!");
                break;
            } 
        }

     if (contadorD > contadorE){
         System.out.println("O vencedor é: D");
        } else {
         System.out.println("O vencedor é: E");
        }

     input.close(); 
    }
}
/* Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E, 
ponto para o jogador do lado esquerdo da mesa. Descreva um algoritmo que leia o código do ponto de cada jogada 
e determine o vencedor. A partida encerra quando:

Um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;

O jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira 
condição não seja atendida. */

