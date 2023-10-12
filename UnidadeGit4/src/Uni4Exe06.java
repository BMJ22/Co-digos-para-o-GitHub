import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite um caractere: ");
     char letra = input.next().toUpperCase().charAt(0); /* O método toUpperCase transforma letras minúsculas em maiúsculas. char: para símbolo alfanumérico, 
     como uma letra, um número ou um símbolo de pontuação. O método charAt(0) acessa o primeiro caractere.*/
     
     if (letra == 'M') { // É utilizado apenas aspas simples pois o compilador Java espera um único caractere ao declarara a variável char.
        System.out.println("Masculino.");
      } else if (letra == 'F') {
        System.out.println("Feminino.");
      } else if (letra == 'I') {
        System.out.println("Não informado.");
      } else {
       System.out.println("Entrada Incorreta.");
     }
     input.close();
    }
}