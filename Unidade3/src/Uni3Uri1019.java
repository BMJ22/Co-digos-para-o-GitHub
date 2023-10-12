import java.util.Scanner;

public class Uni3Uri1019 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int segundos = input.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundo = segundos % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundo);

        input.close();
    }
}