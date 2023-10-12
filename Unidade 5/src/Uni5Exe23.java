import java.util.Scanner;

public class Uni5Exe23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome do vendedor: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o número de produtos vendidos: ");
            int n = scanner.nextInt();
            double totalVendas = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Digite o preço unitário do produto " + i + ": ");
                double preco = scanner.nextDouble();
                System.out.print("Digite a quantidade vendida do produto " + i + ": ");
                int quantidade = scanner.nextInt();
                totalVendas += preco * quantidade;
            }
            double salario = totalVendas * 0.3;
            System.out.println("Nome: " + nome);
            System.out.println("Total de vendas: R$" + totalVendas);
            System.out.println("Salário: R$" + salario);
            System.out.print("Deseja digitar os dados de mais um vendedor? (s/n): ");
            scanner.nextLine();
            continuar = scanner.nextLine();
        }
        System.out.println("Fim do programa.");
        scanner.close();
    }
}
