public class Computador {
    private int numeroSerial;
    private int capacidadeHD;
    private int quantidadeMemoria;

    public Computador(int numeroSerial, int capacidadeHD, int quantidadeMemoria) {
        setNumeroSerial(numeroSerial);
        setCapacidadeHD(capacidadeHD);
        setQuantidadeMemoria(quantidadeMemoria);
    }

    public int getNumeroSerial() {
        return numeroSerial;
    }

    public void setNumeroSerial(int numeroSerial) throws IllegalArgumentException {
        if (numeroSerial < 0) {
            throw new IllegalArgumentException("Erro!");
        }
        this.numeroSerial = numeroSerial;
    }

    public int getCapacidadeHD() {
        return capacidadeHD;
    }

    public void setCapacidadeHD(int capacidadeHD) throws IllegalArgumentException {
        if (capacidadeHD < 0) {
            throw new IllegalArgumentException("Erro!");
        }
        this.capacidadeHD = capacidadeHD;
    }

    public int getQuantidadeMemoria() {
        return quantidadeMemoria;
    }

    public void setQuantidadeMemoria(int quantidadeMemoria) throws IllegalStateException {
        if (quantidadeMemoria < 0) {
            throw new IllegalArgumentException("Erro!");
        }
        this.quantidadeMemoria = quantidadeMemoria;
    }

    public String toString() {
        return "Numero Serial: " + this.getNumeroSerial() + "\nCapaciade HD: " + this.getCapacidadeHD() + "\nQuantidade Memória: " + this.getQuantidadeMemoria();
    }
}