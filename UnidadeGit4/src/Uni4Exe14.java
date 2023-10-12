import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite o dia: ");
     int dia = input.nextInt();

     System.out.println("Digite o mes: ");
     int mes = input.nextInt();

     System.out.println("Digite o ano: ");
     int ano = input.nextInt();

     if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) { 
            System.out.println("Valida");
        } else if (mes != 2 && dia < 31) {
            System.out.println("Valida");
        } else if (mes == 2 && dia < 29) {
            System.out.println("Valida");
        } else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) { /* Bissexto: se ele é divisível por 4. 
        Alguns anos que são múltiplos de 100 não são bissextos, a menos que sejam também múltiplos de 400 (regra para corrigir 
        a diferença entre o calendário solar e o calendário gregoriano(atual).*/
            System.out.println("Valida");
        } else {
            System.out.println("Não válida");
        }
     } else {
        System.out.println("Não válida");
     }
     input.close();
    }
}