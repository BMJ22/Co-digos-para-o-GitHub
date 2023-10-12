import java.util.Scanner;

public class Uni5Exe9{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int contador20 = 0;
     String nome18 = " ";

     System.out.println("Digite a quantidade de alunos: ");
     int n = input.nextInt();

     for (int i = 1; i <= n; i++) {
         System.out.println("Digite o nome do aluno: ");
         String nome = input.next();

         System.out.println("Digite a idade do aluno: ");
         int idade = input.nextInt();

         if (idade > 20) {
             contador20++;
            }

         if (idade == 18) {
             nome18 = nome18 + " " + nome;
            }
        }

     System.out.println("Os nomes dos alunos que tem 18 anos:" + nome18);
     System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + contador20);
     input.close();
    }
}
/* Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:

escreva os nomes dos alunos que tem 18 anos;
escreva a quantidade de alunos que tem idade acima de 20 anos. */