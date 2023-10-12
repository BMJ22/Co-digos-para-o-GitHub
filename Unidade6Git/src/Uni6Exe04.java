import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args){
     new Uni6Exe04();
    }

    public Uni6Exe04() {
      Scanner input = new Scanner(System.in);
      int[] valores1 = new int[10];
      int[] valores2 = new int[10];
      int[] soma = new int[10];
      ler(input, valores1, valores2);
      soma(valores1, valores2, soma);
      imprimir(valores1, valores2, soma);
      input.close();
    }

    private void ler(Scanner input, int[] valores1, int[] valores2) {
        for (int i = 0; i < valores1.length; i++) {
         System.out.println("Digite o " + (i + 1) + "º número do primeiro vetor: ");
         valores1[i] = input.nextInt();
        }

        System.out.println("");

        for (int j = 0; j < valores2.length; j++) {
         System.out.println("Digite o " + (j + 1) + "º número do segundo vetor: "); 
         valores2[j] = input.nextInt();
        }
    }

    private void soma(int[] valores1, int[] valores2, int[] soma) {  
        for (int i = 0; i < valores1.length && i < valores2.length ; i++) {
         soma[i] = valores1[i] + valores2[i];
        }
    }

    private void imprimir(int[] valores1, int[] valores2, int[] soma) {
     System.out.println("Vetor 1:   Vetor 2:   Vetor 3: "); 
        for (int i = 0; i < valores1.length && i < valores2.length && i < soma.length; i++) {
         System.out.printf("%-10d %-10d %-10d%n", valores1[i], valores2[i], soma[i]); 
        }
    }
}
/* Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas 
dos vetores originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao 
final, os três vetores na tela. Faça três métodos: um método para ler valores dos vetores, outro 
para somar e outro para escrever os vetores. */