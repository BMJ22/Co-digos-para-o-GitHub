public class ModeloDeComputador {
    private double processador;
    private int memoria;
    private int discoRigido;
    private int monitor;

    public ModeloDeComputador (double processador, int memoria, int discoRigido, int monitor) {
        this.processador = processador;
        this.memoria = memoria;
        this.discoRigido = discoRigido;
        this.monitor = monitor;
    }

    public double calcularPreco () {
        int valorPlacaMae = 800;
        int valorProcessador = 0;
        int valorMemoria = 0;
        int valorDiscoRigido = 0;
        int valorMonitor = 0;

        if (processador == 1.6) {
            valorProcessador = 700;
        } else if (processador == 2.23) {
            valorProcessador = 830;
        } else if (processador == 2.56) {
            valorProcessador = 910;
        } else {
            throw new IllegalArgumentException("Erro!");
        }

        if (memoria == 2) {
            valorMemoria = 350;
        } else if (memoria == 4 || memoria == 6 || memoria == 8) {
            valorMemoria = (memoria / 2) * 350;
        } else {
            throw new IllegalArgumentException("Erro!");
        }

        if (discoRigido == 320) {
            valorDiscoRigido = 300;
        } else if (discoRigido == 500) {
            valorDiscoRigido = 420;
        } else if (discoRigido == 750) {
            valorDiscoRigido = 500;
        } else {
            throw new IllegalArgumentException("Erro!");
        }

        if (monitor == 19) {
            valorMonitor = 320;
        } else if (monitor == 21) {
            valorMonitor = 520;
        } else {
            throw new IllegalArgumentException("Erro!");
        }

        return valorPlacaMae + valorProcessador + valorMemoria + valorDiscoRigido + valorMonitor;
    }

    public String resposta() {
        return "Configuração do Computador:\n" +
            "Processador: " + this.processador + "\n" +
            "Memória RAM: " + this.memoria + "GB\n" +
            "Disco Rígido: " + this.discoRigido + "GB\n" +
            "Tamanho do Monitor: " + this.monitor + " polegadas\n" +
            "Preço Total: R$" + this.calcularPreco();
    }
}

/*Escreva uma classe ModeloDeComputador que encapsule valores que definam a configuração de um microcomputador (tipo de processador, memória RAM, tamanho do disco rígido, tamanho do monitor, por exemplo). Essa classe deve ter um método calculaPreço que calcule o preço do computador como sendo a soma do custo de seus componentes:
􏰀 Placa-mãe: R$800
􏰀 Opções de processadores: 1.67Mhz a R$700, 2.23Mhz a R$830, 2.56Mhz a R$910
􏰀 Opções de memória: 2, 4, 6 ou 8Gb, cada 2Gb custa R$350.
􏰀 Opções de disco rígido: 320Gb a R$300, 5000Gb a R$420, 750Gb a R$500.
􏰀 Opções de monitor: 19 polegadas a R$320, 21 polegadas a R$520*/