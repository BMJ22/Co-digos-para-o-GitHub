import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade do primeiro filho: ");
        int primeiro = input.nextInt();

        System.out.println("Digite a idade do segundo filho: ");
        int segundo = input.nextInt();

        System.out.println("Digite a idade do terceiro filho: ");
        int terceiro = input.nextInt();

        if (primeiro == segundo && primeiro == terceiro) {
           System.out.println("Eles são trigêmeos!");
        } else if (primeiro == segundo || primeiro == terceiro || segundo == terceiro) {
           System.out.println("Eles são gêmeos!");
        } else {
           System.out.println("Eles são apenas irmãos!");
        }
        input.close();
    }
}