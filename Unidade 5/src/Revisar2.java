import java.util.Scanner;

public class Revisar2 {
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 int somaPar = 0;
 int somaImpar = 0;

 for (int i = 1; i <= 100; i++) {
    if (i % 2 == 0) {
    somaPar = somaPar + i;
    } else {
     somaImpar = somaImpar + i;
    }
 }
 System.out.println("Soma dos pares: " + somaPar + "\nSoma dos ímpares: " + somaImpar);
 input.close();
}
}