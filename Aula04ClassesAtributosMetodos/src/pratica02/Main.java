package pratica02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente();
        ContaCorrente conta = new ContaCorrente();
        Endereco endereco = new Endereco();

        System.out.println("Nome: ");
        cliente.nome = entrada.nextLine();

        System.out.println("CPF: ");
        cliente.CPF = entrada.nextLine();

        System.out.println("Logradouro: ");
        endereco.logradouro = entrada.nextLine();

        System.out.println("Numero: ");
        endereco.numero = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Complemento: ");
        endereco.complemento = entrada.nextLine();

        System.out.println("CEP: ");
        endereco.cep = entrada.nextLine();

        //adicionando endereço
        cliente.endereco = endereco;

        System.out.println("Digite o valor de deposito: ");
        double deposito = entrada.nextDouble();
        conta.deposito(deposito);

        System.out.println("Saldo atual: " + conta.retornarSaldo());

        System.out.println("Digite o valor de retirada: ");
        double retirada = entrada.nextDouble();
        conta.retirar(retirada);

        System.out.println("Saldo atual: " + conta.retornarSaldo());

        System.out.println("\nDados do Cliente:");
        cliente.retornarDadosClientes();

        System.out.println("\nEndereco:");


    }
}
