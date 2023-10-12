import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Uri1012 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     DecimalFormat dFormat = new DecimalFormat("0.000");
 
     double a = input.nextDouble();
     double b = input.nextDouble();
     double c = input.nextDouble();

     double areatriangulo = a * c / 2;
     double areacirculo = (c * c) * 3.14159;
     double areatrapezio = ((a * c) * c) / 2;
     double areaquadrado = b * b;
     double arearetangulo = a * b;

     System.out.println("TRIANGULO: " + dFormat.format(areatriangulo));
     System.out.println("CIRCULO: " + dFormat.format(areacirculo));
     System.out.println("TRAPEZIO: " + dFormat.format(areatrapezio));
     System.out.println("QUADRADO: " + dFormat.format(areaquadrado));
     System.out.println("RETANGULO: " + dFormat.format(arearetangulo));

     input.close();
    }
}