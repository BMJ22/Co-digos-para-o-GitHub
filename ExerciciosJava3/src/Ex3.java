import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite o valor do preço do litro da gasolina: ");
     Double valorlitro = input.nextDouble();

     System.out.println("Digite o valor total pago da gasolina: ");
     Double valortotal = input.nextDouble();

     Double total = valortotal / valorlitro;

     System.out.println("A quantidade de litros que você conseguiu colocar no tanque é: " + String.format("%.2f", total) + " litros.");

     input.close();
    }
}
