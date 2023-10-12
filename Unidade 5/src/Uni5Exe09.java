import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Digite a quantidade de alunos: ");
     int alunos = input.nextInt();

     String nomes = " ";
     int contador = 0;
     
     for (int i = 1; i <= alunos; i++) {
         System.out.print("Digite a idade do aluno: ");
         int idade = input.nextInt();

         if (idade == 18) {
             System.out.println("Digite o nome:");
             String nome = input.next().trim();
             nomes = nomes + nome + " ";
            }

         if (idade > 20) {
             contador++;
            }
        }
     System.out.println("Nome dos alunos com 18 anos:" + nomes + "\nQuantidade de alunos com 20 anos: " + contador);
     input.close();
    }
}