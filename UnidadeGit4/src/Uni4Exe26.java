import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String [] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Escolha uma opção:");
    System.out.println("T: calcular a área de um triângulo de base b e altura h");
    System.out.println("Q: calcular a área de um quadrado de lado l");
    System.out.println("R: calcular a área de um retângulo de base b e altura h");
    System.out.println("C: calcular a área de um círculo de raio r");
    String opcao = input.next().toUpperCase(); // O método toUpperCase transforma letras minúsculas em maiúsculas.

    switch (opcao) {
        case "T": 
            System.out.println("Digite a base e a altura do triângulo: ");
            double base = input.nextDouble();
            double altura = input.nextDouble();
            System.out.println(base * altura / 2);
        break;

        case "Q": 
            System.out.println("Digite o lado: ");
            double lado = input.nextDouble();
            System.out.println(lado * lado);
        break;

        case "R": 
            System.out.println("Digite a base e a altura do retângulo: ");
            double base2 = input.nextDouble();
            double altura2 = input.nextDouble();
            System.out.println(base2 * altura2);
        break;

        case "C": 
           System.out.println("Digite o raio: ");
           double raio = input.nextDouble();
           System.out.println(Math.PI * Math.pow(raio, 2)); /* Math.PI é uma constante que representa o valor de pi. 
         Já o método Math.pow(base, expoente) retorna o valor da base elevada ao expoente especificado.*/
        break;

        default:
         System.out.println("Erro");

    }
    input.close();
}
}
