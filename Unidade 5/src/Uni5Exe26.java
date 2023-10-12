import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double maxPedagio = 0;
        int trechosAcimaMax = 0;
        int totalTrechos = 0;
        int trechosLongos = 0;

        System.out.print("Valor máximo de pedágio: ");
        maxPedagio = input.nextDouble();

        while (maxPedagio >= 0) {
            System.out.print("Pedágio: ");
            double pedagio = input.nextDouble();
            System.out.print("Distância (em Km): ");
            int distancia = input.nextInt();

            if (pedagio > maxPedagio) {
                trechosAcimaMax++;
            }

            if (distancia > 150 && pedagio <= maxPedagio) {
                trechosLongos++;
            }

            totalTrechos++;

            System.out.print("Valor máximo de pedágio: ");
            maxPedagio = input.nextDouble();
        }

        System.out.println(trechosAcimaMax + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(totalTrechos + " (quantidade de trechos informados)");
        System.out.println(trechosLongos + " (trechos acima de 150km com valor aceito por ele)");

        input.close();
    }
}
