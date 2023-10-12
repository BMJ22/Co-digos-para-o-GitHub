import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o comprimento do lado 1: ");
         double lado1 = input.nextDouble();

        System.out.println("Entre com o comprimento do lado 2: ");
         double lado2 = input.nextDouble();

        System.out.println("Entre com o comprimento do lado 3: ");
         double lado3 = input.nextDouble();

         if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
             if (lado1 == lado2 && lado1 == lado3) {
             System.out.println("É equilatero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
             System.out.println("É isóceles");
            } else {
             System.out.println("É escaleno");
            }
         } else {
            System.out.println("Não formam um triângulo");
         }
         input.close();
    }/* Um "if" dentro de outro "if" em Java é conhecido como um "if aninhado". Ele é utilizado quando se 
    deseja verificar uma condição adicional dentro de uma condição anterior.*/
}

        