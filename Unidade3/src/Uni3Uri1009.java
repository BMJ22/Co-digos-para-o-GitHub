import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1009 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     DecimalFormat dFormat = new DecimalFormat("0.00");
     
     String nome = input.next();
     double salario = input.nextDouble();
     double vendas = input.nextDouble();

     double total = salario + (vendas * 0.15);

     System.out.println("TOTAL = R$ " + dFormat.format(total));

     input.close();
    }
}