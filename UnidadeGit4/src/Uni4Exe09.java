import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     System.out.println("Digite o primeiro valor (inteiro): ");
     int primeiro = input.nextInt();

     System.out.println("Digite o segundo valor (inteiro): ");
     int segundo = input.nextInt();

     if (primeiro % segundo == 0 || segundo % primeiro == 0) { // % : resto da divisão
        System.out.println("Sim, eles são múltiplos!");
     } else {
        System.out.println("Não, eles não são múltiplos!");
     }
     input.close();
    }    
}
