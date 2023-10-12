import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int contadorNenhum = 0;
        int contadorCPM = 0;
        int contadorSkank = 0;
        int contadorJota = 0;
        System.out.println("Deseja votar? s (SIM) / n (NÃO)");
        char opcao = input.next().toLowerCase().charAt(0);

        while (opcao == 's'){
            System.out.println("Digite a opção: ");
            System.out.println("1 - Nenhum");   
            System.out.println("2 - CPM22");  
            System.out.println("3 - Skank");  
            System.out.println("4 - Jota Quest");  
            int opcaoEleicao = input.nextInt();

                switch (opcaoEleicao){
                    case 1:
                        contadorNenhum++;
                    break;

                    case 2:
                        contadorCPM++;
                    break;

                    case 3:
                        contadorSkank++;
                    break;

                    case 4:
                        contadorJota++;
                    break;

                    default:
                        System.out.println("Erro");
                    break;

            }

            System.out.println("Deseja novamente votar? s (SIM) / n (NÃO)");
            opcao = input.next().toLowerCase().charAt(0);
            
            
        }

         int maior = Math.max(Math.max(contadorNenhum, contadorCPM), Math.max(contadorSkank,contadorJota));

            if (maior == contadorNenhum){
                System.out.println("Nenhum é o vencedor");   
            } else if (maior == contadorCPM){
                System.out.println("CPM22 é o vencedor");   
            } else if (maior == contadorSkank){
                System.out.println("Skank é o vencedor"); 
            } else {
                System.out.println("Jota Quest é o vencedor"); 
            } 

            System.out.println(" "); 

            System.out.println("Votos do Nenhum: " + contadorNenhum);   
            System.out.println("Votos do CPM22: " + contadorCPM);  
            System.out.println("Votos do Skank" + contadorSkank);  
            System.out.println("Votos do Jota Quest" + contadorJota); 

            double totalVotos = contadorNenhum + contadorCPM + contadorSkank + contadorJota;

            double percentualNenhum = (contadorNenhum / totalVotos) * 100;
            double percentualCPM = (contadorCPM / totalVotos) * 100;
            double percentualSkank = (contadorSkank / totalVotos) * 100;
            double percentualJota = (contadorJota / totalVotos) * 100;

            System.out.println("Percentual de votos do Nenhum: " + percentualNenhum + "%");
            System.out.println("Percentual de votos do CPM22: " + percentualCPM + "%");
            System.out.println("Percentual de votos do Skank: " + percentualSkank + "%");
            System.out.println("Percentual de votos do Jota Quest: " + percentualJota + "%");
        input.close();
    }
}
/* Uma emissora de rádio decidiu promover uma eleição para determinar o melhor conjunto do ano segundo a opinião dos ouvintes. 
Entraram na disputa apenas os quatro conjuntos mais solicitados durante o ano. Os votos são informados através de códigos:

código	conjunto
1	Nenhum de Nós
2	CPM22
3	Skank
4	Jota Quest
Descreva um algoritmo que:

informe o total de votos para cada grupo;
informe o percentual dos votos para cada grupo;
informe o grupo vencedor.
O algoritmo deve apresentar ao usuário a seguinte mensagem: mais um voto: s (SIM) / n (NÃO)? 
antes de prosseguir com a entrada de dados. */