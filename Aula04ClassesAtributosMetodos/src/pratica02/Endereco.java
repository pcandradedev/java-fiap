package pratica02;

public class Endereco {
     String logradouro;
     int numero;
     String complemento;
     String cep;

    public Endereco() {

    }

    public Endereco(String logradouro, int numero, String complemento, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public void retornarDadoss() {
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Numero: " + numero);
        System.out.println("Complemento: " + complemento);
        System.out.println("CEP: " + cep);
    }
}
