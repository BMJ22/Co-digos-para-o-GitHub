import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite um valor que vc queira converter no menor número de notas e/ou moedas possíveis: ");
     Double valorr = input.nextDouble();

     int valor = (int) (valorr * 100);
     int cem = valor / 10000;
     int dez = (valor % 10000) / 1000;
     int um = (valor % 1000) / 100;

     System.out.println("O valor da conversão do número " + valorr + " é igual a: " + "\n" + cem + 
     " de notas de cem" + "\n" + dez + " de notas de dez" + "\n" + um + " de notas de um");

     input.close();
    }
}