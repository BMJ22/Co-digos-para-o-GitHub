import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("X: ");
     double x = input.nextDouble();

     System.out.println("Y: ");
     double y = input.nextDouble();

     if (x == 0 && y == 0) {
        System.out.println("Quadrante 0");
     } else if (x > 0 && y > 0) {
        System.out.println("Quadrante 1");
     } else if (x > 0 && y < 0) {
        System.out.println("Quadrante 2");
     } else if (x < 0 && y < 0) {
        System.out.println("Quadrante 3");
     } else if (x < 0 && y > 0){
        System.out.println("Quadrante 4");
     }
     input.close();
    }
}

