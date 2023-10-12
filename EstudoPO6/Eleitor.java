public class Eleitor {
    private String nome;
    private int idade;

    public Eleitor (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String verificar() {
        if (idade < 16) {
            return "Eleitor não pode votar";
        } else if (idade >= 16 && idade <= 65) {
            return "Eleitor deve votar";
        } else if (idade > 65) {
            return "Voto facultativo";
        } else {
            return "Erro!";
        }
    }

    public String imprimir() {
        return verificar();
    }
}