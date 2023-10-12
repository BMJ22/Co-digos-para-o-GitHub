import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe23 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     DecimalFormat df = new DecimalFormat("0.00");

     System.out.println("Deseja digitar os dados de um vendedor: s (SIM) / n (NÃO)?");
     String pergunta = input.next();

     String tudo = "";
     double total = 0;

     while (pergunta.equals("s")) {
         System.out.println("Digite seu nome: ");
         String nome = input.next();

         System.out.println("Digite seu salário: ");
         double salario = input.nextDouble();
       
         System.out.println("Digite a quantidade de vendas: ");
         int n = input.nextInt();
       
         for (int i = 1; i <= n; i++) {
             System.out.println("Digite o preço unitário do " + i + "º produto: ");
             double precoUni = input.nextDouble();

             System.out.println("Digite a quantidade de vendas desse produto: ");
             double vendasDesseProd = input.nextDouble();

             double totalDesseProd = precoUni * vendasDesseProd;
             total = total + totalDesseProd;
            }
         double comissaoTotal = total * 0.3;

         double totalSalario = salario + comissaoTotal;

         System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
         pergunta = input.next();

         tudo = tudo + "O total de vendas do vendedor " + nome + " é: " +  df.format(total) + " reais. Salário do vendedor: " + df.format(totalSalario) + " reais. \n";
         System.out.println(tudo);
        }
     input.close();
    }
}
/* Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, 
que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, 
vende n produtos, onde, para cada produto tem-se o preço unitário e a quantidade vendida. O departamento 
de pessoal deseja obter um relatório com: nome, total de vendas (em R$) e salário de cada vendedor. 
Descreva um algoritmo que gere o relatório desejado. Para prosseguir com a entrada de dados 
o algoritmo deve apresentar a seguinte mensagem: “deseja digitar os dados de mais um 
vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve ser informado. */