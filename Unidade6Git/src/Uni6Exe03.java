import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
     new Uni6Exe03();
    }

    public Uni6Exe03() {
     Scanner input = new Scanner(System.in);
     double[] valores = new double [12];
     ler(input, valores);
     ajustar(valores);
     imprimir(valores);
     input.close();
    }

    private void ler(Scanner input, double valores[]) {
        for (int i = 0; i < valores.length; i++) {
         System.out.println("Digite o " + (i + 1) + "º valor real:");
         valores[i] = input.nextDouble();
        } 
    }

    private void ajustar(double[] valores) {
      for (int i = 0; i < valores.length; i++) {
         if (valores[i] % 2 == 0) {
             valores[i] = valores[i] + (valores[i] * 0.02);
         } else {
             valores[i] = valores[i] + (valores[i] * 0.05) ;
            }
        }
    }

    private void imprimir(double[] valores) {
        System.out.println("Os vetores resultantes são: ");
        for (int i = 0; i < valores.length; i++) {
         System.out.println(valores[i]);
        }
    }
}
/* Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das 
posições pares sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler os valores, 
outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor. */