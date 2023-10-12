public class Lutador {
    private String nome;
    private double peso;

    public Lutador(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String categoria() {
        if (peso <= 54) {
            return "Pluma";
        } else if (peso > 54 && peso <= 60) {
            return "Leve";
        } else if (peso > 60 && peso <= 75) {
            return "Meio-leve";
        } else if (peso > 75) {
            return "Pesado";
        } else {
            return "Erro!";
        }
    }

    public String imprimir() {
        return "O lutador " + nome + " está na categoria " + categoria();
    }
}