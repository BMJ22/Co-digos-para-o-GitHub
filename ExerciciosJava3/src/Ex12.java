import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite seu nome: ");
     String nome = input.next();

     System.out.println("Digite o seu número de horas trabalhadas mensais: ");
     Double horas = input.nextDouble();

     System.out.println("Digite o número de dependentes: ");
     int dependentes = input.nextInt();

     Double salariobruto = (horas * 10) + (dependentes * 60);
     Double salariotrabalho = (horas * 10);
     Double primeirodesconto = salariotrabalho - (salariotrabalho * 0.085);
     Double segundodesconto = primeirodesconto - (primeirodesconto * 0.05);
     Double valorsomado = segundodesconto + (dependentes * 60);

     System.out.println(nome + " seu salário bruto é: " + salariobruto  + " reais" + " e o seu salário líquido é: " + valorsomado + " reais");

     input.close();
    }
}