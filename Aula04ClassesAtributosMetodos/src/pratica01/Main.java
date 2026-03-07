package pratica01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno1.nome = entrada.nextLine();

        System.out.println("Digite a matricula do aluno: ");
        aluno1.matricula = entrada.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        aluno1.calculaMedia(nota1, nota2, nota3);

        aluno1.exibirInformacoes();
    }
}
