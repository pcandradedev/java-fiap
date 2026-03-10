package Pratico02;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia= dia;
        }else {
            this.dia = 1;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes= mes;
        }else {
            this.mes= 1;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano >= 0)
            this.ano = ano;
        else
            this.ano = 2023;
    }

    public String getNomeMes() {

        switch (mes) {
            case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mês inválido";
        }

    }

    public String getDataFormatada() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
