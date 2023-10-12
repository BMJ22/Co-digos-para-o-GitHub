import java.util.Scanner;

public class Uni5Exe3{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double conta = 0;
     
     for (int i = 1; i <= 100; i++) {
         conta = conta + 1.0 / i;
        }
     System.out.println(conta);
     input.close();
    }
}
/* Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos: */