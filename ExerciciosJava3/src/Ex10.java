import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     System.out.println("Digite o valor do comprimento do primeiro cateto para definirmos a sua hipotenusa: ");
     Double primeiro = input.nextDouble();

     System.out.println("Agora digite o valor do comprimento do segundo cateto: ");
     Double segundo = input.nextDouble();

     Double hipotenusa = Math.sqrt((primeiro * primeiro) + (segundo * segundo));

     System.out.println("O comprimento da hipotenusa é: " + String.format("%.2f", hipotenusa));

     input.close(); 
    }
}