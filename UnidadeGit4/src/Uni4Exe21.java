import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite a sua altura: ");
     double altura = input.nextDouble();

     System.out.println("Digite seu peso: ");
     double peso = input.nextDouble();

     double imc = peso / (altura * altura);

     if (imc < 18.5) {
        System.out.println("Classificação: Magreza");
     } else if (imc >= 18.5 && imc <= 24.9) {
        System.out.println("Classificação: Saudável");
     } else if (imc >= 25.0 && imc <= 29.9) {
        System.out.println("Classificação: Sobrepeso");
     } else if (imc >= 30.0 && imc <= 34.9) {
        System.out.println("Classificação: Obesidade Grau I");
     } else if (imc >= 35.0 && imc <= 39.9) {
        System.out.println("Classificação: Obesidade Grau II (severa)");
     } else if (imc >= 40) {
        System.out.println("Classificação: Obesidade Grau III (mórbida)");
     }
     input.close();
 }
}