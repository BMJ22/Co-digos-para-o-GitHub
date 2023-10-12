import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nome ou Fim para sair: ");
        String nome = input.next();

        while (!nome.trim().equalsIgnoreCase("FIM")) {
            System.out.println("Nota 1: ");
            double nota1 = input.nextDouble();

            System.out.println("Nota 2: ");
            double nota2 = input.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.println("Média do(a) aluno(a) " + nome + "é" + media);
            System.out.print("Nome ou FIM para sair: ");
            nome = input.next();
        }
        input.close();
    }
}