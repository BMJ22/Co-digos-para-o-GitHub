import java.util.Scanner;

public class Uni3Uri1020 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();

        int valorInteiro = (int) (valor * 100);

        int cem = valorInteiro / 10000;
        valorInteiro = valorInteiro % 10000;

        int cinquenta = valorInteiro / 5000;
        valorInteiro = valorInteiro % 5000;

        int vinte = valorInteiro / 2000;
        valorInteiro = valorInteiro % 2000;

        int dez = valorInteiro / 1000;
        valorInteiro = valorInteiro % 1000;

        int cinco = valorInteiro / 500;
        valorInteiro = valorInteiro % 500;

        int dois = valorInteiro / 200;
        valorInteiro = valorInteiro % 200;

        int um = valorInteiro / 100;
        valorInteiro = valorInteiro % 100;

        int moeda50 = valorInteiro / 50;
        valorInteiro = valorInteiro % 50;

        int moeda25 = valorInteiro / 25;
        valorInteiro = valorInteiro % 25;

        int moeda10 = valorInteiro / 10;
        valorInteiro = valorInteiro % 10;

        int moeda5 = valorInteiro / 5;
        valorInteiro = valorInteiro % 5;

        int moeda1 = valorInteiro;
     
     System.out.println("NOTAS:");
     System.out.println(cem + " nota(s) de R$ 100.00");
     System.out.println(cinquenta + " nota(s) de R$ 50.00");
     System.out.println(vinte + " nota(s) de R$ 20.00");
     System.out.println(dez + " nota(s) de R$ 10.00");
     System.out.println(cinco + " nota(s) de R$ 5.00");
     System.out.println(dois + " nota(s) de R$ 2.00");
     System.out.println("MOEDAS:");
     System.out.println(um + " moeda(s) de R$ 1.00");
     System.out.println(moeda50 + " moeda(s) de R$ 0.50");
     System.out.println(moeda25 + " moeda(s) de R$ 0.25");
     System.out.println(moeda10 + " moeda(s) de R$ 0.10");
     System.out.println(moeda5 + " moeda(s) de R$ 0.05");
     System.out.println(moeda1 + " moeda(s) de R$ 0.01");

     input.close();
    }
}