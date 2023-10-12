import java.util.Scanner;

public class Uni5Exe24 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    final int LIMITE_DIARIO_KG = input.nextInt();
    int pesoTotal = 0;
    boolean continuar = true;

    while (continuar) {
      System.out.print("Informe o peso do peixe (em gramas): ");
      int pesoPeixe = input.nextInt();
      pesoTotal += pesoPeixe;

      if (pesoTotal > LIMITE_DIARIO_KG * 1000) {
        System.out.println("Limite diário excedido!");
        continuar = false;
      } else {
        System.out.print("Deseja informar o peso de mais um peixe (s/n)? ");
        char opcao = input.next().charAt(0);
        continuar = opcao == 's' || opcao == 'S';
      }
    }

    System.out.println("Peso total da pesca: " + pesoTotal + " gramas");
    input.close();
  }

}
