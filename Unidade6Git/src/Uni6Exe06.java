import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        new Uni6Exe06();
    } 

    public Uni6Exe06() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor (n):");
        int n = input.nextInt();
        double[] valor = new double[n];
        double valor2;

        ler(valor, input);

        System.out.println("Digite um valor real para saber se está cadastrado no vetor:");
        valor2 = input.nextDouble();

        if (retorno(valor, valor2)) {
            System.out.println("Este valor informado se encontra cadastrado no vetor!");
        } else {
            System.out.println("Este valor informado não se encontra cadastrado no vetor!");
        }

        input.close();
    }

    private void ler(double[] valor, Scanner input) {
        for (int n = 0; n < valor.length; n++) {
            System.out.println("Digite o " + (n + 1) + "º valor real:");
            valor[n] = input.nextDouble();
        }
    }

    private boolean retorno(double[] valor, double valor2) {
        for (int n = 0; n < valor.length; n++) {
            if (valor[n] == valor2) {
             return true;
            }
        }
        return false;
    }
}
 //que retorne verdadeiro ou falso, para encontrar o valor.
/* Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. 
Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. 
Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. Informe para o 
usuário se este valor informado se encontra cadastrado no vetor. Faça um método para ler o vetor 
e outro, que retorne verdadeiro ou falso, para encontrar o valor. */