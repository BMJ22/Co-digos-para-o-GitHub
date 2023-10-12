import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Digite o comprimento do terreno: ");
     Double comprimento = input.nextDouble();

     System.out.println("Digite a largura do terreno: ");
     Double largura = input.nextDouble();

     Double dimensoes = comprimento * largura;

     System.out.println("A dimensão do terreno é igual a: " + dimensoes);

     input.close();
    }
}