import java.util.Scanner;

public class Revisar1 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 

     for (int i = 1; i <= 20; i++) {
     System.out.println("Digite o " + i + "º número");
     int n = input.nextInt();

      if (n % 2 == 0) {
      System.out.println(n + " é par.");
      } else {
        System.out.println(n + " é ímpar.");
      } 
     }
     input.close();
    }
}