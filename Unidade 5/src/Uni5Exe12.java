import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Digite um número inteiro positivo: ");
     int n = input.nextInt();

     int num = 1;
     for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= i; j++) {
             System.out.print(num + " ");
             num++;
            }
         System.out.println();
        }
     input.close();
    }
}