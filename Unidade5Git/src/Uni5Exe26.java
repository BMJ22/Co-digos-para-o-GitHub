import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int contadorAcima = 0;
     int contadorAcimakm = 0;
     int contadorTotal = 0;

     System.out.println("Digite aqui o valor do pedágio ao qual você se nega a pagar: ");
     double valorLimite = input.nextDouble();

     while (valorLimite > 0) {
         System.out.println("Digite o custo do pedágio: ");
         double custoPedagio = input.nextDouble();
         
         if (custoPedagio < 0) {
             break;
            }

         contadorTotal++;

         if (custoPedagio > valorLimite) {
             contadorAcima++;
            } 

         System.out.println("Digite a distância (em Km) do trecho: ");
         double distancia = input.nextDouble();

         if (distancia > 150 && custoPedagio < valorLimite) {
             contadorAcimakm++;
            }  
        } 

     System.out.println(contadorAcima + "(trechos com valor acima do qual ele nega-se a pagar)");
     System.out.println(contadorTotal + "(quantidade de trechos informados)");
     System.out.println(contadorAcimakm + "(trechos acima de 150km com valor aceito por ele)");

     input.close();
    }
}
/* Astolfo resolveu fazer uma viagem para conhecer o nosso país Ele pretende visitar várias cidades, dividindo assim a viagem 
em vários trechos. Entretanto Astolfo se nega a passar por estradas cujo custo do pedágio exceda um determinado valor. Faça 
um programa que leia inicialmente o valor do pedágio ao qual Astolfo se nega a pagar. A seguir leia várias duplas de valores 
representando respectivamente o custo do pedágio e a distância (em Km) do trecho. Calcular e escrever:

quantos trechos da viagem possuem um valor de pedágio acima do qual Astolfo nega­se a pagar;
quantos trechos foram informados;
quantos trechos acima de 150Km de distância possuem um valor de pedágio que Astolfo concorda em pagar.

OBS: O programa será encerrado ao ser fornecido um valor de pedágio negativo. Neste caso a leitura 
da distância não deve ser executada. Os resultados devem ser impressos no final do programa.

Exemplo de entrada:

Valor máximo de pedágio: 7,00
Pedágio	Distância
R$ 6,50	   200
R$ 5,00	    70
R$ 10,00	80
R$ 12,00   250
R$ 4,00	   180
R$ 15,00	30
-1	

Saída para o exemplo de entrada:

3 (trechos com valor acima do qual ele nega-se a pagar);
6 (quantidade de trechos informados);
2 (trechos acima de 150km com valor aceito por ele). */