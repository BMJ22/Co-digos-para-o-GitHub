import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     System.out.println("Qual o peso do prato montado pelo cliente (em quilos): ");
     Double peso = input.nextDouble();

     Double total = (peso - 0.750) * 25;

     System.out.println("O valor a pagar pelo cliente é: " + String.format("%.2f", total) + " reais");

     input.close();
    }
}