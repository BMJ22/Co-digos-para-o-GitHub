import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Entre com um valor maior que 0: ");
     double numero = input.nextDouble();

     if (Math.floor(numero) == numero) { // Math.floor arredonda um número para baixo (contrário do Math.ceil).
        System.out.println("Não foram digitadas casas decimais no número.");
    } else {
        System.out.println("Foram digitadas casas decimais no número.");
    }
     input.close();
    }
} 

