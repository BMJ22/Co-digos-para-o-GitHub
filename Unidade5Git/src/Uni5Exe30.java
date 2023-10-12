import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Digite o valor inicial (N): ");
     int N = input.nextInt();

     System.out.print("Digite o decremento (K): ");
     int K = input.nextInt();

     System.out.print("Digite o tamanho da mochila (M): ");
     int M = input.nextInt();

     int somaColocados = 0;
     int somaFora = 0;
     int elemento = N;

     System.out.print("Elementos a serem colocados na mochila: ");
     while (elemento >= 1 && M - somaColocados >= elemento) {
         System.out.print(elemento + " ");
         somaColocados += elemento;
         elemento -= K;
        }

     System.out.println();
     System.out.print("Elementos que entraram na mochila: ");
     while (elemento >= 1) {
         System.out.print(elemento + " ");
         somaFora += elemento;
         elemento -= K;
        }

     System.out.println();
     System.out.print("Elementos que ficaram fora da mochila: ");
     while (elemento < 1) {
         System.out.print((elemento + K) + " ");
         somaFora += (elemento + K);
         elemento += K;
        }

     System.out.println();
     System.out.println("Soma dos elementos que entraram na mochila: " + somaColocados);
     System.out.println("Soma dos elementos que não entraram na mochila: " + somaFora);

     input.close();
    }
} //Não entendi muito bem o enunciado - revisar.

/* Implemente o problema da mochila. Tendo-se uma sequência decrescente de números inteiros positivos 
que inicia em N, com decremento inteiro positivo K, deseja-se empacotá-los em uma mochila com tamanho M, 
de forma que se coloque dentro dela preferencialmente os maiores valores, até que ela esteja cheia. N e K 
são inteiros e devem ser definidos pelo usuário. Faça um algoritmo que imprima:

os elementos a serem colocados na mochila;
os elementos que entraram na mochila;
os que ficaram fora da mochila;
qual é a soma dos elementos que entraram na mochila;
qual a soma dos elementos que não entraram na mochila. */
