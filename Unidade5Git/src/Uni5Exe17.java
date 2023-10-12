import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe17{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     DecimalFormat decFt = new DecimalFormat("0.00");

     double alturaAtleta = 0;
     int maiorIns = 0;
     double maiorAltura = 0;
     int menorIns = 0;
     double menorAltura = Double.MAX_VALUE; //
     int contador = 0;

     System.out.println("Digite o número de inscrição do(a) atleta ou digite 0 para finalizar: ");
     int numIns = input.nextInt();

     while (numIns != 0) {
         System.out.println("Digite a altura do(a) atleta: ");
         double altura = input.nextDouble();

         alturaAtleta = alturaAtleta + altura;
         contador++;

         if (altura > maiorAltura) {
             maiorIns = numIns; //
             maiorAltura = altura; //
            } 

         if (altura < menorAltura) {
             menorIns = numIns;
             menorAltura = altura;
            }

         System.out.println("Digite o número de inscrição do(a) atleta ou digite 0 para finalizar: ");
         numIns = input.nextInt();
        }

     double media = alturaAtleta / contador;

     System.out.println("o número de inscrição e a altura do atleta mais alto é: " + maiorIns + ", " + decFt.format(maiorAltura) + " metros." + 
     "\no número de inscrição e a altura do atleta mais baixo é: " + menorIns + ", " + decFt.format(menorAltura) + " metros." + 
     "\nMédia do grupo é: " + decFt.format(media) + " metros."); 

     System.out.println("Leitura finalizada!");
     input.close();
    }
}

/* Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe: 
o número de inscrição e a altura do atleta mais alto;
o número de inscrição e a altura do atleta mais baixo;
a altura média do grupo de atletas.
A leitura deve ser finalizada ao digitar 0 para o número de inscrição. */
