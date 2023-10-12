import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     System.out.println("Digite o valor da temperadute em °C que você queira converter para °F: ");
     Double c = input.nextDouble();
 
     Double total = 1.8 * c + 32;

     System.out.println("O valor em °F é: " + String.format("%.2f", total) + " °F");

     input.close(); 
    }
}