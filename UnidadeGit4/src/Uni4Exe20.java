import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite a nota da prova 1: ");
     double notaProva1 = input.nextDouble();

     System.out.println("Digite a nota da prova 2: ");
     double notaProva2 = input.nextDouble();

     System.out.println("Digite a nota da prova 3: ");
     double notaProva3 = input.nextDouble();

     System.out.println("Digite a nota da média dos exercicios: ");
     double notaExercicios = input.nextDouble();


     double media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;

     if (media >= 9.0) {
       System.out.println("Média: " + media + " Conceito: A" + " Situação: Aprovado");
     } else if (media >= 7.5 && media < 9.0) {
       System.out.println("Média: " + media + " Conceito: B" + " Situação: Aprovado");
     } else if (media >= 6.0 && media < 7.5) {
        System.out.println("Média: " + media + " Conceito: C" + " Situação: Aprovado");
     } else if (media >= 4.0 && media < 6.0) {
        System.out.println("Média: " + media + " Conceito: D" + " Situação: Reprovado");
     } else if (media < 4.0) {
        System.out.println("Média: " + media + " Conceito: E" + " Situação: Reprovado");
    }
     input.close();
     }
}