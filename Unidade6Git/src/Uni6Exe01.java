import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
     new Uni6Exe01();
    }

    public Uni6Exe01() {
     Scanner input = new Scanner(System.in);
     int valores[] = new int [10];
     ler(input, valores);
     imprimir(valores);
     input.close();
    }

    private void ler(Scanner input, int valores[]) {
        for (int i = 0; i < valores.length; i++) {
         System.out.println("Digite o " + (i + 1) + "º número inteiro: ");
         valores[i] = input.nextInt();
        }
    }

    private void imprimir(int valores[]) {
        for (int i = 9; i >= 0; i--) {
         System.out.println(valores[i]);
        }
    }
}
/* Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições 
do tipo inteiro. Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro 
para escrever. */