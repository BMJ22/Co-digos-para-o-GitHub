import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1008 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     DecimalFormat dFormat = new DecimalFormat("0.00");
     
     int numero = input.nextInt();
     int horas = input.nextInt();
     double valor = input.nextDouble();

     double salario = (horas * valor);

     System.out.println("NUMBER = " + numero);
     System.out.println("SALARY = U$ " + dFormat.format(salario));

     input.close();
    }
}