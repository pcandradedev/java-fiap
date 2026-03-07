package pratica02;

public class Cliente {

    String nome;
    String CPF;
    Endereco endereco;

    //Construtor sem Parametro.
    public Cliente() {

    }

    //Construtor.
    public Cliente(String nome, String CPF, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public void retornarDadosClientes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        endereco.retornarDadoss();
    }


}
