import java.util.Scanner;

public class Uni5Exe7{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.println("Digite um número inteiro: ");
     int nInt = input.nextInt();

     double maior = Double.MIN_VALUE;
     double menor = Double.MAX_VALUE;

     for (int i = 1; i <= nInt; i++) {
         System.out.println("Digite um número real para descobrir o maior e o menor deles: ");
         double nReais = input.nextInt();

         if (nReais > maior) {
             maior = nReais;
            }

         if (nReais < menor)  {
             menor = nReais;
            }
        }
     System.out.println("O maior deles é: " + maior + " e o menor deles é: " + menor);
     input.close();
    }
}
/* Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número. */