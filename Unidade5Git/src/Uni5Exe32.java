import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.println("Digite em qual dia da semana cai o primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado)");
     int primeiroDiaSemana = input.nextInt();

     System.out.println("Digite o número de dias que o mês possui:");
     int numeroDiasMes = input.nextInt();

     System.out.println("Dom Seg Ter Qua Qui Sex Sab");

     int i = 1;
     while (i < primeiroDiaSemana) {
         System.out.print("    ");  // 4 espaços em branco para cada dia.
         i++;
        }

     int dia = 1;
     while (dia <= numeroDiasMes) {
         System.out.printf("%3d ", dia);

         // Verifica se o próximo dia é um domingo. 
         if ((dia + primeiroDiaSemana - 1) % 7 == 0) { 
             System.out.println();  //Quebra de linha para começar uma nova semana.
            }

         dia++;
        }

     input.close();
    }
} /* revisar a lógica do exercício */

/* Escreva um programa que imprime um calendário para um determinado mês. 
O calendário deve conter cada dia do mês e o dia da semana correspondente. 
A entrada consiste de um inteiro especificando em que dia da semana cai o 
primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado) e um inteiro 
especificando o número de dias que o mês possui.

Exemplo: p = 3 n = 31

D	S	T	Q	Q	S	S
        1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31	 */