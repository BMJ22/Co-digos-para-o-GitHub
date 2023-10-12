import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Digite o número total de reabastecimentos feitos: ");
     int numReabastecimentos = input.nextInt();

     double kmTotal = 0;
     double litrosTotal = 0;

     for (int i = 1; i <= numReabastecimentos; i++) {
         System.out.print("Digite a quilometragem registrada no odômetro na parada " + i + ": ");
         double kmParada = input.nextDouble();

         System.out.print("Digite a quantidade de litros de combustível comprados na parada " + i + ": ");
         double litrosParada = input.nextDouble();

         double kmPorLitro = kmParada / litrosParada;
         System.out.println("A quilometragem obtida por litro de combustível na parada " + i + " foi de: " + kmPorLitro);

         kmTotal += kmParada;
         litrosTotal += litrosParada;
        }

     double kmPorLitroMedia = kmTotal / litrosTotal;
     System.out.println("A quilometragem média obtida por litro de combustível em toda a viagem foi de: " + kmPorLitroMedia);
     input.close();
    }
}