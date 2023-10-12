import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, pecasManha, pecasTarde;
        double valor;
        boolean novoFuncionario = true;

        while (novoFuncionario) {
            do {
                System.out.print("Digite o dia do mês de abril: ");
                dia = sc.nextInt();
            } while (dia < 1 || dia > 30);

            System.out.print("Digite o total de peças produzidas no turno da manhã: ");
            pecasManha = sc.nextInt();
            System.out.print("Digite o total de peças produzidas no turno da tarde: ");
            pecasTarde = sc.nextInt();

            if (dia <= 15) {
                if (pecasManha >= 30 && pecasTarde >= 30 && (pecasManha + pecasTarde) > 100) {
                    valor = (pecasManha + pecasTarde) * 0.8;
                } else {
                    valor = (pecasManha + pecasTarde) * 0.5;
                }
            } else {
                valor = pecasManha * 0.4 + pecasTarde * 0.3;
            }

            System.out.printf("Valor a receber: R$ %.2f\n", valor);

            System.out.print("Novo funcionário (1. sim / 2. não)? ");
            int opcao = sc.nextInt();
            if (opcao == 2) {
                novoFuncionario = false;
            }
        }

        sc.close();
    }
}
