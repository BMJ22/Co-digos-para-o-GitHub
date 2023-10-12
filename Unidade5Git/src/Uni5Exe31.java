import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int divisor = 2;

     System.out.println("Digite um número inteiro positivo: ");
     int numero = input.nextInt();

     System.out.println("número\tdecomposição");

     while (numero > 1) {
         if (numero % divisor == 0) {
             System.out.println(numero + "\t" + divisor); //"\t" espaço horizontal de tabulação (resultará em uma formatação semelhante a uma tabela com duas colunas.)
             numero /= divisor;
         } else {
             divisor++;
            }
        }

     System.out.println("1");
     input.close();
    }
} //Decomposição em fatores primos.

/* Dado um número inteiro positivo, determine a sua decomposição em fatores primos. 
A saída do programa deve ser semelhante ao exemplo abaixo:

número	decomposição
180	         2
90	         2
45	         3
15	         3
5	         5
1	           */
