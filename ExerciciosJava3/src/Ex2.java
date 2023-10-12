import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in);

     System.out.println("Digite o preço do par de sapato: ");
     Double preco = input.nextDouble();

     Double desconto = preco * 0.12;
     Double total = preco - desconto;

     System.out.println("O valor do desconto é de R$: " + desconto + "\nO preço do par de sapatos com desconto é R$: " + total);

     input.close();
    }
}