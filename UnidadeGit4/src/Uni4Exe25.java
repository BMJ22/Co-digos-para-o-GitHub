import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String [] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Entre com dois números: ");
    double primeiro = input.nextDouble();
    double segundo = input.nextDouble();

    System.out.println("Digite a opção:");
    System.out.println("1 - Soma de dois números.");
    System.out.println("2 - Diferença entre dois números.");
    System.out.println("3 - Produto entre dois números.");
    System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
    int opcao = input.nextInt();

    input.close();

    switch (opcao) {
        case 1: 
            System.out.println(primeiro + segundo);
        break;

        case 2: 
            System.out.println(primeiro - segundo);
        break;

        case 3: 
            System.out.println(primeiro * segundo);
        break;

        case 4: 
            if (segundo != 0) {
            System.out.println(primeiro / segundo);
            } else {
             System.out.println("Operação inválida!");
            }
        break;

        default:
         System.out.println("Erro");

    }
}
}
