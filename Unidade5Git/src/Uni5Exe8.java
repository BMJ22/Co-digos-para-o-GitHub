import java.util.Scanner;

public class Uni5Exe8{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.println("Digite um número inteiro: ");
     int n = input.nextInt();

     int somaPositivos = 0;
     int contadorPositivos = 0;
     int menor = Integer.MAX_VALUE;

     for (int i = 1; i <= n; i++) {   
         System.out.println("Digite um número inteiro positivo ou negativo: ");
         int numeros = input.nextInt();

         if (numeros > 0 ) {
             contadorPositivos++;
             int positivo = numeros;
             somaPositivos = somaPositivos + positivo;   
            } else {
             menor = numeros;
            }
        }
     System.out.println("O menor valor negativo é: " + menor);

     double mediaPositivos =  somaPositivos / contadorPositivos;
     System.out.println("A média dos números positivos é: " + mediaPositivos);

     input.close();
    }
}
/* Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:

escreva o menor valor negativo;
escreva a média dos números positivos. */
