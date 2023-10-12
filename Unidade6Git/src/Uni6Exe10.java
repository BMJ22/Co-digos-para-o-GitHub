import java.util.Scanner;

public class Uni6Exe10 {

    public Uni6Exe10() {

        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[50];

        int posicaoAtual = 0;

        int opcao = 0;

        do {

            System.out.println("Digite uma opção: \n1 - Inserir");

            System.out.println("2 - Pesquisar\n3 - Alterar");

            System.out.println("4 - Excluir\n5 - Mostrar");

            System.out.println("6 - Ordenar\n7 - Inverter\n8 - Sair");

            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:

                    posicaoAtual = inserir(teclado, numeros, posicaoAtual);

                    break;

                case 2:

                    pesquisar(teclado, numeros, posicaoAtual);

                    break;

                case 3:

                    alterar(teclado, numeros, posicaoAtual);

                    break;

                case 4:

                    posicaoAtual = excluir(teclado, numeros, posicaoAtual);

                    break;

                case 5:

                    mostrar(numeros);

                    break;

                case 6:

                    ordenar(numeros, posicaoAtual);

                    break;

                case 7:

                    inverter(numeros, posicaoAtual);

                    break;

                case 8:

                    break;

                default:

                    System.out.println("Opção inválida.");

            }

        } while (opcao != 8);
        teclado.close();
    }

    private int excluir(Scanner teclado, int[] vetor, int posicaoAtual) {

        System.out.print("Digite o valor para excluir: ");

        int numero = teclado.nextInt();

        boolean excluiu = false;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] == numero) {

                vetor[i] = 0; // Define o valor como 0 para excluir (poderia ser qualquer outro valor)

                for (int j = (i + 1); j < vetor.length; j++) {

                    vetor[j - 1] = vetor[j]; // Desloca os elementos para a esquerda

                }
                excluiu = true;
                break;
            }
        }

        if (excluiu) {
            System.out.println("Número excluído!");
        } else {
            System.out.println("Número não existe para excluir");
        }
        posicaoAtual--;

        return posicaoAtual;

    }

    private void alterar(Scanner teclado, int[] vetor, int posicao) {

        int posicaoEncontrada = pesquisar(teclado, vetor, posicao);

        if (posicaoEncontrada != -1) {
            System.out.print("Digite o novo número: ");
            int novoNumero = teclado.nextInt();
            vetor[posicaoEncontrada] = novoNumero;
        } else {

            System.out.println("Não é possível alterar");
        }
    }

    private int pesquisar(Scanner teclado, int[] vetor, int posAtual) {

        System.out.print("Digite um número para busca: ");

        int numero = teclado.nextInt();

        int posicaoEncontrado = -1;

        for (int i = 0; i < posAtual; i++) {

            if (vetor[i] == numero) {
                posicaoEncontrado = i; // Armazena a posição onde o número foi encontrado
                break;
            }
        }

        if (posicaoEncontrado != -1) {

            System.out.println("Encontrou na posição " + posicaoEncontrado);

        } else {
            System.out.println("Número não encontrado");
        }
        return posicaoEncontrado;
    }

    private void mostrar(int vetor[]) {

        for (int i = 0; i < vetor.length; i++) {

            System.out.print(vetor[i] + " ");

        }

        System.out.println();
    }

    private int inserir(Scanner teclado, int[] vetor, int posicao) {

        if (posicao != vetor.length) {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();
            vetor[posicao] = numero;
            posicao++;

        } else {
            System.out.println("O vetor já está cheio!");
        }
        return posicao;
    }

    private void ordenar(int[] vetor, int posicaoAtual) {

        // Utilizando o algoritmo Bubble Sort para ordenar os valores em ordem crescente

        for (int i = 0; i < posicaoAtual - 1; i++) {

            for (int j = 0; j < posicaoAtual - i - 1; j++) {

                if (vetor[j] > vetor[j + 1]) {

                    int temp = vetor[j];

                    vetor[j] = vetor[j + 1];

                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println("Valores ordenados!");
    }

    private void inverter(int[] vetor, int posicaoAtual) {

        int inicio = 0;

        int fim = posicaoAtual - 1;

        while (inicio < fim) {

            int temp = vetor[inicio];

            vetor[inicio] = vetor[fim];

            vetor[fim] = temp;

            inicio++;

            fim--;

        }
        System.out.println("Valores invertidos!");
    }

    public static void main(String[] args) {

        new Uni6Exe10();

    }
}

/*
 * Dado um vetor de números inteiros, com capacidade limitada a 50 elementos,
 * faça um programa que construa um menu com
 * as seguintes opções:
 * 
 * “1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver
 * espaço. Informe o usuário se o valor foi
 * incluído no vetor ou não;
 * “2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no
 * vetor;
 * “3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo
 * número a ser colocado no lugar (só para a
 * primeira ocorrência deste número). Caso o número a ser alterado exista no
 * vetor, substitua-o pelo novo número. Caso
 * contrário, informe “número não encontrado”;
 * “4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor,
 * exclua-o. Informe o usuário se o valor foi
 * excluído do vetor ou não. A posição que foi excluída o valor deve ser
 * preenchida pelo valor seguinte, sucessivamente
 * até o final dos valores do vetor;
 * “5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no
 * vetor;
 * “6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
 * “7 – Inverter valores”: desafio (ver abaixo);
 * “8 – Sair do sistema”: nesta opção deve ser finalizada a execução do
 * programa.
 * Faça um método para cada uma das opções do menu. O menu deve-se repetir até
 * que o usuário escolha a opção 8.
 * Para a opção "6 - Ordenar valores" se pode usar o "método bolha" explicado
 * neste vídeo. Existem também outros vídeos
 * que mostram a lógica de ordenação usando o "método bolha", no caso é só
 * procurar por "Bubble Sort". Um deles é Bubble
 * Sort | GeeksforGeeks. Um outro um pouco mais "divertido" procura mostrar a
 * lógica usando uma coreografia de dança:
 * Bubble sort with Hungarian, folk dance.
 * 
 * Desafio: adapte o código acima para ter mais uma opção no menu para também
 * poder inverter os elementos dentro de um
 * vetor. Assim o último elemento passa a ser o primeiro, o penúltimo passa ser
 * o segundo, e assim sucessivamente para
 * todos os elementos da lista. Mas lembre, não se deve considerar o vetor
 * inteiro, mas somente os elementos que já
 * foram adicionados no vetor. Como base use o código descrito em
 * vetorInverter.java.
 */
