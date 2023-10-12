import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe18 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     DecimalFormat dcf = new DecimalFormat("0.00");

     int canal4 = 0;
     int canal5 = 0;
     int canal9 = 0;
     int canal12 = 0;

     int contadorTotal = 0;

     System.out.println("Informe o canal (4, 5, 9 ou 12) ou, se quiser finalizar, digite 0:");
     int canal = input.nextInt();

     while (canal != 0) {
         System.out.println("Informe o número de pessoas assistindo a TV naquele horário:");
         int pessoas = input.nextInt();

         switch (canal) {
             case 4:
                 canal4 = canal4 + pessoas;
                break;

             case 5:
                 canal5 = canal5 + pessoas;
                break;

             case 9:
                 canal9 = canal9 + pessoas;
                break;

             case 12:
                 canal12 = canal12 + pessoas;
                break;

             default : 
                 System.out.println("Erro!");
                break;
            }
         contadorTotal = contadorTotal + pessoas;

         System.out.println("Informe o canal (4, 5, 9 ou 12) ou, se quiser finalizar, digite 0:");
         canal = input.nextInt();
        }
     System.out.println("Percentual de audiência do canal 4: " + dcf.format(((double) canal4 / contadorTotal) * 100) + "%");
     System.out.println("Percentual de audiência do canal 5: " + dcf.format(((double) canal5 / contadorTotal) * 100) + "%");
     System.out.println("Percentual de audiência do canal 9: " + dcf.format(((double) canal9 / contadorTotal) * 100) + "%");
     System.out.println("Percentual de audiência do canal 12: " + dcf.format(((double) canal12 / contadorTotal) * 100) + "%");

     input.close();
    }
}

/*Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade, em um certo dia do mês. 
Na pesquisa foi utilizado um coletor de dados portátil. Para cada casa visitada, foi fornecido o número do canal (4, 5, 9, 12) 
e o número de pessoas que estavam assistindo a TV naquele horário, considerando que em cada casa só existia uma televisão. 
Em casas onde a televisão estava desligada, foi registrado zero para o número do canal e para o número de pessoas. 
Baseado nisto descreva um algoritmo que calcule e escreva, para cada emissora, o percentual de audiência. 
A leitura deve ser finalizada quando for informado canal 0.*/