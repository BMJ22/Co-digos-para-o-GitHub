public class Lutador {
    //definindo e declarando atributos
    private String nome;
    private double peso;

    //criando os metodos acessores e modificadores dos atributos
    public Lutador(String nome, double peso) {
        setNome(nome);
        setPeso(peso);
    }

    //setNome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //getNome
    public String getNome() {
        return this.nome;
    }

    //setPeso
    public void setPeso(double peso) {
        this.peso = peso;
    }

    //getPeso
    public double getPeso() {
        return this.peso;
    } 
}
