import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
    
     System.out.println("Digite a nota do aluno de peso cinco para saber sua média ponderada: ");
     Double cinco = input.nextDouble();

     System.out.println("Agora digite a nota do aluno de peso três: ");
     Double tres = input.nextDouble();

     System.out.println("Digite a nota do aluno de peso dois: ");
     Double dois = input.nextDouble();

     Double media = ((cinco * 5) + (tres * 3) + (dois * 2)) / 10;

     System.out.println("A sua média ponderada é igaul a: " + media);

     input.close();
    }
}
