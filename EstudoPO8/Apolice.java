public class Apolice {
    private String nome;
    private int idade;
    private double valorPremio;

    public Apolice (String nome, int idade, double valorPremio) {
        this.nome = nome;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public String imprimir() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nValor Premio: " + valorPremio + "\n";
    }

    public void calcularPremio() {
        if (idade >= 18 && idade <= 25) {
            valorPremio += (valorPremio * 20) / 100;
        } else if (idade > 25 && idade <= 36) {
            valorPremio += (valorPremio * 15) / 100;
        } else if (idade > 36) {
            valorPremio += (valorPremio * 10) / 100;
        } 
    }

    public void oferecerDesconto(String cidade) { //recebe o parametro cidade
        if (cidade.equals("Ilhota")) {
            valorPremio = valorPremio - (valorPremio * 0.05);
        } else if (cidade.equals("Blumenau")) {
            valorPremio = valorPremio - (valorPremio * 0.03);
        } else if (cidade.equals("Itajaí")) {
            valorPremio = valorPremio - (valorPremio * 0.01);
        }
    }
}