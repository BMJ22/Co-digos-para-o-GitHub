import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Digite o valor de n (maior que 2): ");
     int n = input.nextInt();

     int num1 = 8;
     int num2 = 10;

     if (n > 2) {
         System.out.print(num1 + ", " + num2 + ", ");
         for (int i = 3; i <= n; i++) {
             int nextNum = num1 * 2;
             System.out.print(nextNum + ", ");
             num1 = nextNum;
             nextNum = nextNum + 2;
             System.out.print(nextNum + ", ");
            }
    } else {
          System.out.print("ERRO!");
    }
     input.close();
    }
}