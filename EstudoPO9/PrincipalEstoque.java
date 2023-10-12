public class PrincipalEstoque {
    public static void main(String[] args) {
        Estoque total = new Estoque(123, 2.5, 0);
        total.adicionarProduto(1000);
        
        // Verificar a disponibilidade
        int quantidadeDesejada = 5000;
        boolean disponivel = total.verificarDisponibilidade(quantidadeDesejada);
        if (disponivel) {
            System.out.println("Quantidade suficiente");
        } else {
            System.out.println("Quantidade insuficiente");
        }

        // Retirar produtos
        int quantidadeARetirar = 300;
        boolean retiradoComSucesso = total.retirarProduto(quantidadeARetirar);
        if (retiradoComSucesso) {
            System.out.println("Retirada realizada com sucesso.");
        } else {
            System.out.println("Não foi possível retirar");
        }
    }
}
