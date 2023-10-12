//Nome: Beatriz Moresco Joaquim
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularIrpf() {
        double imposto = 0.0;

        if (salario <= 1903.98) {
            imposto = 0.0;
        } else if (salario <= 2826.65) {
            imposto = (salario - 1903.99) * 0.075;
        } else if (salario <= 3751.05) {
            imposto = (salario - 2826.66) * 0.15 + 922.67 * 0.075;
        } else if (salario <= 4664.68) {
            imposto = (salario - 3751.06) * 0.225 + 924.39 * 0.15 + 922.67 * 0.075;
        } else {
            imposto = (salario - 4664.69) * 0.275 + 248.94 * 0.225 + 924.39 * 0.15 + 922.67 * 0.075;
        }
        return imposto;
    }

    public String imprimir() {
        return "Nome: " + nome + "\nSalário: R$" + salario + "\nIRPF: R$" + calcularIrpf();
    }
}