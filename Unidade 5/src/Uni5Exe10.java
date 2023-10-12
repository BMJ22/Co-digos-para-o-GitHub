import java.util.Scanner;

public class Uni5Exe10 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int count = 0;

     for (int i = 1; count < 10; i++) {
         int num = i * i;
         if (num < 100) {
             continue;
            }
         int primeiro = num / 100;
         int segundo = num % 100;
         if ((primeiro + segundo) * (primeiro + segundo) == num) {
             System.out.println(num);
             count++;
            }
        }
     input.close();
    }
}