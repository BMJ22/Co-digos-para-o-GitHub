import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Informe o valor desejado: ");
     int valor = input.nextInt();

     int cedula20 = 0;
     int cedula10 = 0;
     int cedula5 = 0;
     int cedula2 = 0;
     int cedula1 = 0;

     while (valor >= 20) {
         cedula20++;
         valor -= 20;
        }

     while (valor >= 10) {
         cedula10++;
         valor -= 10;
        }

     while (valor >= 5) {
         cedula5++;
         valor -= 5;
        }

     while (valor >= 2) {
         cedula2++;
         valor -= 2;
        }

     while (valor >= 1) {
         cedula1++;
         valor -= 1;
        }

     System.out.println("Quantidade mínima de cédulas:");
     System.out.println("Cédulas de 20: " + cedula20);
     System.out.println("Cédulas de 10: " + cedula10);
     System.out.println("Cédulas de 5: " + cedula5);
     System.out.println("Cédulas de 2: " + cedula2);
     System.out.println("Cédulas de 1: " + cedula1);

     input.close();
    }
} //Já fizemos esse exercício antes.

/* Um caixa automático possui cédulas de 1, 2, 5, 10 e 20. Faça um programa que leia um valor e informe a quantidade mínima de 
cédulas que ele precisará combinar para entregar o valor solicitado. Por exemplo: se o valor for 6, então ele fornecerá uma 
cédula de 5 e outra de 1. Se o número for 47, então ele fornecerá duas cédulas de 20, uma de 5 e outras de 2. */
