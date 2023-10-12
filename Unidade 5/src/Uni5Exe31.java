import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = input.nextInt();
        int fator = 2;
        System.out.println("número\tdecomposição");
        while (num > 1) {
            if (num % fator == 0) {
                System.out.println(num + "\t" + fator);
                num /= fator;
            } else {
                fator++;
            }
        }
        System.out.println(num + "\t");
        input.close();
    }
}
