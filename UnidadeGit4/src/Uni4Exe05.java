import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("A cor é azul (true/false)? ");
     boolean resposta = input.nextBoolean(); // boolean: dado que representa valores lógicos, ou seja, que podem ser verdadeiros ou falsos.

     if (resposta) {
        System.out.println("Sim");
    } else {
        System.out.println("Não");
    }
     input.close();
    }
}
