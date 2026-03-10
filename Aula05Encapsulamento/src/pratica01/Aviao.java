package pratica01;

public class Aviao {

    private String modelo;
    private int quantidadeLugares;
    private String prefio;
    private double comprimento;
    private int anoFabricacao;
    private Cor cor;
    private int quantidadeTurbinas;

    public Aviao(String modelo, int quantidadeLugares, String prefio, double comprimento, int anoFabricacao, Cor cor, int quantidadeTurbinas) {
        this.modelo = modelo;
        this.quantidadeLugares = quantidadeLugares;
        this.prefio = prefio;
        this.comprimento = comprimento;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.quantidadeTurbinas = quantidadeTurbinas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadeLugares() {
        return quantidadeLugares;
    }

    public void setQuantidadeLugares(int quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }

    public String getPrefio() {
        return prefio;
    }

    public void setPrefio(String prefio) {
        this.prefio = prefio;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getQuantidadeTurbinas() {
        return quantidadeTurbinas;
    }

    public void setQuantidadeTurbinas(int quantidadeTurbinas) {
        this.quantidadeTurbinas = quantidadeTurbinas;
    }
}
