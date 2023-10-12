import java.util.Scanner;

public class uni5Exe18 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int canal = 1, pessoas, totalPessoas = 0;
     int totalCanal4 = 0, totalCanal5 = 0, totalCanal9 = 0, totalCanal12 = 0;

     while (canal != 0) {
         System.out.print("Digite o número do canal (4, 5, 9, 12) ou 0 para sair: ");
         canal = input.nextInt();

         if (canal != 0) {
             System.out.print("Digite o número de pessoas assistindo: ");
             pessoas = input.nextInt();

             switch (canal) {
                 case 4:
                     totalCanal4 += pessoas;
                     break;
                 case 5:
                     totalCanal5 += pessoas;
                     break;
                 case 9:
                     totalCanal9 += pessoas;
                     break;
                 case 12:
                     totalCanal12 += pessoas;
                     break;
                }
             totalPessoas += pessoas;
            }
        }

     System.out.println("\nPercentual de audiência por canal:");

     double percentualCanal4 = (double) totalCanal4 / totalPessoas * 100;
     System.out.printf("Canal 4: %.2f%%\n", percentualCanal4);

     double percentualCanal5 = (double) totalCanal5 / totalPessoas * 100;
     System.out.printf("Canal 5: %.2f%%\n", percentualCanal5);

     double percentualCanal9 = (double) totalCanal9 / totalPessoas * 100;
     System.out.printf("Canal 9: %.2f%%\n", percentualCanal9);

     double percentualCanal12 = (double) totalCanal12 / totalPessoas * 100;
     System.out.printf("Canal 12: %.2f%%\n", percentualCanal12);

     input.close();
    }
}