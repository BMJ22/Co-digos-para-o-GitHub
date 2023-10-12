import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     double soma = 0;


     for (int numero = 1; numero <= 20; numero++) {
         double altura = input.nextDouble();
         soma = soma + altura;
        }
    
     double media = soma / 20;

     System.out.println("Média:" + media + " metros");
     input.close();
    }
}