import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite a idade da primeira mulher: ");
     int mulher1 = input.nextInt();

     System.out.println("Digite a idade da segunda mulher: ");
     int mulher2 = input.nextInt();

     System.out.println("Digite a idade do primeiro homem: ");
     int homem1 = input.nextInt();

     System.out.println("Digite a idade do segundo homem: ");
     int homem2 = input.nextInt();

     if (mulher1 != homem1 || mulher1 != homem2 && mulher2 != homem1 || mulher2 != homem2 ) { // ou : !(mulher1 == homem1 ||... == homem2)).
        if (homem1 > homem2 && mulher1 < mulher2) {
         int soma = homem1 + mulher1;
         int multiplicacao = homem2 * mulher2;
         System.out.println("Soma: " + soma + " Multiplicação: " + multiplicacao);
        } else if (homem2 > homem1 && mulher2 < mulher1) {
         int soma = homem2 + mulher2;
         int multiplicacao = homem1 * mulher1;
         System.out.println("Soma: " + soma + " Multiplicação: " + multiplicacao);
        }
     }
     input.close();
    }
}