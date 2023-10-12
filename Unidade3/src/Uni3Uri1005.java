import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1005 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     DecimalFormat dFormat = new DecimalFormat("0.00000");
 
     double a = input.nextDouble();
     double b = input.nextDouble();
     double media = ((a * 3.50) + (b * 7.5)) / 11;

     System.out.println("MEDIA = " + dFormat.format(media));
     input.close();
    }
}
