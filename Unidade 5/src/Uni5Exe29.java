import java.util.Scanner;

public class Uni5Exe29 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorSolicitado, cedulas20, cedulas10, cedulas5, cedulas2, cedulas1;

        System.out.print("Digite o valor solicitado: ");
        valorSolicitado = teclado.nextInt();

        cedulas20 = valorSolicitado / 20;
        valorSolicitado = valorSolicitado % 20;

        cedulas10 = valorSolicitado / 10;
        valorSolicitado = valorSolicitado % 10;

        cedulas5 = valorSolicitado / 5;
        valorSolicitado = valorSolicitado % 5;

        cedulas2 = valorSolicitado / 2;
        valorSolicitado = valorSolicitado % 2;

        cedulas1 = valorSolicitado;

        System.out.println("Quantidade de cédulas:");
        System.out.println("Cédulas de 20: " + cedulas20);
        System.out.println("Cédulas de 10: " + cedulas10);
        System.out.println("Cédulas de 5: " + cedulas5);
        System.out.println("Cédulas de 2: " + cedulas2);
        System.out.println("Cédulas de 1: " + cedulas1);

        teclado.close();
    }
}
