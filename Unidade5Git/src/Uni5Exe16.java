import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe16{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     DecimalFormat numf = new DecimalFormat("0.00");

     double alturaMulher = 0;
     double alturaGrupo = 0;
     int contadorMulher = 0;
     int contador = 0;

     System.out.println("Digite a altura ou, se quiser finalizar, digite 0: ");
     double altura = input.nextDouble();

     while (altura != 0) {
     contador++;
     System.out.println("Digite o gênero da pessoa (F, M ou O): ");
     char genero = input.next().toUpperCase().trim().charAt(0);

     switch (genero) {
         case 'F': 
             alturaMulher = alturaMulher + altura;
             alturaGrupo = alturaGrupo + altura;
             contadorMulher++;
            break;

         case 'M': 
             alturaGrupo = alturaGrupo + altura;
            break;

         case 'O': 
             alturaGrupo = alturaGrupo + altura;
            break;

         default:
             System.out.println("Erro!");
        } 
        
     System.out.println("Digite a altura ou, se quiser finalizar, digite 0: ");
     altura = input.nextDouble();
     }
     
     double mediaMulher = alturaMulher / contadorMulher;
     double mediaGrupo = alturaGrupo / contador;

     System.out.println("A média da(s) mulher(es) é: " + numf.format(mediaMulher) + "\nA média do grupo é: " + numf.format(mediaGrupo));

     System.out.println("Leitura finalizada!");

     /* Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do gênero 
     (gênero = 'M' ou gênero = 'm' para masculino; gênero = 'F' e gênero = 'f' para feminino ou gênero 
     = 'O' ou gênero = 'o' para outro) de cada pessoa informe a média da altura das mulheres e a média 
     de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura. */
     input.close();
    }
}

