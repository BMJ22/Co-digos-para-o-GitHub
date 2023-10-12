import java.util.Scanner;

public class Uni5Exe34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        int numContasEncerradas = 0;

        while (opcao != 3) {
            System.out.println("\nOpções disponíveis:");
            System.out.println("1 - Encerrar a conta de um hóspede");
            System.out.println("2 - Verificar número de contas encerradas");
            System.out.println("3 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do hóspede: ");
                    String nome = input.next();
                    System.out.print("Digite o número de diárias do hóspede: ");
                    int numDiarias = input.nextInt();

                    double taxaServicos = 0;
                    if (numDiarias < 15) {
                        taxaServicos = 7.5;
                    } else if (numDiarias == 15) {
                        taxaServicos = 6.5;
                    } else {
                        taxaServicos = 5;
                    }

                    double totalAPagar = numDiarias * 50 + taxaServicos;
                    System.out.printf("O hóspede %s deve pagar R$ %.2f\n", nome, totalAPagar);
                    numContasEncerradas++;
                    break;

                case 2:
                    System.out.printf("Número de contas encerradas: %d\n", numContasEncerradas);
                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        input.close();
    }
}
