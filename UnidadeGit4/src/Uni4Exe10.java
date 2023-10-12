import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade do Marquinhos: ");
        int marquinhos = input.nextInt();

        System.out.println("Digite a idade do Zezinho: ");
        int zezinho = input.nextInt();

        System.out.println("Digite a idade do Luluzinha: ");
        int luluzinha = input.nextInt();
      
        if (marquinhos < zezinho && marquinhos < luluzinha) { //&& : e.
           System.out.println("Marquinhos é o caçula!");
        } else if (zezinho < luluzinha) { /* Não é necessário incluir a condição "zezinho < marquinhos" na segunda parte do if.
         Isso porque, se a idade de Marquinhos não for a menor, já sabemos que ele não é o caçula.*/
           System.out.println("Zezinho é o caçula!");
        } else {
           System.out.println("Luluzinha é a caçula!");
        }
        input.close();
    }
}
