import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite o primeiro número(inteiro): ");
     int primeiro = input.nextInt();

     System.out.println("Digite o segundo número(inteiro): ");
     int segundo = input.nextInt();

     if (primeiro > segundo) {
      System.out.println(primeiro + " é maior");
     } else {
        System.out.println(segundo + " é maior");
     }

     input.close();
    }
}