import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     System.out.println("Digite o número de latas de refrigerante de 350 ml você deseja comprar: ");
     int pequena = input.nextInt();

     System.out.println("Digite o número de latas de refrigerante de 600 ml você deseja comprar: ");
     int media = input.nextInt();

     System.out.println("Digite o número de latas de refrigerante de 2 litros você deseja comprar: ");
     int grande = input.nextInt();

     int total = (pequena * 350 + media * 600 + grande * 2000) / 1000;

     System.out.println("A quantidade total de litros de refrigerante que o cliente comprou é de: " + total + " litros.");

     input.close();
    }
}