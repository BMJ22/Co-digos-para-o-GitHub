import java.util.Scanner;

public class Uni5Exe4 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double resultado = 1.5; 
    
     for (int numero = 2; numero <= 20; numero++) {
         double termo = (2 * numero + 1) / (double) (numero * (numero+1)); 
         resultado += termo; 
     }
    
     System.out.println("O valor é: " + resultado);

     input.close();
    }
} // revisar lógica.
/* Descreva um algoritmo para calcular o valor de S dado por:
 * Considere os 20 primeiros termos da série.
 */