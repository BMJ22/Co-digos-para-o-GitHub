public class DiaSemana {
    private int ano;
    private int dia;
    private int mes;

    public DiaSemana(int ano, int dia, int mes) {
        setAno(ano);
        setDia(dia);
        setMes(mes);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String algoritmo() {
        int valor = ano + dia + 3 * (mes - 1) - 1;
        if (mes < 3) {
            ano = ano - 1;
        } else {
            valor = valor - (int)(0.4 * mes + 2.3);
        }
        valor = valor + (ano / 4) - (int)(0.75 * (1 + (ano / 100)));
        valor = valor % 7;

        if (valor == 0) {
            return "domingo";
        } else if (valor == 1) {
            return "segunda-feira";
        } else if (valor == 2) {
            return "terça-feira";
        } else if (valor == 3) {
            return "quarta-feira";
        } else if (valor == 4) {
            return "quinta-feira";
        } else if (valor == 5) {
            return "sexta-feira";
        } else if (valor == 6) {
            return "sábado";
        } else {
            return "Erro!";
        }
    }
}

/*Escreva um método que retorne uma String com o dia da semana, dado como argumentos o ano, o dia e o mês. Utilize o algoritmo abaixo:

valor = ano + dia + 3(mês -1) -1;

Se mês < 3 então ano = ano -1;

Senão valor = valor – (int)(0.4 x mês + 2.3);

valor = valor + (int) ano – (int)(0.75 x (1 + ano )

4 100

valor = valor MOD 7 Se valor = 0 então “domingo” Se valor = 1 então “segunda-feira”

...

Exemplo de execução:

Exemplo de entrada Saída para o exemplo de entrada calculaDiaDaSemana(2010, 2, 2) 2 – “terça-feira” calculaDiaDaSemana(2004, 1, 9) 3 – “quarta-feira”*/