import java.util.Scanner;

public class Uni5Exe28 {
  public static void main(String[] args) {
    int nenhumDeNos = 0;
    int cpm22 = 0;
    int skank = 0;
    int jotaQuest = 0;
    int totalVotos = 0;

    Scanner input = new Scanner(System.in);
    String continuarVotando = "s";

    while (continuarVotando.equals("s")) {
      System.out.print("Digite o código do conjunto que deseja votar (1-Nenhum de Nós, 2-CPM22, 3-Skank, 4-Jota Quest): ");
      int codigoConjunto = input.nextInt();

      switch (codigoConjunto) {
        case 1:
          nenhumDeNos++;
          break;
        case 2:
          cpm22++;
          break;
        case 3:
          skank++;
          break;
        case 4:
          jotaQuest++;
          break;
        default:
          System.out.println("Código inválido. Tente novamente.");
          continue;
      }

      totalVotos++;
      System.out.print("Mais um voto? (s/n) ");
      continuarVotando = input.next();
    }

    System.out.println("Total de votos para Nenhum de Nós: " + nenhumDeNos);
    System.out.println("Total de votos para CPM22: " + cpm22);
    System.out.println("Total de votos para Skank: " + skank);
    System.out.println("Total de votos para Jota Quest: " + jotaQuest);
    System.out.println("Percentual de votos para Nenhum de Nós: " + ((double) nenhumDeNos / totalVotos * 100) + "%");
    System.out.println("Percentual de votos para CPM22: " + ((double) cpm22 / totalVotos * 100) + "%");
    System.out.println("Percentual de votos para Skank: " + ((double) skank / totalVotos * 100) + "%");
    System.out.println("Percentual de votos para Jota Quest: " + ((double) jotaQuest / totalVotos * 100) + "%");

    if (nenhumDeNos > cpm22 && nenhumDeNos > skank && nenhumDeNos > jotaQuest) {
      System.out.println("O grupo vencedor é: Nenhum de Nós");
    } else if (cpm22 > skank && cpm22 > jotaQuest) {
      System.out.println("O grupo vencedor é: CPM22");
    } else if (skank > jotaQuest) {
      System.out.println("O grupo vencedor é: Skank");
    } else {
      System.out.println("O grupo vencedor é: Jota Quest");
    }
    input.close();
  }
}
