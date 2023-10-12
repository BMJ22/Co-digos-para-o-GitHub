import java.util.Scanner;

public class Uni5Exe11 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int biscoitosQuebrados = 1;
     int biscoitosQuebradosDia = 0;
     
     for (int i = 1; i <= 16; i++) {
         if (i == 1) {
             biscoitosQuebrados = 1;
            } else if (i == 2) {
             biscoitosQuebrados = 3;
            } else {
             biscoitosQuebrados *= 3;
            }
         biscoitosQuebradosDia += biscoitosQuebrados;
        }
     System.out.println("No final do dia, a máquina quebrou " + biscoitosQuebradosDia + " biscoitos.");
     input.close();
    }
}