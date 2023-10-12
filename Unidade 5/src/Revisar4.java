import java.util.Scanner;

public class Revisar4 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double total = 0.0;
     int denominador = 0;
     int contador = 1;

     for (int i = 1; i <=20; i++) {
        if (i % 2 == 0) {
         denominador = i * 2 + i;
        } else {
         contador++;
        }
     }
     total = total + (contador / denominador); 
     System.out.println("Resultado: " + total);
     input.close();
    }
}