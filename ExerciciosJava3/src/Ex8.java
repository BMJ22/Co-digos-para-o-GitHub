import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     System.out.println("Digite o valor do dólar hoje: ");
     Double dolar = input.nextDouble();

     System.out.println("Agora digite quantos dólares você quer converter para reais: ");
     Double valor = input.nextDouble();

     Double total = valor * dolar;   

     System.out.println("O valor em reais dessa quantidade é: " + String.format("%.2f", total) + " reais.");

     input.close();
    }
}