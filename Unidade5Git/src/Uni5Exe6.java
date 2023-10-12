import java.util.Scanner;

public class Uni5Exe6{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int contador = 0;
     double totalAltura = 0;

     for (int i = 1; i <= 20; i++) {
         contador++;
         System.out.println("Digite sua altura: ");
         double altura = input.nextDouble();
         totalAltura = totalAltura + altura;
        }

     double media = totalAltura / contador;
     System.out.println("Media das alturas: " + media + " metros");

     input.close();
    }
 }
 /* Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas. */