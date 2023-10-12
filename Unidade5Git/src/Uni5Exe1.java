import java.util.Scanner;

public class Uni5Exe1{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     for (int i = 1; i <= 20; i++) {
         System.out.println("Digite um número inteiro:");
         int n = input.nextInt();

         if (n % 2 == 0) {
             System.out.println("O número " + n + " é par.");
            } else {
             System.out.println("O número " + n + " é ímpar.");
            }
        }

     input.close();
    }
}
/* Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar. */