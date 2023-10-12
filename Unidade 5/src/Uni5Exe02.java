import java.util.Scanner;

public class Uni5Exe02 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int pares = 0; 
     int impares = 0; /* se declaradas dentro do loop for elas serão redefinidas para zero a cada iteração do loop.
     Além disso, essas variáveis se usadas dentro do loop não serão acessíveis fora do escopo do loop.*/
        
     for (int numero = 1; numero <= 100; numero++) {
         if (numero % 2 == 0) {
             pares = pares + numero;
            } else {
             impares = impares + numero;
            }
        }
     System.out.println("Soma pares: " + pares + "\nSoma ímpares: " + impares );
     input.close();
    }
}
