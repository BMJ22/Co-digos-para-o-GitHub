public class Soma {
    private int valor1;
    private int valor2;

    public Soma(int valor1, int valor2) {
        setValor1(valor1);
        setValor2(valor2);
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int somar() {
        int somaTotal = valor1 + valor2;
        return somaTotal;
    }

    public double somar(double valor1, double valor2) {
        double somaTotal = valor1 + valor2;
        return somaTotal;
    }

    public String resposta() {
        int totalI = somar();
        double totalD = somar(2.5, 4.5);
        return "Total da soma int: " + totalI + " Total da soma double: " + totalD;
    }
}

//Escreva um método que some dois valores do tipo int passados como parâmetros. Sobrecarregue o método para que ele consiga também somar valores do tipo double. Cada método retorna o resultado da soma.