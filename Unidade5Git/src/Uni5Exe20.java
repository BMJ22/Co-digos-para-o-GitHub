import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe20 {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     DecimalFormat dcf = new DecimalFormat("0.00");

     int contador = 0;
     double massa = 0;

     System.out.println("Digite a massa inicial (kg): ");
     double massaInicial = input.nextDouble();
     massa = massaInicial;

     while (massa > 0.5) {
         massa = massa / 2;
         contador = contador + 50; 
        }
     
     System.out.println("Massa inicial: " + massaInicial + "kg");
     System.out.println("Massa final: " + dcf.format(massa) + "kg");
     System.out.println("Massa tempo: " + contador + " segundos");

     input.close();
    }
}
/* Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a sua massa inicial em Kg, 
descreva um algoritmo que determine o tempo necessário para que essa massa se torne menor que 0,5 gramas. 
Escreva a massa inicial, a massa final e o tempo. */