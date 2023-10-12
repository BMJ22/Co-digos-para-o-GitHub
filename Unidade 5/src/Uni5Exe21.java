public class Uni5Exe21 {
    public static void main(String[] args) {
        double alturaChico = 1.5; 
        double alturaZe = 1.1;
        int anos = 0; 
        
        while (alturaZe <= alturaChico) {
            alturaChico += 0.02; 
            alturaZe += 0.03; 
            anos++;
        }
        System.out.println("Após " + anos + " anos, Zé será mais alto do que Chico.");
    }
}
