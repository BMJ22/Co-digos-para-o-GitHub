import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1002 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     DecimalFormat dFormat = new DecimalFormat("0.0000"); 
     
     double raio = input.nextDouble();
     double area = Math.pow(2, raio) * 3.14159;

     System.out.println("A=" + dFormat.format(area));
     input.close();
    }
}