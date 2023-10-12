import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String [] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Digite a renda anual do contribuinte: ");
     double rendaanual = input.nextDouble();

     System.out.println("Digite o núumero de dependentes do contribuinte: ");
     int dependentes = input.nextInt();

     double rendaliquida = rendaanual - ((dependentes * 0.02) * rendaanual);

     if (rendaliquida < 2000) {
        System.out.println("Renda líquida até 2000, imposto de renda não gerado.");
     } else if (rendaliquida >= 2000 && rendaliquida < 5000) {
        double imposto = (rendaliquida * 0.05);
        System.out.println("Valor do imposto (5%): " + imposto);
     } else if (rendaliquida >= 5000 && rendaliquida < 10000) {
        double imposto = (rendaliquida * 0.1);
        System.out.println("Valor do imposto(10%): " + imposto);
     } else if (rendaliquida >= 10000) {
        double imposto = (rendaliquida * 0.15);
        System.out.println("Valor do imposto(15%): " + imposto);
     }
     input.close();

    }
}
