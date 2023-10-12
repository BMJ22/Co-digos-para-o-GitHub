public class Ponto {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Ponto (double x1, double y1, double x2, double y2) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double calcular() {
        double distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)); //rever - Math.pow() = potência e Math.sqrt() = raiz quadrada.
        return distancia;
    }

    public String resposta() {
        return calcular() + "\nA distância pode ser negativa? \nNão, porque a definição de distância no contexto matemático é uma medida positiva que representa a extensão entre dois pontos. A distância é uma quantidade escalar que não possui direção, e, portanto, não faz sentido que seja negativa. Baseia-se no teorema de Pitágoras, que estabelece que a hipotenusa de um triângulo retângulo (o lado oposto ao ângulo reto) é sempre um valor positivo.";
    }

}