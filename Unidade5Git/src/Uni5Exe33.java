import java.util.Scanner;

public class Uni5Exe33{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int candidato1 = 0;
     int candidato2 = 0;
     int candidato3 = 0;
     int candidato4 = 0;
     int nulo = 0;
     int branco = 0;
     int totalVotos = 0;
     int numero;

     do {
         System.out.println("Escolha um candidato para presidência ou, se quiser finalizar, digite 0: " + "\n1, 2, 3, 4 = voto para o respectivo candidato; 5 = voto nulo; 6 = voto em branco.");
         numero = input.nextInt();

         switch (numero) {
               case 1: 
                 candidato1++;
                break;

               case 2: 
                 candidato2++;
                break;

               case 3: 
                 candidato3++;
                break;

               case 4: 
                 candidato4++;
                break;

               case 5: 
                 nulo++;
                break;

               case 6: 
                 branco++;
                break;

               default:
                 System.out.println("Opção incorreta");
            }
         totalVotos++;
        } while (numero != 0);

     totalVotos = candidato1 + candidato2 + candidato3 + candidato4 + nulo + branco;
     double somaBN = branco + nulo;
     double percentual = (somaBN / totalVotos) * 100;


     System.out.println("Total de votos para cada candidato:" + "\ncandidato1 = " + candidato1 + 
     "\ncandidato2 = " + candidato2 + "\ncandidato3 = " + candidato3 + "\ncandidato4 = " + candidato4);

     System.out.println("\nTotal de votos nulos: " + nulo);

     System.out.println("Total de votos brancos: " + branco);

     System.out.println("Percentual brancos e nulos: " + percentual + "%");
     input.close();
    }
}
/* Em uma eleição para presidência, existem 4 candidatos. 
Os votos são informados através de código. Os dados utilizados 
para votação obedecem a seguinte codificação:

1, 2, 3, 4 = voto para o respectivo candidato;
5 = voto nulo;
6 = voto em branco.

Elabore um programa que calcule e escreva:

total de votos para cada candidato;
total de votos nulos;
total de votos em branco;
percentual dos votos em branco e nulos sobre o total.

Se o usuário informar um número de operação incorreto, emitir a mensagem 
“Opção incorreta” e persistir solicitando um número de opção correto. 
Para interromper a operação, o usuário poderá fornecer o número 0. */