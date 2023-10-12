import java.util.Scanner;

public class Uni3Uri1016 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     int distancia = input.nextInt();
     int tempo = distancia * 2;

     System.out.println(tempo + " minutos");
     input.close();
    }
}