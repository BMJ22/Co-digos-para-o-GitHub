import java.util.Scanner;

public class Uni5Exe03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        double formula = 0.0;
            
        for (int numero = 1; numero <= 100; numero++) {
         formula = formula +  1.0/numero;  
        }
        
        System.out.println("Soma: " + formula);
        input.close();
    }
}
