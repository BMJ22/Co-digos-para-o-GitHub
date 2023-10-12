import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Informe a letra: ");
     char letra = input.next().toUpperCase().charAt(0); /* O método toUpperCase transforma letras minúsculas em maiúsculas. char: para símbolo alfanumérico, 
     como uma letra, um número ou um símbolo de pontuação. O método charAt(0) acessa o primeiro caractere.*/

     if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') { /* É utilizado apenas aspas simples pois o compilador Java espera um 
      único caractere ao declarara a variável char. || : ou */
        System.out.println("é vogal"); 
      } else {
       System.out.println("NÃO é vogal");
     }
     input.close();
    }
}