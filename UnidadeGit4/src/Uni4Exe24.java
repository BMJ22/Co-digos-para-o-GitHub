import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 3 valores:");
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ordenar em ordem crescente");
        System.out.println("2 - Ordenar em ordem decrescente");
        System.out.println("3 - Colocar o maior valor no meio");
        int opcao = input.nextInt();

        int maior;
        int menor;
        int medio;

        if (valor1 >= valor2 && valor1 >= valor3) {
            maior = valor1;
            if (valor2 >= valor3) {
                medio = valor2;
                menor = valor3;
            } else {
                medio = valor3;
                menor = valor2;
            }
        } else if (valor2 >= valor1 && valor2 >= valor3) {
            maior = valor2;
            if (valor1 >= valor3) {
                medio = valor1;
                menor = valor3;
            } else {
                medio = valor3;
                menor = valor1;
            }
        } else {
            maior = valor3;
            if (valor1 >= valor2) {
                medio = valor1;
                menor = valor2;
            } else {
                medio = valor2;
                menor = valor1;
            }
        }

        switch (opcao) {
            case 1:
                System.out.println(menor + ", " + medio + ", " + maior);
                break;
            case 2:
                System.out.println(maior + ", " + medio + ", " + menor);
                break;
            case 3:
                System.out.println(menor + ", " + maior + ", " + medio);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        input.close();
    }
} 
