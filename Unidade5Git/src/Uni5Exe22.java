import java.util.Scanner;

public class Uni5Exe22{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double salario = 2000;
     double aumentodobro = 0.015;
     double aumentoTotal = 0;
     double total = 0;

     System.out.println("Digite o ano atual para saber seu salário:");
     int anoAtual = input.nextInt();
 
     for (int i = 1997; i <= anoAtual; i++) {
         aumentodobro = aumentodobro * 2;  
         aumentoTotal = salario * aumentodobro;
         total = salario + aumentoTotal;
        }
    
     System.out.println("O seu salário atual (" + anoAtual + ") é de: " + total + " reais.");

     input.close();
    }
}
/* Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu aumento de 1.5%. 
A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. Faça programa que determine o salário 
atual do funcionário. */