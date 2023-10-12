//Nome: Beatriz Moresco Joaquim
public class RevendedoraQueryCar {
    public static void main(String[] args) {
        Carro[] carros = new Carro[5];

        carros[0] = new Carro("Gol", "VW", "MMM001", "Preta", 2009, 25000, 1);
        carros[1] = new Carro("Fox", "VW", "LML002", "Vermelha", 2010, 30000, 2);
        carros[2] = new Carro("Uno", "Fiat", "MLM003", "Cinza", 2011, 32000, 3);
        carros[3] = new Carro("Fiesta", "Ford", "LLL004", "Branca", 2009, 29000, 1);
        carros[4] = new Carro("Palio", "Fiat", "KKK345", "Amarelo", 2011, 26000, 1);

        Carro carroCaroDoAno = Carro.carroCaroAno(carros, 2011);
        System.out.println("Carro mais caro do ano 2011: \n" + "Modelo = " + carroCaroDoAno.getModelo() + ", Marca = " + carroCaroDoAno.getMarca() + ", Placa = " + carroCaroDoAno.getPlaca() + ", Cor = " + carroCaroDoAno.getCor() + ", Preço = R$ " + carroCaroDoAno.getPreco() + ", Localização = " + carroCaroDoAno.getLocalizacao());
    
        String listaCarrosMarcaPreco = Carro.listarCarrosMarcaPreco(carros, "Fiat", 26000, 32000);
        System.out.println(listaCarrosMarcaPreco);
    
        String[] carrosCarosBaratosLocal = Carro.listarCarrosCarosBaratosLocal(carros, 1);
        System.out.println(carrosCarosBaratosLocal[0]);
        System.out.println(carrosCarosBaratosLocal[1]);
    }
}