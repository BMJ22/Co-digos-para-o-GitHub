import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     System.out.println("Digite um valor inteiro para X: ");
     int x = input.nextInt();

     System.out.println("Digite um valor inteiro para Y: ");
     int y = input.nextInt();

     System.out.println("Digite um valor inteiro para K: ");
     int k = input.nextInt();

     System.out.println("Resultado: " + x + "" + y + "" + k);

     input.close();
    }
}