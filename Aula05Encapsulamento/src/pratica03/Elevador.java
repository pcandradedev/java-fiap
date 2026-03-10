package pratica03;

public class Elevador {

    private int andarAtual = 0;
    private int totalAndar;
    private int capacidade;
    private int pessoasPresentes = 0;

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndar() {
        return totalAndar;
    }

    public void setTotalAndar(int totalAndar) {
        this.totalAndar = totalAndar;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void inicializa(int capacidade, int totalAndar) {
        this.capacidade = 0;
        this.totalAndar = 0;
    }

    public void entra() {
        if(pessoasPresentes < capacidade) {
            pessoasPresentes++;
        }
    }

    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
        }
    }

    public void sobe() {
        if (andarAtual < totalAndar ) {
            andarAtual++;
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
        }
    }


}
