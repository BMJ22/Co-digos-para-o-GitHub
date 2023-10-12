import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Entre com as horas trabalhadas no mês: ");
     double horasMes = input.nextDouble();

     System.out.println("Entre com o valor pago por hora: ");
     double horasValor = input.nextDouble();

     double salarioTotal = horasMes * horasValor;

     if (horasMes > 160) {
        double salarioExtra = (horasMes - 160) * (horasValor / 2);
        double salariototal = salarioTotal + salarioExtra;
        System.out.println("O salário total é: " + salariototal);
     } else {
        System.out.println("O salário total é: " + salarioTotal);
     } 
     input.close();
    }
}