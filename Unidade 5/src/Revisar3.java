import java.util.Scanner;

public class Revisar3 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double soma = 0.0;

     for (int i = 1; i <= 100; i++) {
        soma = soma + 1.0 / i;
     }

     System.out.println("A soma dessa série é: " + soma);
     input.close();
    }
}