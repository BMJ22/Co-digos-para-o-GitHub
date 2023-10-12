import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pontosE = 0; 
        int pontosD = 0; 
        
        while (true) {
            String ponto = input.next(); 
            
            if (ponto.equals("D")) {
                pontosD++;
            } else if (ponto.equals("E")) {
                pontosE++;
            } else {
                System.out.println("Código inválido, encerrando partida.");
                break;
            }
            
            if ((pontosE >= 21 && pontosE - pontosD >= 2) || (pontosD >= 21 && pontosD - pontosE >= 2)) {
                System.out.println("Partida encerrada. Vencedor: " + (pontosE > pontosD ? "E" : "D"));
                break;
            }
        }
        
        input.close();
    }
}
