import java.util.Scanner;

public class Uni5Exe34{
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int contador = 0;
     int opcao;

     do{
         System.out.println("Escolha entre as opções: " + "(1) encerrar a conta de um hóspede; (2) verificar número de contas encerradas; (3) sair.");
         opcao = input.nextInt();

         switch (opcao) {
               case 1: 
                 System.out.println("Digite o nome hóspede: ");
                 String nome = input.next();
                 System.out.println("Digite o número de diárias do hóspede: ");
                 int diarias = input.nextInt();

                 if (diarias < 15) {
                     double total = 50 + diarias * 7.5;
                     System.out.println("O hóspede " + nome + " tem o valor a ser pago de: " + total + " reais.");
                 } else if (diarias == 15) {
                     double total = 50 + diarias * 6.5;
                     System.out.println("O hóspede " + nome + " tem o valor a ser pago de: " + total + " reais.");
                 } else if (diarias > 15) {
                     double total = 50 + diarias * 5;
                     System.out.println("O hóspede " + nome + " tem o valor a ser pago de: " + total + " reais.");
                 } else {
                     System.out.println("Erro!");
                    }
                 contador++;
                break;
         

               case 2: 
                 System.out.println("número de hóspedes que deixaram o hotel (número de contas encerradas): " + contador);
                break;

               default: 
                 System.out.println("Opção inválida!");
                break;
            }
        } while (opcao != 3);

     input.close();
    }
}
/* Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. A taxa de serviços é de:

R$ 7,50 por diária, caso o número de diárias seja menor que 15;
R$ 6,50 por diária, caso o número de diárias seja igual a 15;
R$ 5,00 por diária, caso o número de diárias seja maior que 15.
Descreva um algoritmo que apresente as seguintes opções ao recepcionista:

(1) encerrar a conta de um hóspede;
(2) verificar número de contas encerradas;
(3) sair.
Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do hóspede e escreva o nome e 
total a ser pago. Caso a opção escolhida seja a segunda, informe o número de hóspedes que deixaram o hotel 
(número de contas encerradas). Caso a opção escolhida seja a terceira finalize a execução do algoritmo. */