public class Retangulo {
    private Ponto ponto1;
    private Ponto ponto2;

    public Retangulo(Ponto ponto1, Ponto ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public double calcularArea() {
        double largura = Math.abs(ponto1.getX1() - ponto2.getX2()); //Math.abs(5) retorna 5 porque 5 é positivo e sua distância em relação a zero é 5. Math.abs(-5) também retorna 5 porque o valor absoluto de -5 é 5.
        double altura = Math.abs(ponto1.getY1() - ponto2.getY2());
        double area = largura * altura;
        return area;
    }
}
/* Crie uma classe Retangulo para representar um retângulo cujos pontos opostos sejam duas instâncias da classe Ponto. Crie um método para calcular a área do retângulo. */