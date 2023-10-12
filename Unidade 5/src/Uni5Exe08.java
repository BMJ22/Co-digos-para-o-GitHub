import java.util.Scanner;

public class Uni5Exe08 {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double media = 0;
     int menor = Integer.MAX_VALUE;
     int contador = 0;

     System.out.print("Digite a quantidade de números: ");
     int n = input.nextInt();

     for (int i = 1; i <= n; i++) {
         System.out.print("Digite o " + i + "º número: ");
         int numero = input.nextInt();

         if (numero > 0) {
             contador++;
             media = media + numero;
            } else {
             menor = numero;
            }
        }
        
     double total = media / contador;
     System.out.println(menor + "," + total);
     input.close();
    }
}