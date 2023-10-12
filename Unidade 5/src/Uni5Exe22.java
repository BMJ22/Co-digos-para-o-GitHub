public class Uni5Exe22 {
    public static void main(String[] args) {
        double salario = 2000.0; 
        int ano = 1996; 
        double aumento = 0.015; 
        
        while (ano <= 2023) {
            salario += salario * aumento; 
            aumento *= 2; 
            ano++; 
        
         System.out.printf("O salário atual do funcionário é de R$%.2f\n", salario);
        }
    }
}
