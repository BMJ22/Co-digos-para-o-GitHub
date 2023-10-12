import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite o dia do vencimento: ");
     int diavencimento = input.nextInt();

     System.out.println("Digite o dia do pagamento: ");
     int diapagamento = input.nextInt();

     System.out.println("Digite o valor da prestação: ");
     double prestacao = input.nextDouble();

     if (diapagamento <= diavencimento) {
      double valor = prestacao - (prestacao * 0.1);
      System.out.println("O valor a ser pago pelo cliente (10% de desconto): " + valor);
     } else if ((diapagamento - diavencimento) < 6) {
      System.out.println("O valor a ser pago pelo cliente (sem desconto): " + prestacao);
     } else if ((diapagamento - diavencimento) > 5) {
      double valor = prestacao + (prestacao * ((diapagamento - diavencimento) * 0.02));
      System.out.println("O valor a ser pago pelo cliente(multado em 2% por cada dia de atraso): " + valor);
     }
     input.close();
    }
}