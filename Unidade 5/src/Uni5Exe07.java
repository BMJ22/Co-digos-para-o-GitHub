import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = input.nextInt();

        double maior = Double.MIN_VALUE; //
        double menor = Double.MAX_VALUE; //

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double num = input.nextDouble();

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        input.close();
    }
}