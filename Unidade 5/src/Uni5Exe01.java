import java.util.Scanner;

public class Uni5Exe01{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     for (int quantidade = 1; quantidade <= 20; quantidade++ ) {
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
     
       if (numero % 2 == 0) {
        System .out.println("PAR");
       } else {
        System .out.println("ÍMPAR");
       }
      }
      input.close();
    }
}
