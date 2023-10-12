import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1010 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     DecimalFormat dFormat = new DecimalFormat("0.00");
     
     int codigo = input.nextInt();
     int numero = input.nextInt();
     double valor = input.nextDouble();
     int codigo2 = input.nextInt();
     int numero2 = input.nextInt();
     double valor2 = input.nextDouble();


     double total = (numero * valor) + (numero2 * valor2);

     System.out.println("VALOR A PAGAR: R$ " + dFormat.format(total));

     input.close();
    }
}