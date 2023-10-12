import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double pesoPeixe = 0;

     System.out.println("limite diário (em quilogramas)");
     double limite = input.nextDouble();

     System.out.println("peso (em gramas) de cada peixe");
     double peso = input.nextDouble(); 
     
     double peixeKg = peso / 1000;

     pesoPeixe = pesoPeixe + peixeKg;

     while (pesoPeixe < limite) {
         System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
         String pergunta = input.next();

         if (pergunta.equals("s")) {
             System.out.println("peso (em gramas) de cada peixe");
             peso = input.nextDouble(); 
             pesoPeixe = pesoPeixe + peixeKg; 
         } else {
             System.out.println("peso total da pesca obtido até agora: " + pesoPeixe + "kg");
             break;
            }
        } 

     if (pesoPeixe > limite) { 
         System.out.println("Peso excedido!");
        }
     input.close();
    }
}
/* Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. 
Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas) 
de cada peixe e escreva o peso total da pesca obtido até aquele ponto. Quando o limite diário 
for excedido escreva uma mensagem e encerre a execução do algoritmo. Para prosseguir com a 
entrada de dados de pesos de cada peixe o algoritmo deve apresentar a seguinte mensagem: 
“deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”. */