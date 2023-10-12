//Nome: Beatriz Moresco Joaquim
public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    private String cor;
    private int ano;
    private double preco;
    private int localizacao;

    public Carro(String modelo, String marca, String placa, String cor, int ano, double preco, int localizacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.localizacao = localizacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

    public static Carro carroCaroAno(Carro[] carros, int ano) {
        Carro carroMaisCaro = null;
        double precoMaisAlto = 0.0;

        for (int i = 0; i < carros.length; i++) {
            Carro carro = carros[i];
            if (carro.getAno() == ano) {
                if (carro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = carro.getPreco();
                    carroMaisCaro = carro;
                }
            }
        }
        return carroMaisCaro;
    }

    public static String listarCarrosMarcaPreco(Carro[] carros, String marca, double precoMin, double precoMax) {
        
        String respostas = "\nTodos os carros da marca " + marca + " entre " + precoMax + " e " + precoMin + " reais: ";

        for (int i = 0; i < carros.length; i++) {
            Carro carro = carros[i];
            
            if (carro.getMarca().equalsIgnoreCase(marca) && carro.getPreco() >= precoMin && carro.getPreco() <= precoMax) {
                respostas += "\nModelo = " + carro.getModelo() + ", Marca = " + carro.getMarca() + ", Placa = " + carro.getPlaca() + ", Cor = " + carro.getCor() + ", Ano = " + carro.getAno() + ", Preço = R$ " + carro.getPreco() + ", Localização = " + carro.getLocalizacao();
            }
        }
    
        return respostas;
    }
    

    public static String[] listarCarrosCarosBaratosLocal(Carro[] carros, int localizacao) {
        Carro carroMaisCaro = null;
        double precoMaisAlto = 0.0;
        Carro carroMaisBarato = null;
        double precoMaisBaixo = Double.MAX_VALUE;
        
        String[] respostas = new String[2];

        for (int i = 0; i < carros.length; i++) {
            Carro carro = carros[i];
            if (carro.getLocalizacao() == localizacao) {
                double preco = carro.getPreco();
                if (preco > precoMaisAlto) {
                    precoMaisAlto = preco;
                    carroMaisCaro = carro;
                }
                if (preco < precoMaisBaixo) {
                    precoMaisBaixo = preco;
                    carroMaisBarato = carro;
                }
            }
        }

        if (carroMaisCaro != null) {
            respostas[0] = "\nCarro mais caro na localização " + localizacao + ": " + "\nModelo = " + carroMaisCaro.getModelo() + ", Marca = " + carroMaisCaro.getMarca() + ", Placa = " + carroMaisCaro.getPlaca() + ", Cor = " + carroMaisCaro.getCor() + ", Ano = " + carroMaisCaro.getAno() + ", Preço = R$ " + carroMaisCaro.getPreco();
        }

        if (carroMaisBarato != null) {
           respostas[1] = "\nCarro mais barato na localização " + localizacao + ": " + "\nModelo = " + carroMaisBarato.getModelo() + ", Marca = " + carroMaisBarato.getMarca() + ", Placa = " + carroMaisBarato.getPlaca() + ", Cor = " + carroMaisBarato.getCor() + ", Ano = " + carroMaisBarato.getAno() + ", Preço = R$ " + carroMaisBarato.getPreco();
        }

        return respostas;
    }
}


