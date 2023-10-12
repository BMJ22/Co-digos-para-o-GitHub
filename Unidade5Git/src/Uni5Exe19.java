import java.util.Scanner;

public class Uni5Exe19{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double valorTotal = 0;

     System.out.println("Digite o valor da compra ou, se quiser finalizar, digite 0");
     double valorCompra = input.nextDouble();

     while (valorCompra != 0) {

     if (valorCompra > 500) {
         double desconto20 = valorCompra - (valorCompra * 0.2);
         valorTotal = valorTotal + desconto20;
         System.out.println("Total a pagar " + desconto20 + " reais.");
     } else if (valorCompra <= 500) {
         double desconto15 = valorCompra - (valorCompra * 0.15);
         valorTotal = valorTotal + desconto15;
         System.out.println("Total a pagar " + desconto15 + " reais.");
      } else {
         System.out.println("Erro!");
       }

     System.out.println("Digite o valor da compra ou, se quiser finalizar, digite 0");
     valorCompra = input.nextDouble();
     }

     System.out.println("Total a pagar recebido pela loja ao final do dia: " + valorTotal + " reais.");

     input.close();
    }
}

/* Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada. 
O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. Descreva um algoritmo 
que leia o valor da compra e escreva o total a pagar a cada compra. Informe também o valor total recebido pela loja ao final 
do dia. A leitura deve ser finalizada com a leitura 0 para o valor da compra. */