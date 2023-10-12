import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int numInscricao, numInscricaoMaisAlto = 0, numInscricaoMaisBaixo = 0, contAtletas = 0;
     double altura, alturaMaisAlto = 0, alturaMaisBaixo = Double.MAX_VALUE, somaAlturas = 0;

     do {
         System.out.print("Digite o número de inscrição (0 para sair): ");
         numInscricao = input.nextInt();

         if (numInscricao != 0) {
             System.out.print("Digite a altura do atleta: ");
             altura = input.nextDouble();

             if (altura > alturaMaisAlto) {
                 alturaMaisAlto = altura;
                 numInscricaoMaisAlto = numInscricao;
                }

             if (altura < alturaMaisBaixo) {
                 alturaMaisBaixo = altura;
                 numInscricaoMaisBaixo = numInscricao;
                }

             somaAlturas += altura;
             contAtletas++;
            }
        } while (numInscricao != 0);

     if (contAtletas > 0) {
         double alturaMedia = somaAlturas / contAtletas;

         System.out.println("Número de inscrição do atleta mais alto: " + numInscricaoMaisAlto);
         System.out.println("Altura do atleta mais alto: " + alturaMaisAlto);
         System.out.println("Número de inscrição do atleta mais baixo: " + numInscricaoMaisBaixo);
         System.out.println("Altura do atleta mais baixo: " + alturaMaisBaixo);
         System.out.println("Altura média dos atletas: " + alturaMedia);
        } else {
            System.out.println("Nenhum atleta foi registrado.");
        }

     input.close();
    }
}