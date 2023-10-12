import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o dia da semana do primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado): ");
        int firstDayOfWeek = input.nextInt();

        System.out.print("Digite o número de dias do mês: ");
        int numberOfDays = input.nextInt();

        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

        int currentDay = 1;
        for (int weekDay = 1; weekDay <= 7; weekDay++) {
            if (weekDay < firstDayOfWeek) {
                System.out.print("\t"); 
                System.out.print(currentDay + "\t");
                currentDay++;
            }
        }

        System.out.println(); 
        while (currentDay <= numberOfDays) {
            for (int weekDay = 1; weekDay <= 7; weekDay++) {
                if (currentDay <= numberOfDays) {
                    System.out.print(currentDay + "\t");
                    currentDay++;
                } else {
                    System.out.print("\t"); 
                }
            }
            System.out.println(); 
        }
        input.close();
    }
}
