import java.util.Scanner;

public class Uni3Uri1018 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     int valor = input.nextInt();

     int cem = valor / 100;
     int cinquenta = (valor % 100) / 50;
     int vinte = ((valor % 100) % 50) / 20;
     int dez = (((valor % 100) % 50) % 20) / 10;
     int cinco = ((((valor % 100) % 50) % 20) % 10) / 5;
     int dois = (((((valor % 100) % 50) % 20) % 10) % 5)  / 2;
     int um = (((((valor % 100) % 50) % 20) % 10) % 5) % 2;

     System.out.println(valor);
     System.out.println(cem + " nota(s) de R$ 100,00");
     System.out.println(cinquenta + " nota(s) de R$ 50,00");
     System.out.println(vinte + " nota(s) de R$ 20,00");
     System.out.println(dez + " nota(s) de R$ 10,00");
     System.out.println(cinco + " nota(s) de R$ 5,00");
     System.out.println(dois + " nota(s) de R$ 2,00");
     System.out.println(um + " nota(s) de R$ 1,00");

     input.close();
    }
}