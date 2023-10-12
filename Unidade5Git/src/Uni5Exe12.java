import java.util.Scanner;

public class Uni5Exe12{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.println("Digite um numero inteiro: ");
     int n = input.nextInt();

     int num = 1;
     for (int i = 1; i < n; i++) {
         for (int j = 1; j <= i; j++) {
             System.out.print(num + " ");
             num++;
            }
         System.out.println();
        }

     input.close();
    }
} // Revisar
/* Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado 
Triangulo de Floyd: */
