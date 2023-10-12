import java.util.Scanner;

public class Uni5Exe33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 1, totalVotos = 0, votosNulos = 0, votosBrancos = 0;
        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0, votosCandidato4 = 0;

        while (opcao != 0) {
            System.out.println("Digite o código do voto (1 a 4 para candidatos, 5 para nulo, 6 para branco): ");
            opcao = input.nextInt();
            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                votosCandidato1++;
            } else if (opcao == 2) {
                votosCandidato2++;
            } else if (opcao == 3) {
                votosCandidato3++;
            } else if (opcao == 4) {
                votosCandidato4++;
            } else if (opcao == 5) {
                votosNulos++;
            } else if (opcao == 6) {
                votosBrancos++;
            } else {
                System.out.println("Opção incorreta!");
            }
            totalVotos++;
        }

        System.out.println("Total de votos para cada candidato:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");
        System.out.println("Candidato 4: " + votosCandidato4 + " votos");
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);

        double percentualNulos = (double) votosNulos / totalVotos * 100;
        double percentualBrancos = (double) votosBrancos / totalVotos * 100;
        System.out.printf("Percentual de votos nulos sobre o total: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos em branco sobre o total: %.2f%%\n", percentualBrancos);

        input.close();
    }
}
