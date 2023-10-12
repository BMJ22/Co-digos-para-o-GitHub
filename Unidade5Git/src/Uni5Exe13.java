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
} //
/* Um motorista acaba de voltar de um feriado prolongado. Antes de sair de viagem e imediatamente após retornar, 
o motorista encheu o tanque do veículo e registrou as medidas do odômetro. Em cada parada feita durante a viagem, 
foi registrado o valor do odômetro e a quantidade de combustível comprado para reabastecer o veículo (suponha que 
o tanque foi enchido a cada parada). Descreva um algoritmo que leia o número total de reabastecimentos feitos e os 
dados registrados relativos à compra de combustível. Calcule e escreva:

a quilometragem obtida por litro de combustível em cada parada;
a quilometragem média obtida por litro de combustível em toda a viagem. */