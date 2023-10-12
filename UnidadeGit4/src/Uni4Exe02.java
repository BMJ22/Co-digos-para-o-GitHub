import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Entre com um valor inteiro maior que 0: ");
     int valor = input.nextInt();

     if (valor % 2 == 0) {
        System.out.println("Número é par");
     } else {
        System.out.println("Número é impar");
     }
     input.close();
    }
}