import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int qtdMulheres = 0;
     double somaAlturaMulheres = 0;
     int qtdPessoas = 0;
     double somaAlturaPessoas = 0;

     System.out.print("Digite a altura da pessoa (0 para sair): ");
     double altura = input.nextDouble();

     while (altura != 0) {
         System.out.print("Digite o sexo da pessoa (M/F): ");
         char sexo = input.next().charAt(0);

         if (sexo == 'F' || sexo == 'f') {
             qtdMulheres++;
             somaAlturaMulheres += altura;
            }

         qtdPessoas++;
         somaAlturaPessoas += altura;

         System.out.print("Digite a altura da pessoa (0 para sair): ");
         altura = input.nextDouble();
        }

     double mediaAlturaMulheres = qtdMulheres > 0 ? somaAlturaMulheres / qtdMulheres : 0;
     double mediaAlturaPessoas = qtdPessoas > 0 ? somaAlturaPessoas / qtdPessoas : 0;

     System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
     System.out.println("Média de altura do grupo: " + mediaAlturaPessoas);
     input.close();
    }
}