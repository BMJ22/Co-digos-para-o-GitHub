import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
     new Uni6Exe02();
    }

    public Uni6Exe02() {
     Scanner input = new Scanner(System.in);
     double[] valores = new double [12];
     double[] totalValores = new double [12];
     ler(input, valores, totalValores);
     double media = calcular(valores, totalValores); 
     imprimir(valores, media);
     input.close();
    }

    private void ler(Scanner input, double[] valores, double[] totalValores) {
        for (int i = 0; i < valores.length; i++) {
         System.out.println("Digite o " + (i + 1) + "º número: ");
         valores[i] = input.nextDouble();
         totalValores[i] = totalValores[i] + valores[i];
        }
    }

    private double calcular(double[] valores, double[] totalValores) {
     double media = 0;
        for (int i = 0; i < valores.length; i++) {
         media = media + (totalValores[i] / valores.length);
        }
        return media;
    }

    private void imprimir(double[] valores, double media) {
        for (int i = 0; i < valores.length; i++) {
         if (media < valores[i]) {
             System.out.println(valores[i]);
            }
        }
    }
}
/* Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
Imprima quais valores desses informados são maiores que a média dos valores. Faça um método para ler os 
valores, outro para calcular a média e outro para informar os valores maiores que a média. */