import java.util.Scanner;

public class Uni5Exe30 {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite o valor de N: ");
    int N = input.nextInt();
    
    System.out.print("Digite o valor de K: ");
    int K = input.nextInt();
    
    System.out.print("Digite o tamanho da mochila (M): ");
    int M = input.nextInt();
    
    int elemento;
    int somaMochila = 0;
    int somaFora = 0;
    int indiceMochila = 0;
    
    System.out.println("Elementos a serem colocados na mochila:");
    do {
      elemento = N;
      System.out.print(elemento + " ");
      if (indiceMochila < M) {
        somaMochila += elemento;
        indiceMochila++;
      } else {
        somaFora += elemento;
      }
      N -= K;
    } while (N > 0);
    System.out.println();
    
    System.out.println("Elementos que entraram na mochila:");
    for (int i = 1; i <= indiceMochila; i++) {
      System.out.print(N + i * K + " ");
    }
    System.out.println();
    
    System.out.println("Elementos que ficaram fora da mochila:");
    for (int i = indiceMochila + 1; i <= N/K; i++) {
      System.out.print(N + i * K + " ");
    }
    System.out.println();
    
    System.out.println("Soma dos elementos que entraram na mochila: " + somaMochila);
    
    System.out.println("Soma dos elementos que ficaram fora da mochila: " + somaFora);
    
    input.close();
  }

}
