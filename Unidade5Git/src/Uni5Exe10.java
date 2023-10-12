import java.util.Scanner;

public class Uni5Exe10 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int count = 0;

     for (int i = 1; count < 10; i++) {
         int num = i * i;
         if (num < 100) {
             continue;
            }
         int primeiro = num / 100;
         int segundo = num % 100;
         if ((primeiro + segundo) * (primeiro + segundo) == num) {
             System.out.println(num);
             count++;
            }
        }
     input.close();
    }
} // Revisar.
/* O número 3025 possui a seguinte característica:

30+25=55 55^2=3025

Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade. Outros exemplos:

20+25=45 45^2=2025 */