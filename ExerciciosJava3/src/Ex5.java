import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite o número de franguinhos na granja: ");
     int franguinhos = input.nextInt();

     int total = ((franguinhos * 4) * 7);

     System.out.println("O gasto total da granja para marcar todos os seus frangos é: " + total + " reais");

     input.close();
    }
}
