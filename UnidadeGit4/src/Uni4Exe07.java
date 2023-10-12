import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Entre com peso da carta: ");
     double peso = input.nextDouble();

     double pesoExedido = peso - 50;
     double qtAdicional = (pesoExedido / 20) + 1;
     double valorPagar = 0.45 + 0.45 * qtAdicional;
     
     if (peso <= 50) {
        System.out.println("Custo do selo: 0,45");
     } else {
        System.out.println("Custo do selo: " + valorPagar);
     }
     input.close();
    }
}