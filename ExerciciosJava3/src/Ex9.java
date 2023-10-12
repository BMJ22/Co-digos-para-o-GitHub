import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     System.out.println("Digite o valor do raio dessa lata de óleo para definirmos o seu volume: ");
     Double raio = input.nextDouble();

     System.out.println("Agora digite o valor da altura dessa lata de óleo: ");
     Double altura = input.nextDouble();

     Double total = 3.14159 * (raio * raio) * altura;

     System.out.println("O volume dessa lata de óleo é: " + String.format("%.2f", total));

     input.close();
    }
}