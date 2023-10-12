public class PrincipalApolice {
    public static void main(String[] args) {
        Apolice umaApolice = new Apolice("João da Silva", 27, 900.0);
        System.out.println(umaApolice.imprimir());
        umaApolice.calcularPremio(); //revisar - chamar para ser executado e alterar o metodo imprimir
        System.out.println(umaApolice.imprimir());
        umaApolice.oferecerDesconto("Blumenau"); //revisar - chamar para ser executado e alterar o metodo imprimir
        System.out.println(umaApolice.imprimir());
    }
}
