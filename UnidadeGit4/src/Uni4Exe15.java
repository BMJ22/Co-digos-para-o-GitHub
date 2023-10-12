import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite a quantidade de meses que o funcionário foi admitido: ");
     int mes = input.nextInt();

     System.out.println("Digite o salário do funcionário");
     double salario = input.nextInt();

     if (mes <= 12 && mes > 0) {
     double total = (salario * 0.05) + salario;
     System.out.println("Salário com reajuste (5%): " + total + " reais.");
     } else if (mes >= 13 && mes <= 48) {
        double total = (salario * 0.07) + salario;
        System.out.println("Salário com reajuste (7%): " + total + " reais.");
     } else {
        System.out.println("Salário (sem reajuste): " + salario + " reais." + 
        "\nSe o resultado apresestar discordância, veja se suas informações apresentadas estão corretas, obrigado(a).");
     }
     input.close();
    }
}