public class AnoB {
    private int ano;

    public AnoB(int ano) {
        setAno(ano);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int bissexto() {
        if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public String resposta() {
        int resultado = bissexto(); //rever 
        if (resultado == 1) {
            return "Retornou 1, então o ano é Bissexto!";
        } else if (resultado == 0){
            return "Retornou 0, então o ano não é Bissexto!";
        } else {
            return "Erro!";
        }
        
    }

}