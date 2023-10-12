import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     System.out.println("Digite o valor da distância percorrida (em Km) para definirmos a velocidade média e a quantidade de combustível gasto na viagem: ");
     Double distancia = input.nextDouble();

     System.out.println("Agora digite o tempo gasto: ");
     Double tempo = input.nextDouble();

     Double litros = distancia / 12;
     Double total = distancia / tempo;

     System.out.println("A quantidade de combustível gasto na viagem é: " + String.format("%.2f", litros) + " litros" + "\n a velocidade média é:" + String.format("%.2f", total) + " Km");

     input.close();
    }
}

