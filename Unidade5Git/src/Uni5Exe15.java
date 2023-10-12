import java.util.Scanner;

public class Uni5Exe15{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.println("Digite o nome do aluno(a) ou, se quiser finalizar, escreva fim: ");
     String nome = input.next();

     while (!nome.equals("fim")) {
        System.out.println("Digite a primeira nota do aluno(a): ");
        double nota1 = input.nextDouble();
   
        System.out.println("Digite a segunda nota do aluno(a): ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média do aluno(a) " + nome + ": " + media);

        System.out.println("Digite o nome do aluno ou, se quiser finalizar, escreva fim: ");
        nome = input.next();
     }

     System.out.println("FIM, até a próxima");

     /* Dada uma turma de alunos, contendo seu nome e nota de 
     duas provas descreva um algoritmo para informar a média de 
     cada aluno. Considere que a leitura dos dados deve ser 
     finalizada quando o nome do aluno for “fim”. */

     input.close();
    }
}