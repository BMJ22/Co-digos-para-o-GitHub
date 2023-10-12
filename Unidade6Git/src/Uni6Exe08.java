import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor N (limite máximo de 20): ");
        int n = input.nextInt();
        if (n > 20) {
            System.out.println("Limite máximo excedido. O valor será ajustado para 20.");
            n = 20;
        }

        double[] vetor = new double[n];

        System.out.println("Digite os valores para o vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            vetor[i] = input.nextDouble();
        }

        bubbleSort(vetor);

        System.out.println("\nTabela de Frequência:");
        printFrequencia(vetor);

        input.close();
    }

    public static void bubbleSort(double[] vetor) {
        int n = vetor.length;
        boolean troca;
        do {
            troca = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    double temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    troca = true;
                }
            }
            n--;
        } while (troca);
    }

    public static void printFrequencia(double[] vetor) {
        int n = vetor.length;
        int contador = 1;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && vetor[i] == vetor[i + 1]) {
                contador++;
            } else {
                System.out.println(vetor[i] + ": " + contador + " vez(es)");
                contador = 1;
            }
        }
    }
}

/* Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, 
 * crie um vetor do tipo real. Faça o usuário informar valores para as posições deste vetor e 
 * coloque-as nas posições na sequência informada pelo usuário. Imprima uma tabela contendo 
 * cada valor diferente e o número de vezes que o valor aparece no vetor
 */