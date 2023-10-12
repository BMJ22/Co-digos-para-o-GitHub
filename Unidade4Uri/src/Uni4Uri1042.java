import java.util.Scanner;

public class Uni4Uri1042 {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 int a = input.nextInt();
 int b = input.nextInt();
 int c = input.nextInt();

 if (a < b && b < c) {
    System.out.println(a + "\n" + b + "\n" + c);
 } else if (b < a && a < c) {
    System.out.println(b + "\n" + a + "\n" + c);
 } else if (c < a && a < b) {
    System.out.println(c + "\n" + a + "\n" + b);
 } else if (a < c && c < b) {
    System.out.println(a + "\n" + c + "\n" + b);
} else {
    System.out.println(b + "\n" + c + "\n" + a);
}
 System.out.println();
 System.out.println(a + "\n" + b + "\n" + c);
 input.close();
 }
}
//estudar pois não foi aceito no Uri
