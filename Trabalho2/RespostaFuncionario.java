public class RespostaFuncionario {
    public static void main(String[] args) {
        String[] nomes = {"Funcionário 1", "Funcionário 2", "Funcionário 3", "Funcionário 4", "Funcionário 5"};
        double[] salarios = {2000.0, 2500.0, 3000.0, 3500.0, 4000.0};
        Funcionario[] exibeQuestao1e2 = new Funcionario[5];
        
        double maiorIrpf = 0.0;
        String funcionarioMaiorIrpf = "";

        for (int i = 0; i < 5; i++) {
            String nome = nomes[i];
            double salario = salarios[i];

            Funcionario funcionario = new Funcionario(nome, salario);
            double irpf = funcionario.calcularIrpf();
            System.out.println(funcionario.imprimir());

            if (irpf > maiorIrpf) {
                maiorIrpf = irpf;
                funcionarioMaiorIrpf = funcionario.imprimir();
            }

            exibeQuestao1e2[i] = funcionario;
        }

        System.out.println("\nFuncionário(s) que paga(m) mais IRPF:\n" + funcionarioMaiorIrpf);
    }
}
