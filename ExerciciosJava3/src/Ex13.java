import java.util.Scanner;

public class Ex13 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite o comprimento da parede (em metros), para saber o gasto com a compra de azulejos: ");
     Double comprimento = input.nextDouble();

     System.out.println("Agora digite a altura da parede (em metros): ");
     Double altura = input.nextDouble();

     Double azulejos = Math.ceil((comprimento * altura) / 9); // Arredondar para cima a quantidade de azulejos.
     Double valor = azulejos * 12.5;

     System.out.println("O valor gasto com a compra de azulejos é de: " + valor + " reais.");

     input.close();
    }
}
