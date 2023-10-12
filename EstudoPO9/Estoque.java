public class Estoque {
    private int codigo;
    private double valor;
    private int quantidade;

    public Estoque(int codigo, double valor, int quantidade) {
        this.codigo = codigo;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarProduto(int quantidadeProdutos) {
        if (quantidadeProdutos <= 0) {
            return; //não retorna nada caso for menor ou igual a 0
        }

        quantidade += quantidadeProdutos; //esta abaixo do if pois ele (return) ira interronper antes de fazer os calculos
    }

    public boolean verificarDisponibilidade(int disponibilidade) {
        return quantidade > 0 && quantidade >= disponibilidade;
    }

    public boolean retirarProduto(int retirar) {
        return quantidade > 0 && quantidade >= retirar;
    }
}