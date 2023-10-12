import java.util.Scanner;
import java.text.DecimalFormat; 

public class Uni3Uri1015 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     DecimalFormat dFormat = new DecimalFormat("0.0000");

     Double x1 = input.nextDouble();
     Double y1 = input.nextDouble();
     Double x2 = input.nextDouble();
     Double y2 = input.nextDouble();

     Double distancia = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))); 

     System.out.println(dFormat.format(distancia));

     input.close();
    }
}