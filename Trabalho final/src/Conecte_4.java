import java.util.Scanner;

public class Conecte_4 {
    public static void main(String[] args) throws Exception {
        new Conecte_4();
    }
      // false = continua   e   true = encerra/para

    public Conecte_4() {
        Scanner teclado = new Scanner(System.in);
        boolean check = false; /* controlar o fluxo do loop principal, permitindo que o jogador decida jogar novamente 
        ou sair do jogo. Ele mantém o loop em execução enquanto o valor de check for false, garantindo que o jogo possa 
        ser reiniciado caso o jogador deseje continuar jogando. */
        
        do {
        char[][] tabuleiro = new char[6][7];
        char jogador = ' ';
        char computador = ' ';
        boolean fim = false; //o fim valida a vitória (método)
        int[] camadaColuna = {5, 5, 5, 5, 5, 5, 5};

        Criacao(tabuleiro);
        jogador = EscolhaCor(teclado); // método mais para baixo

        if (jogador == 'A') {
            computador = 'V';
        } else {
            computador = 'A';
        }

        do {
            JogadaPlayer(teclado, tabuleiro, camadaColuna, jogador);
            JogadaComputador(camadaColuna, tabuleiro, computador);
            Output(tabuleiro);
            fim = ValidarVitoria(camadaColuna, tabuleiro, jogador, computador); 

        } while (!fim);
        check = JogarNovamente(teclado); //
    } while (!check);

        teclado.close();
    }

    private void Criacao(char[][] tabuleiro) { // ;)
        for (int linhas = 0; linhas < 6; linhas++) {
            for (int colunas = 0; colunas < 7; colunas++) {
                tabuleiro[linhas][colunas] = 'B'; //RF01 - o tabuleiro deve começar com todas as casas em branco representando pelo valor "B" 
            }
        }
    }

    private char EscolhaCor(Scanner teclado) {
        char op = ' ';
        boolean check = false; // permitindo que o jogador decida jogar novamente ou sair do jogo.
        do {
            System.out.println("\nEscolha a sua cor: A - Amarelo; V - Vermelho");
            op = teclado.next().trim().toUpperCase().charAt(0);

            if (op == 'A' || op == 'V') {
                check = true; // o loop continua executando até que o jogador forneça uma entrada válida.
            }
        } while (!check); 
        return op; 
    }

    private void JogadaPlayer(Scanner teclado, char[][] tabuleiro, int[] camadaColuna, char jogador) {
        int posicao;
        boolean check = false; 
        do {
            System.out.println("\nEscolha a posição de jogada (entre 1 e 7): \n(0 para ver o tabuleiro)");
            posicao = teclado.nextInt();

            if (posicao == 0) { //imprime tabuleiro
                Output(tabuleiro);
            } else if (posicao >= 1 && posicao <= 7) {
                posicao--; //diminui 1 para poder encaixar na matriz (que vai ate 6 (7 - 1 = 6))
                if (camadaColuna[posicao] >= 0) {
                    tabuleiro[camadaColuna[posicao]][posicao] = jogador; /* A variável jogador contém a cor escolhida pelo 
                    jogador ('A' ou 'V'), e camadaColuna[posicao] representa a linha em que a jogada será inserida, pois 
                    camadaColuna armazena o índice da próxima camada disponível em cada coluna. */

                    camadaColuna[posicao]--; // A variável camadaColuna[posicao] é decrementada, indicando que a camada (linha) naquela coluna foi preenchida.
                    check = true; 
                } else {
                    System.out.println("\nJogada inválida. Coluna cheia.");
                }
            }
        } while (!check); /* controlar o fluxo do loop principal, permitindo que o jogador decida jogar novamente 
        ou sair do jogo. Ele mantém o loop em execução enquanto o valor de check for false, garantindo que o jogo possa 
        ser reiniciado caso o jogador deseje continuar jogando. */
    }

    private void JogadaComputador(int[] camadaColuna, char[][] tabuleiro, char computador) {
        boolean check = false; 
        do {
            int posicaoComp = (int) (Math.random() * 7); /* A linha int posicaoComp = (int) (Math.random() * 7); está gerando 
            um número aleatório entre 0 e 6, inclusive, e armazenando esse valor na variável posicaoComp. O método Math.random() 
            retorna um número pseudoaleatório no intervalo [0, 1). Multiplicando esse valor por 7, obtemos um número no intervalo 
            [0, 7). Em seguida, realizamos um cast para int para obter um número inteiro. Dessa forma, a expressão 
            (int) (Math.random() * 7) gera um número inteiro aleatório entre 0 e 6. Esse número será utilizado como índice */
            if (camadaColuna[posicaoComp] >= 0) { // resto igual o de cima
                tabuleiro[camadaColuna[posicaoComp]][posicaoComp] = computador;
                camadaColuna[posicaoComp]--;
                check = true;
            }
        } while (!check); 
    }

    private void Output(char[][] tabuleiro) { // ;)
        // IMPRIME TABULEIRO
        System.out.println(); // espaço
        for (int linhas = 0; linhas < 6; linhas++) {
            for (int colunas = 0; colunas < 7; colunas++) {
                System.out.print(tabuleiro[linhas][colunas] + " "); // " " espaco entre as colunas
            }
            System.out.println(); // espaço
        }
    }

    private boolean ValidarVitoria(int[] camadaColuna, char[][] tabuleiro, char jogador, char computador) {
        int validarEmpate = 0;
        int validarJogador = 0;
        int validarComputador = 0;
        
        // VALIDAR EMPATE
        for (int i = 0; i < camadaColuna.length; i++) {
            if (camadaColuna[i] == -1) { /* vai de 0 a 5 as colunas = 6, quando -1.. Inicialmente, todas as posições do 
                array são preenchidas com o valor 5, indicando que nenhuma coluna foi preenchida ainda. Durante o jogo, 
                quando uma coluna é preenchida completamente, a respectiva posição em camadaColuna é atualizada para -1, 
                indicando que não há mais espaço disponível naquela coluna para novas jogadas. */
                validarEmpate++;
            }
        }
        if (validarEmpate == 7) {
            System.out.println("\nEMPATE"); 
            return true; /* Nesse caso, a instrução return true; é utilizada para interromper a execução do jogo e informar 
            que houve um empate. O valor booleano true indica que a condição de empate foi alcançada. */
        } else {
            
            // VALIDACAO HORIZONTAL JOGADOR
            for (int linhas = 0; linhas < 6; linhas++) {
                for (int colunas = 0; colunas < 7; colunas++) {
                    if (tabuleiro[linhas][colunas] == jogador){ // se a jogada foi feita pelo jogador
                        validarJogador++;
                        if (validarJogador == 4) {
                            System.out.println("\nVOCÊ VENCEU!");
                            return true; // interrompe a execução retorna para o check 
                        }
                    } else {
                        validarJogador = 0; // para contar apenas 4 escolhas seguidas, nao ganhar se for assim vvavv
                    }
                }
            }

            // VALIDACAO HORIZONTAL COMPUTADOR
            for (int linhas = 0; linhas < 6; linhas++) {
                for (int colunas = 0; colunas < 7; colunas++) {
                    if (tabuleiro[linhas][colunas] == computador){
                        validarComputador++;
                        if (validarComputador == 4) {
                            System.out.println("\nVOCÊ PERDEU!");
                            return true;
                        }
                    } else {
                        validarComputador = 0;
                    }
                }
            }

            // VALIDACAO VERTICAL JOGADOR (primeiro colunas depois linhas)
            for (int colunas = 0; colunas < 7; colunas++) {
                for (int linhas = 0; linhas < 6; linhas++) {
                    if (tabuleiro[linhas][colunas] == jogador){
                        validarJogador++;
                        if (validarJogador == 4) {
                            System.out.println("\nVOCÊ VENCEU!");
                            return true;
                        }
                    } else {
                        validarJogador = 0;
                    }
                }
            }

            // VALIDACAO VERTICAL COMPUTADOR
            for (int colunas = 0; colunas < 7; colunas++) {
                for (int linhas = 0; linhas < 6; linhas++) {
                    if (tabuleiro[linhas][colunas] == computador){
                        validarComputador++;
                        if (validarComputador == 4) {
                            System.out.println("\nVOCÊ PERDEU!");
                            return true;
                        }
                    } else {
                        validarComputador = 0;
                    }
                }
            }

         // VALIDACAO DIAGONAL PARA BAIXO JOGADOR
            for (int linhas = 0; linhas < tabuleiro.length - 3; linhas++) { 
                for (int colunas = 0; colunas < tabuleiro[0].length - 3; colunas ++) { /* colunas < tabuleiro[0].length - 3: 
                    A condição de continuação do loop é que colunas seja menor do que o tamanho da primeira dimensão do 
                    tabuleiro menos 3.    E tabuleiro[0].length retorna o número de colunas do tabuleiro (assumindo que todas 
                    as linhas têm o mesmo número de colunas). */

                    if (tabuleiro[linhas][colunas] == jogador && // vai aumentar uma coluna e uma linha .
                        tabuleiro[linhas + 1][colunas + 1] == jogador && //                               .
                        tabuleiro[linhas + 2][colunas + 2] == jogador &&
                        tabuleiro[linhas + 3][colunas + 3] == jogador) {
                            System.out.println("\nVOCÊ GANHOU!");
                            return true;
                    }
                }
            }

         // VALIDACAO DIAGONAL PARA BAIXO COMPUTADOR
        for (int linhas = 0; linhas < tabuleiro.length - 3; linhas++) {
            for (int colunas = 0; colunas < tabuleiro[0].length - 3; colunas ++) {
                if (tabuleiro[linhas][colunas] == computador && // vai aumentar uma coluna e uma linha .
                    tabuleiro[linhas + 1][colunas + 1] == computador && //                               .
                    tabuleiro[linhas + 2][colunas + 2] == computador &&
                    tabuleiro[linhas + 3][colunas + 3] == computador) {
                        System.out.println("\nVOCÊ PERDEU!");
                        return true;
                }
            }
        }

        // VALIDACAO DIAGONAL PARA CIMA JOGADOR
        for (int linhas = 3; linhas < tabuleiro.length; linhas++) {
            for (int colunas = 0; colunas < tabuleiro[0].length - 3; colunas ++) { //                          .                         
                if (tabuleiro[linhas][colunas] == jogador && // vai aumentar uma coluna e dininuir uma linha .
                    tabuleiro[linhas - 1][colunas + 1] == jogador &&
                    tabuleiro[linhas - 2][colunas + 2] == jogador &&
                    tabuleiro[linhas - 3][colunas + 3] == jogador) {
                        System.out.println("\nVOCÊ GANHOU!");
                        return true;
                }
            }
        }

        // VALIDACAO DIAGONAL PARA CIMA COMPUTADOR
        for (int linhas = 3; linhas < tabuleiro.length; linhas++) {
            for (int colunas = 0; colunas < tabuleiro[0].length - 3; colunas ++) { //                              .
                if (tabuleiro[linhas][colunas] == computador &&  // vai aumentar uma coluna e dininuir uma linha .
                    tabuleiro[linhas - 1][colunas + 1] == computador &&
                    tabuleiro[linhas - 2][colunas + 2] == computador &&
                    tabuleiro[linhas - 3][colunas + 3] == computador) {
                        System.out.println("\nVOCÊ PERDEU!");
                        return true;
                }
            }
        }
        }
        return false; // O retorno false indica que o jogo deve continuar, pois não houve uma condição de vitória ou empate.
    }

    private boolean JogarNovamente(Scanner teclado) {
        int op = 0;
        boolean check = false; 
        do {
            System.out.println("\nDeseja jogar novamente?\n1. Sim   2. Não");
            op = teclado.nextInt();
            if (op == 1 || op == 2) {
                check = true; // para o loop se os valores fornecidos corresponderem a um desses valores estabelecidos (1 ou 2).
            } else {
                System.out.println("Opção inválida.");
            }
        } while (!check); 
        if (op == 1) { 
            return false; // continuara o loop, no caso o jogo reiniciará 
        }
        return true; // para a execucao pois ele nao ecolheu o valor 1, consequentemente foi 2 significa que o programa deve encerrar pois o jogador nao quer jogar novamente
    }
}