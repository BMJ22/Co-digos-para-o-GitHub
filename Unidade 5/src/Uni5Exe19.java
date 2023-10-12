import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     double valorCompra, totalPagar = 0, totalRecebido = 0;

     do {
         System.out.print("Digite o valor da compra (ou 0 para sair): R$ ");
         valorCompra = input.nextDouble();

         if (valorCompra > 0) {
              if (valorCompra > 500) {
                    totalPagar = valorCompra * 0.8;
                } else {
                    totalPagar = valorCompra * 0.85;
                }

             System.out.printf("Total a pagar: R$ %.2f\n", totalPagar);
             totalRecebido += totalPagar;
            }
        } while (valorCompra != 0);

     System.out.printf("Total recebido pela loja: R$ %.2f", totalRecebido);
     input.close();
    }
}