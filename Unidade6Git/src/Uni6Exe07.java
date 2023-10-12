import java.util.Scanner;

 public class Uni6Exe07 {
    public static void main(String[] args){
        new Uni6Exe07();
    }

    public Uni6Exe07(){
        Scanner input = new Scanner(System.in);
        int[] valores = inserir(input);  
        ordenarBolha(valores);
        imprimir(valores);
        input.close();
    }

    private int[] inserir(Scanner input){
        int posicao = 0;
        do {
            System.out.println("Digite quantas posições deseja ter:");
            posicao = input.nextInt();
            if (posicao > 20){
                System.out.println("\nDigite novamente, o numero foi acima de 20");
            }
        } while (posicao > 20);
        
        int[] valores = new int[posicao]; 
        
        for (int i = 0; i < valores.length; i++){
            System.out.println("Digite o " + (i + 1) + "° valor");
            valores[i] = input.nextInt();
        }
        return valores;
    }
    

    private void ordenarBolha(int[] valores) {
        
        // Percorre todos os elementos do array
        
        for (int i = 0; i < valores.length - 1; i++) {
           
            // Percorre o array do início ao fim-i-1
           
            for (int j = 0; j < valores.length - i - 1; j++) {
               
                /*O motivo pelo qual o loop vai até valores.length - i - 1 
                é porque, a cada iteração do loop externo 
                (o loop for com a variável i), o maior elemento do array 
                é movido para o final. Portanto, não precisamos mais comparar 
                os últimos i elementos do array, já que eles já estão ordenados.*/
                // Se o elemento atual for maior que o próximo elemento
               
                if (valores[j] > valores[j + 1]) {
                    
                    /*j + 1 é o índice do próximo 
                    elemento no array em relação ao elemento atual. 
                    Quando comparamos valores[j] e valores[j + 1], 
                    estamos comparando o elemento atual com o próximo
                    elemento no array. Se o elemento atual for maior 
                    que o próximo elemento, 
                    trocamos os dois de lugar.*/

                    // Troca os elementos de lugar
                    
                    int temporario = valores[j];
                    
                    /*Armazena o valor de valores[j] antes de trocá-lo com valores[j + 1].
                    Isso é necessário porque, para trocar dois valores de lugar,
                    precisamos armazenar um deles em uma variável temporária para não perdê-lo.*/
                    
                    valores[j] = valores[j + 1];
                    
                    valores[j + 1] = temporario;
                }
            }
        }
    }

    private void imprimir(int[] valores){
        System.out.println("");
        
        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
    }

}
// revisar esse código e esse método.
// ordenação utilizar método bolha.
/*
 * Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base
 * neste valor,
 * crie um vetor do tipo inteiro. Em seguida, solicite ao usuário para digitar
 * um número inteiro
 * várias vezes, até preencher o vetor. Esse número deverá ser armazenado no
 * vetor caso ainda não
 * exista, e se o valor já existir deve ser pedido um novo valor. Isto é, se o
 * usuário informar o
 * número 2 e já existir o número 2 em alguma posição do vetor, o número não
 * deve ser adicionado.
 * Após ter adicionado todos os números dentro do vetor, o mesmo deve ser
 * ordenado. Para isso
 * reordene os elementos internos do vetor de modo que este fique em ordem
 * crescente, conforme no
 * exemplo:
 * 
 * Vetor origem: [0][4][2][6][3]
 * Vetor ordenado: [0][2][3][4][6]
 * 
 * Crie um método para inserir os valores no vetor, outro para ordenar o vetor e
 * outro para informar
 * o vetor resultante. Para "método ordenar" se pode usar o "método bolha"
 * explicado neste vídeo. 
 */