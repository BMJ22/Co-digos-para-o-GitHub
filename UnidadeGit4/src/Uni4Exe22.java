import java.util.Scanner;

public class Uni4Exe22 { // ESCOLHA (switch).
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite a opção: ");
     System.out.println("1 – Ciência da Computação");
     System.out.println("2 – Licenciatura da Computação");
     System.out.println("3 – Sistemas de Informação");
     int opcao = input.nextInt();
     
     switch (opcao) {
        case 1: 
         System.out.println("Bacharel em Ciência da Computação");
        break;

        case 2: 
         System.out.println("Licenciado em Computação");
        break;

        case 3: 
         System.out.println("Bacharel em Sistemas de Informação");
        break;

        default: 
         System.out.println("Nenhuma das opções");   
     }
     input.close();
    }
}
