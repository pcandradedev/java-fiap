package pratica02;

public class ContaCorrente {
    public double saldo;
    Cliente titular;

    public ContaCorrente() {

    }

    public ContaCorrente(double saldo, Cliente titular) {
        this.saldo = 0;
        this.titular = titular;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void retirar(double valor) {
        saldo -= valor;
    }

    //corrigir
    public double retornarSaldo() {
        return saldo;
    }


}
