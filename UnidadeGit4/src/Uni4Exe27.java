import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o horário de chegada (hora e minuto): ");
        int horaChegada = input.nextInt();
        int minutoChegada = input.nextInt();

        System.out.print("Digite o horário de partida (hora e minuto): ");
        int horaPartida = input.nextInt();
        int minutoPartida = input.nextInt();

        int tempoEstacionado = (horaPartida - horaChegada) * 60 + (minutoPartida - minutoChegada);/* Transformando 
        todos os valores (em horas) em minutos e adicionando mais os minutos informados.*/

        if (tempoEstacionado <= 29) { /* Se o tempo estacionado for menor que 29 minutos, vai ser considerado 
         como 60 minutos(1 hora).*/
            tempoEstacionado = 60; 
        }

        int horasEstacionadas = (int) Math.ceil(tempoEstacionado / 60.0); /* Math.ceil(): arredonda um número 
         para cima para o inteiro mais próximo. Convertendo novamente para horas*/ 
        double valor = 0;

        switch (horasEstacionadas) {
            case 1:
            case 2:
                valor = horasEstacionadas * 5.0;
                break;
            case 3:
            case 4:
                valor = 2 * 5.0 + (horasEstacionadas - 2) * 7.5;
                break;
            default:
                valor = 2 * 5.0 + 2 * 7.5 + (horasEstacionadas - 4) * 10.0;
                break;
        }
        System.out.println("Tempo estacionado: " + horasEstacionadas + " hora(s)");
        System.out.printf("Valor a ser cobrado: R$ %.2f", valor); /* O formato "%.2f" é utilizado para formatar 
        um valor numérico em uma string com duas casas decimais.*/

        input.close();
    }
} 
