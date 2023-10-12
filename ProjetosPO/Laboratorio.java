import java.util.ArrayList;
import java.util.Scanner;

public class Laboratorio {
    private ArrayList<Computador> listaComputadores;

    public Laboratorio() {
        listaComputadores = new ArrayList<Computador>();
        adicionarComputador();
        imprimir();
    } 

    private void adicionarComputador() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número serial ou \"0\" para sair");
        int numeroSerial = input.nextInt();

     while(numeroSerial != 0) {
        System.out.println("Digite a capacidade HD:");
        int capacidadeHD = input.nextInt();

        System.out.println("Digite a quantidade Memória:");
        int quantidadeMemoria = input.nextInt();

        Computador com = new Computador(numeroSerial, capacidadeHD, quantidadeMemoria);

        listaComputadores.add(com);

        System.out.println("Digite o número serial ou \"0\" para sair");
        numeroSerial = input.nextInt();
     }

     input.close();
    }

    private void imprimir() {
        int totalMemoria = 0;
        for (Computador com : listaComputadores) {
            System.out.println(com.toString());
            totalMemoria += com.getQuantidadeMemoria();
        }
        System.out.println("Total memoria: " + totalMemoria);
    }

    public static void main(String[] args) {
        new Laboratorio();
    }
}


