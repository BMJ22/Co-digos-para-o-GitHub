import java.util.Scanner;

public class Uni6Exe09 {

    public static void main(String[] args) {
        new Uni6Exe09();
    }

    public Uni6Exe09() {
        Scanner input = new Scanner(System.in);
        int[][] clientes = new int[30][3]; // O primeiro [] representam a dimensão das linhas da matriz e o segundo [] representam a dimensão das colunas da matriz.
        ler(clientes, input);
        double media = mediaTotal(clientes);
        double mediaHomens = mediaHomens(clientes);
        int notaMulherNova = mulherNova(clientes);
        int contadorMulher50 = mulher50(clientes, mediaHomens);
        imprimir(media, mediaHomens, notaMulherNova, contadorMulher50);
        input.close();
    }

    private void ler(int[][] clientes, Scanner input) {
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Digite seu gênero: \n1 - Feminino \n2 - Masculino");
            int genero = input.nextInt();

            if (genero == 1 || genero == 2) {
                clientes[i][0] = genero;
            } else {
                while (genero != 1 && genero != 2) {
                    System.out.println("Ops número digitado está errado!");
                    System.out.println("Digite novamente o seu gênero: \n1 - Feminino \n2 - Masculino");
                    genero = input.nextInt();

                    if (genero == 1 || genero == 2) {
                        clientes[i][0] = genero;
                    }
                }
            }

            System.out.println("Faça sua avaliação de 0 a 10: ");
            int nota = input.nextInt();

            if (nota >= 0 && nota <= 10) {
                clientes[i][1] = nota;
            } else {
                while (nota < 0 || nota > 10) {
                    System.out.println("Ops número digitado está errado!");
                    System.out.println("Digite novamente sua avaliação de 0 a 10");
                    nota = input.nextInt();

                    if (nota >= 0 && nota <= 10) {
                        clientes[i][1] = nota;
                    }
                }
            }
            System.out.println("Digite sua idade: ");
            int idade = input.nextInt();
            clientes[i][2] = idade;
        }
    }

    private double mediaTotal(int[][] clientes){
        int somaNotas = 0;
        int totalNotas = 0;

        for (int i = 0; i < clientes.length; i++){
            int nota = clientes[i][1];
            somaNotas += nota;
            totalNotas++;
        }

        double media = somaNotas / totalNotas;
        return media;
    }

    private double mediaHomens(int[][] clientes){
        int contadorHomens = 0;
        int somaHomens = 0;
        for (int i = 0; i < clientes.length; i++){
            if (clientes[i][0] == 2){
                int notaHomens = clientes[i][1];
                somaHomens += notaHomens;
                contadorHomens++;
            }
        }
        double mediaHomens = somaHomens / contadorHomens;
        return mediaHomens;
    }

    private int mulherNova(int[][] clientes){
        int menorIdadeM = Integer.MAX_VALUE;
        int notaMulherNova = 0;

        for (int i = 0; i < clientes.length; i++){
            if (clientes[i][0] == 1 && clientes[i][2] < menorIdadeM){
                notaMulherNova = clientes[i][1];
            }
        }
        return notaMulherNova;
    }

    private int mulher50(int[][] clientes, double media){
        int contadorMulher50 = 0;
        for (int i = 0; i < clientes.length; i++){
            
            if (clientes[i][2] > 50 && clientes[i][0] == 1 && clientes[i][1] > media){
                contadorMulher50++;
            }
        }
        return contadorMulher50;
    }

    private void imprimir(double media, double mediaHomens, int notaMulherNova, int contadorMulher50){
        System.out.println("A nota média recebida pelo cinema: " + media);
        System.out.println("A nota tribuída pelos homens: " + mediaHomens);
        System.out.println("A nota atribuída pela mulher mais jovem: " + notaMulherNova);
        System.out.println("Quantidade de mulheres acima de 50 que deram a nota maior que a media: " + contadorMulher50);
    }
}

/* Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de
 * seus clientes.
 * Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino
 * 2=masculino), uma
 * nota para o cinema (zero até dez, valor inteiro) e a idade.
 * 
 * Baseado nisto faça um programa que informe:
 * 
 * qual a nota média recebida pelo cinema;
 * qual a nota média atribuída pelos homens;
 * qual a nota atribuída pela mulher mais jovem;
 * quantas das mulheres com mais de 50 anos deram nota superior a média recebida
 * pelo cinema.
 * Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz) e
 * métodos para a resolução deste exercício.
 */